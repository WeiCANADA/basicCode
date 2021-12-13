import java.util.Locale;

/**
 * 一个方法，参数为一个字符串，统计出现频率最高的字母并返回
 * 第一步：去除字符串中的非字母
 * 第二步：将字符串转为字符数组 char[] chars = str.toCharArray();
 * 第三步：创建一个新数组 int[] count = new int[128];
 * 第四步：遍历字符串数组chars，ASCII码作为count 的index， 记录次数
 * 第五步：遍历数组count 找出最大值的value， index 即为出现频率最高的字母并返回
 * @author: Wei Liu
 */
public class CharCounter {

    /**
     * @param str A String
     * @return  The frequently letter
     */
    public static String counter(String str) {
        //Strip all non-letter characters
        str = str.replaceAll("[^A-Za-z]", "");
       str = str.toLowerCase(Locale.ROOT);
        char[] chars = str.toCharArray();
        //index represent the character code, value is the times
        int[] count = new int[128];
        for (char cha : chars) {
            count[cha]++;
        }
        // find the most frequently (index)letter and value (times)
        int times = 0;
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > times) {
                times = count[i];
                index = i;
            }
        }
        return (char) index + "";
    }
}