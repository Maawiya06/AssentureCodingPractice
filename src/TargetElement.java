public class TargetElement {

    public static boolean solve(int[] arr, int target){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int[] arr = new int[] {10, 5, 18, 30, 45};
        int target = 59;
        System.out.println(solve(arr, target));
    }
}
