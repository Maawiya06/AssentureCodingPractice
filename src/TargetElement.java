public class TargetElement {

    public static boolean solve(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    // apply binary search
    public static boolean solve1(int[] arr, int target){
        int n = arr.length;
        int s = 0;
        int e = n - 1;

        for(int i = 0; i < n; i++){
            int mid = s + (e - s)/2;

            if(arr[mid] == target){
                return true;
            }
            else if(arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = new int[] {5, 10, 15, 20, 25};
        int target = 20;
        System.out.println(solve1(arr, target));
    }
}
