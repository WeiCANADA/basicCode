package week12;

public class String_LettersFrequency {
    public static void main(String[] args) {
        for(int i : lettersFrequency("avc"));
    }
    /**
     * @return int[] i   the indexes represent the zimu (combine the upper cases and lower cases)
     * the value i represent the show times of each zimu in the string
     * @param str A String
     * */
    public static int[] lettersFrequency(String str){
        str = str.replaceAll("[^A-Za-z]", "");
        int[] lettersFreq = new int[26];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char check = str.charAt(i);
            int index = (check - 'A')|(check - 'a');
            if(0<= index && index <= 25){
                lettersFreq[index] ++;
            }
        }
        return lettersFreq;
    }
}
