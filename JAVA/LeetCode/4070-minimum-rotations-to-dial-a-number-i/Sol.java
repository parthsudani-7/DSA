class Solution {
    public int minRotations(String s) {
        int currentPointerPosition = 0;
        int minimumTotalRotationsRequired = 0;

        for (char requiredDigitCharacter : s.toCharArray()) {
            int requiredDigitPosition = requiredDigitCharacter - '0';
            minimumTotalRotationsRequired += calculateMinimumCircularDistance(
                currentPointerPosition,
                requiredDigitPosition
            );
            currentPointerPosition = requiredDigitPosition;
        }

        return minimumTotalRotationsRequired;
    }

    private int calculateMinimumCircularDistance(
        int currentPointerPosition,
        int requiredDigitPosition
    ) {
        int clockwiseRotationDistance =
            Math.abs(currentPointerPosition - requiredDigitPosition);

        int anticlockwiseRotationDistance =
            10 - clockwiseRotationDistance;

        return Math.min(
            clockwiseRotationDistance,
            anticlockwiseRotationDistance
        );
    }
}
