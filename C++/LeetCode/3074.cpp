class Solution {
public:
    int minimumBoxes(vector<int>& apple, vector<int>& capacity) {

        int totalApples = 0;

        for (int i = 0; i < apple.size(); i++) {
            totalApples = totalApples + apple[i];
        }

        sort(capacity.begin(), capacity.end());
        reverse(capacity.begin(), capacity.end());

        int currentCapacity = 0;
        int boxCount = 0;

        for (int i = 0; i < capacity.size(); i++) {
            currentCapacity = currentCapacity + capacity[i];
            boxCount = boxCount + 1;

            if (currentCapacity >= totalApples) {
                return boxCount;
            }
        }

        return boxCount;
    }
};
