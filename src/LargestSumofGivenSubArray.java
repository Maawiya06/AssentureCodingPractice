public class LargestSumofGivenSubArray {

    public static void main(String args[]){

        int[] arr = new int[] {2, 3, -8, 7, -1, 2, 3};
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
