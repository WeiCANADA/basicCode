package week12;

/**
 * @author: Wei Liu
 */
public class String_Counters {
    public static void main(String[] args) {
        int times = 0;
        char letter = 0;
        //int[] intArray = lettercounter("abac123");
        int[] intArray = lettersCounter("aaaaaaAAAAAA123");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(i + "/" + intArray[i]);
        }
        //Travers the array to find the maximum value and the corresponding index
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > times){
                times = intArray[i];
                if (i < 26) {
                    letter =(char) (i + 'A');
                    System.out.println(letter);
                } else {
                    letter = (char)( (i - 26) + 'a');
                    System.out.println(letter);
                }
            }
        }

        System.out.println( (letter + "") + times);



/*        int others = 0;
        System.out.print("Enter a sentence:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        //call upperLetterCount(String str)
        int[] array = upperLetterCount(str);
        //print
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) (i + 'A'));
            System.out.print(": " + array[i]+'\t');
        }
        System.out.println();
        //call lowerLetterCount(String str)
        array = lowerLetterCount(str);
        for (int i = 0; i < array.length; i++) {
            System.out.print((char) (i + 'a'));
            System.out.print(": " + array[i] + "\t");
        }
        System.out.println();
        String regExp = "[^A-Za-z]+?";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(str);
        while (matcher.find()) {
            others++;
            System.out.println("fund：" + matcher.group(0));
        }
        System.out.println();
        System.out.println("Non-alphabetic characters: " + others);
        */
    }


    private static int[] upperLetterCounter(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] upperLetters = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('A' <= current && current <= 'Z') {
                upperLetters[current - 'A']++;
            }
        }
        return upperLetters;
    }

    private static int[] lowerLetterCounter(String str) {
        final int NUMCHARS = 26;
        char current;
        int[] lowerLetters = new int[NUMCHARS];
        for (int i = 0; i < str.length(); i++) {
            current = str.charAt(i);
            if ('a' <= current && current <= 'z') {
                lowerLetters[current - 'a']++;
            }

        }
        return lowerLetters;
    }

    /**
     * @param str A String
     * @return int[] i   the indexes represent the zimu (combine the upper cases and lower cases)
     * the value i represent the show times of each zimu in the string
     */
    public static int[] lettersCounter(String str) {
        str = str.replaceAll("[^A-Za-z]", "");
        final int NUMCHARS = 52;
        char current;
        int[] letters = new int[NUMCHARS];
        //get the lower letter array
        int[] temp1 = lowerLetterCounter(str);
        //get the upper letters array
        int[] temp2 = upperLetterCounter(str);
        //store the lower and upper letters in  new array and return the new array
        for (int i = 0; i < temp2.length; i++) {
                letters[i] = temp2[i];
            }
        for (int i = 0; i < temp1.length; i++) {
            letters[i + 26] = temp1[i];
        }
        return letters;
    }
}
