public class EqualString {

    public static boolean ArrayStringAreEqual(String[] word1, String[] word2){

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        for(int i = 0; i < word1.length; i++){
            str1.append(word1[i]);
        }
        for(int i = 0; i < word2.length; i++){
            str2.append(word2[i]);
        }

        if(str1.toString().equals(str2.toString())){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        String[] word1 = {"a", "bc"};
        String[] word2 = {"ab", "d"};

        boolean result = ArrayStringAreEqual(word1, word2);
        System.out.println("Are equal: " + result);
    }
}
