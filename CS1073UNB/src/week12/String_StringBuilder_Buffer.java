package week12;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class String_StringBuilder_Buffer {
    public static void main(String[] args) {
        String str = "abcefc";
        StringBuilder strB = new StringBuilder(str);

        //append(char[] str,int offset, int len)
        char[] charA = { 'd', 'e', 'f' };
        System.out.println(strB +
                "/ append(char[] str,int offset, int len)/ " +
                strB.append(charA, 1, charA.length-1));//abcefcef
        //append(boolean b)
        System.out.println(strB +
                "/ append(boolean true)/ " +
                strB.append(true));//abcefctrue
        //substring(int start, int end)
        System.out.println(strB +
                "/ substring(int start 1, int end 3)/ " +
                strB.substring(1, 3));//bc
        //insert(offset, float)
        System.out.println(strB +
                "/ insert(offset, float 0.7f)/ " +
                strB.insert(strB.length(), .7f));//abcefctrue0.7

        //indexof(String str)
        System.out.println(strB +
                "/ indexof(String e)/ " +
                strB.indexOf("e"));//3
        //lastIndexOf(String str)
        System.out.println(strB +
                "/ lastIndexOf(String e)/ " +
                strB.lastIndexOf("e"));//5
        //reverse()
        System.out.println(strB + "/ reverse()/ " + strB.reverse());
        //replace(int start, int end, String str)
        System.out.println(strB.replace(0, 3, ""));


    }
}
