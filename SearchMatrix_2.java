public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int row = matrix.length - 1;
        int column = matrix[0].length - 1;
        return search(matrix, 0, column, target);
    }
    
    public boolean search(int[][] matrix, int i, int j, int target){
        
        if (i < 0 || i >= matrix.length || j < 0 || j >= matrix[0].length) {
            return false;
        }
        if (matrix[i][j] == target) {
            return true;
        } else if (matrix[i][j] > target) {
            return search(matrix, i, j - 1, target);
        } else {
            return search(matrix, i + 1, j, target);
        }
    }
}