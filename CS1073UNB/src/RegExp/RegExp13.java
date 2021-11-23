package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class RegExp13 {
    public static void main(String[] args) {
        /*
        * Regular Expression instance
        * A classic jieba program
        * "I.....I want...ssssssstu...ddddy....Java!" to "I want to study java"
        * */
        String content = "I.....I want ...ssssssstu...ddddy ....Java!";
        String regExp = "\\.";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        content = matcher.replaceAll("");
        System.out.println(content);

        //分步
/*         regExp = "(.)\\1+";
        pattern = Pattern.compile(regExp);
        matcher = pattern.matcher(content);
        content = matcher.replaceAll("$1");*/

        //链式
        //content = Pattern.compile("(.)\\1+").matcher(content).replaceAll("$1");

        content = content.replaceAll("(.)\\1+", "$1");
        System.out.println(content);
    }
}
