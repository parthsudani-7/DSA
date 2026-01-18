#include <bits/stdc++.h>
using namespace std;

class SegmentTree {
public:
    int n;
    vector<int> cnt;
    vector<long long> covered;
    vector<int> xs;

    SegmentTree() {}

    SegmentTree(const vector<int>& x) {
        xs = x;
        n = (int)xs.size() - 1;
        cnt.assign(4 * n, 0);
        covered.assign(4 * n, 0);
    }

    void pull(int pos, int l, int r) {
        if (cnt[pos] > 0) {
            covered[pos] = (long long)xs[r + 1] - xs[l];
        } else {
            if (l == r) covered[pos] = 0;
            else covered[pos] = covered[pos * 2 + 1] + covered[pos * 2 + 2];
        }
    }

    void modify(int ql, int qr, int val, int l, int r, int pos) {
        if (xs[r + 1] <= ql || xs[l] >= qr) return;
        if (ql <= xs[l] && xs[r + 1] <= qr) {
            cnt[pos] += val;
            pull(pos, l, r);
            return;
        }
        int mid = (l + r) / 2;
        modify(ql, qr, val, l, mid, pos * 2 + 1);
        modify(ql, qr, val, mid + 1, r, pos * 2 + 2);
        pull(pos, l, r);
    }

    void update(int ql, int qr, int val) {
        modify(ql, qr, val, 0, n - 1, 0);
    }

    long long query() {
        return covered[0];
    }
};

class Solution {
public:
    double separateSquares(vector<vector<int>>& squares) {
        vector<array<int, 4>> events;
        vector<int> xs;

        events.reserve(squares.size() * 2);
        xs.reserve(squares.size() * 2);

        for (auto &sq : squares) {
            int x = sq[0], y = sq[1], l = sq[2];
            int xr = x + l;
            events.push_back({y, 1, x, xr});
            events.push_back({y + l, -1, x, xr});
            xs.push_back(x);
            xs.push_back(xr);
        }

        sort(xs.begin(), xs.end());
        xs.erase(unique(xs.begin(), xs.end()), xs.end());

        sort(events.begin(), events.end(), [](const auto &a, const auto &b) {
            return a[0] < b[0];
        });

        SegmentTree seg(xs);

        int m = (int)events.size();
        vector<int> ys;
        ys.reserve(m);

        for (auto &e : events) ys.push_back(e[0]);

        vector<double> areaAt(m, 0.0);
        vector<long long> widthAfter(m, 0);

        double area = 0.0;
        int prevY = ys[0];

        int i = 0;
        while (i < m) {
            int y = ys[i];
            long long w = seg.query();
            area += (double)w * (y - prevY);

            int j = i;
            while (j < m && ys[j] == y) {
                seg.update(events[j][2], events[j][3], events[j][1]);
                j++;
            }

            areaAt[j - 1] = area;
            widthAfter[j - 1] = seg.query();

            for (int k = i; k < j - 1; k++) {
                areaAt[k] = areaAt[j - 1];
                widthAfter[k] = widthAfter[j - 1];
            }

            prevY = y;
            i = j;
        }

        double totalArea = area;
        double half = totalArea / 2.0;

        i = 0;
        while (i < m) {
            int y = ys[i];
            int j = i;
            while (j < m && ys[j] == y) j++;
            int idx = j - 1;

            double curArea = areaAt[idx];
            if (fabs(curArea - half) <= 1e-12) return (double)y;

            if (curArea > half) {
                double prevArea = 0.0;
                long long prevWidth = 0;
                int prevYval = y;

                if (i > 0) {
                    int p = i - 1;
                    prevArea = areaAt[p];
                    prevWidth = widthAfter[p];
                    prevYval = ys[p];
                }

                if (prevWidth == 0) return (double)y;
                return (double)prevYval + (half - prevArea) / (double)prevWidth;
            }

            i = j;
        }

        return (double)ys.back();
    }
};
