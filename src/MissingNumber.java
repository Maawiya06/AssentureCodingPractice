public class MissingNumber {

    public static Integer missingnumber(int[] arr){
        int n = arr.length;

        int total = (n)*(n + 1)/2;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + arr[i];
        }
        return total - sum;
    }
    public static void main(String args[]){
        int[] arr = new int[]{0 ,1, 2, 3, 5, 6};
        System.out.println("missing number is " + missingnumber(arr));
    }
}
