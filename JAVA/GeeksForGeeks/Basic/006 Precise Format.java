import java.util.*;

class Solution {
    static ArrayList<Float> divisionWithPrecision(float a, float b) {
        ArrayList<Float> res = new ArrayList<>();
        float exact = a / b;
        float rounded = (float) Math.round(exact * 1000) / 1000;
        res.add(exact);
        res.add(rounded);
        return res;
    }
}
