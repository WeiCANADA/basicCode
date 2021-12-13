package RegExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class RegExp12 {
    public static void main(String[] args) {
        //分组，捕获，反向引用 Some examples
        /*examples:
        1.要匹配两个连续的相同的数字： (\\d)\\1
        2.要匹配5个连续的相同的数字： (\\d)\\1{4}
        3.要匹配千位与个位相同，十位与百位相同的数字 5555 5225 1551： (\\d)(\\d)\\2\\1

         */
        String content = "22222unb10031,stu5225,1234,ded11111,ID:12334-111222333";
        content = "Ahoaa";
        int count = 0;

        //String regExp = "(\\d)\\1";
        //String regExp = "(\\d)\\1{4}";
        //String regExp = "(\\d)(\\d)\\2\\1";

        /*
        * 请在String 中检索商品编号，形式如：12334-111222333这样的号码，
        * 要求，前五个是五位数+ “-”号，然后是一个每三位相同的九位数
        * \\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}
        * */
        //String regExp = "\\d{5}-(\\d)\\1{2}(\\d)\\2{2}(\\d)\\3{2}";
        String regExp = "[AaEeIiOoUu]";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        while (matcher.find()){
            count++;
            System.out.println(matcher.group() + count);
        }
    }
}
