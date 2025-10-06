public class SearchIn2Darray {

    // binary search
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;

        int low = 0;
        int high = row * col - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midValue = matrix[mid / col][mid % col];

            if (midValue == target) {
                return true;
            } else if (midValue < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {10, 11, 12, 15},
                {17, 19, 20, 22}
        };
        int target = 11;

        SearchIn2Darray sol = new SearchIn2Darray();
        System.out.println("Is Available: " + sol.searchMatrix(matrix, target));
    }
}
