public class LargestSumofGivenSubArray {

    public static void main(String args[]){

        int[] arr = new int[] {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
            if(sum > maxSum){
                maxSum = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        System.out.println(
                "Maximum sum is " + maxSum
        );
    }
}
