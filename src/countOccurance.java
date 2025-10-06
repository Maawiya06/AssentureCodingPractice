public class countOccurance {

    public static void main(String args[]){
        int[] arr = new int[]{1, 2, 5, 6, 2, 2, 8, 5, 0};
        int element = 2;

        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == element){
                count++;
            }
        }
        System.out.println("count is " + count);
    }
}
