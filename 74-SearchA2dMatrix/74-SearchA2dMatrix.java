// Last updated: 09/07/2026, 15:10:10
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int s = 0;
        int e = rows * cols - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int value = matrix[mid / cols][mid % cols];

            if (value == target) {
                return true;
            } else if (value < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return false;
    }
}