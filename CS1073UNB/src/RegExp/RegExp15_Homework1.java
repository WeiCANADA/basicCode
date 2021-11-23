package RegExp;

/**
 * @author Wei Liu
 * @version V1.0
 */
public class RegExp15_Homework1 {
    public static void main(String[] args) {
        /*
         * 判断是否为合法电子邮件
         * only one @
         * a-z A-Z 0-9 . _ - before @
         * After @ 域名只能是英文字母，比如sohu.com or tsinhua.org.cn
         *

         * */

        String content3 = "wei.liu@unb.ca";
        //String regExp = "[\\w-.]{3,16}@([a-zA-Z]+\\.)+[a-zA-Z]+";
        String regExp = "^[\\w-.]{3,16}@([a-zA-Z]+\\.)+[a-zA-Z]+$";
        if (content3.matches(regExp)){
            System.out.println("valid Email address");
        }else {
            System.out.println("invalid Email address");
        }
    }
}
