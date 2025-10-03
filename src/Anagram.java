public class Anagram {

    public static boolean isAnagram(String s, String t){
        int[] freqTable = new int[256];

        for(int i = 0; i < s.length(); i++){
            freqTable[s.charAt(i)]++;
        }
        for(int i = 0; i < t.length(); i++){
            freqTable[t.charAt(i)]--;
        }

        for(int i = 0; i < 256; i++){
            if(freqTable[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s = "anagram";
        String t = "nagara";

        System.out.println("Is Anagram  " + isAnagram(s, t));
    }
}
