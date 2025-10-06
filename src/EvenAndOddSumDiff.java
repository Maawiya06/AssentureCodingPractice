public class EvenAndOddSumDiff {

    public static double squareRootDiff(int m, int n){

        double evenSum = 0;
        double oddSum = 0;

        for(int i = m; i <= n; i++){
            double squareRoot = Math.sqrt(i);
            if(i % 2 == 0){
                evenSum += squareRoot;
            }
            else{
                oddSum += squareRoot;
            }
        }

        return evenSum - oddSum;
    }

    public static void main(String args[]){
        int m = 1;
        int n = 10;
        double result = squareRootDiff(m, n);
        System.out.println("Diffrence is : " + result);
    }
}
