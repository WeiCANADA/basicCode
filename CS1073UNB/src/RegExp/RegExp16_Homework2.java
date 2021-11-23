package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class RegExp16_Homework2 {
    public static void main(String[] args) {
        /*
        * Verify a num whether is possitive num or negative
        * like 123 -345 34 89 -87.9 -0.01 0.45
        * -?\\d+\\.?\\d*
        * */
        String content = "0.880";
        String regExp = "^[-+]?(([1-9]\\d*)|0)\\.?\\d*$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        if(matcher.find()){
            System.out.println(content + " is valid");
        }else {
            System.out.println(content + "is invalid");
        }
    }
}
