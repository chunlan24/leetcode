public class SearchInsertPosition {
    
    public int searchInsert(int[] A, int target) {
        
        if (A == null || A.length == 0)
        {
            return 0;
        }
        
        int l = 0;
        int r = A.length - 1;
        
        while (l <= r)
        {
            int m = (l + r) / 2;
            if (A[m] == target)
            {
                return m;
            } else if (A[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }
        return l;
    }  

    public static void main (String[] args) {

        int[] array = {1,3,5,6};
        // Arrays.sort(array);
        SearchInsertPosition find = new SearchInsertPosition();
        System.out.println(find.searchInsert(array,5));
        System.out.println(find.searchInsert(array,9));
        System.out.println(find.searchInsert(array,2));
    }
}