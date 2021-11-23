package RegExp;
/*
        * String 类中使用正则表达式
        * 替换功能
        * String class public String replaceAll(String regex, String replacement)
        *
        * example:
        * String content ="2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。" +
                "2001年9月24日，J2EE1.3发布。2002年2月26日，J2SE1.4发布。" +
                "自此Java的计算能力有了大幅提升，与J2SE1.3相比，其多了近62%的类和接口。" +
                "在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、全新的I/OAPI、正则表达式、日志与断言。" +
                "2004年9月30日，J2SE1.5发布，成为Java语言发展史上的又一里程碑。" +
                "为了表示该版本的重要性，J2SE 1.5更名为Java SE 5.0（内部版本号1.5.0），代号为“Tiger”，Tiger包含了从1996年发布1.0版本以来的最重大的更新，" +
                "其中包括泛型支持、基本类型的自动装箱、改进的循环、枚举类型、格式化I/O及可变参数。”；
                *
                * 将 content 中的JDK1.3 JDK1.4 统一替换成JDK
                *
        * */
/**
 * @author Wei Liu
 * @version V1.0
 */
public class RegExp14_StringReg {
    public static void main(String[] args) {
        String content ="2000年5月，JDK1.3、JDK1.4和J2SE1.3相继发布，几周后其获得了Apple公司Mac OS X的工业标准的支持。" +
                "2001年9月24日，J2EE1.3发布。2002年2月26日，J2SE1.4发布。" +
                "自此Java的计算能力有了大幅提升，与J2SE1.3相比，其多了近62%的类和接口。" +
                "在这些新特性当中，还提供了广泛的XML支持、安全套接字（Socket）支持（通过SSL与TLS协议）、全新的I/OAPI、正则表达式、日志与断言。" +
                "2004年9月30日，J2SE1.5发布，成为Java语言发展史上的又一里程碑。" +
                "为了表示该版本的重要性，J2SE 1.5更名为Java SE 5.0（内部版本号1.5.0），代号为“Tiger”，Tiger包含了从1996年发布1.0版本以来的最重大的更新，" +
                "其中包括泛型支持、基本类型的自动装箱、改进的循环、枚举类型、格式化I/O及可变参数.";
        content = content.replaceAll("JDK1\\.3|JDK1\\.4"/*"JDK(?:1.3|1.4)"*/, "JDK");
        System.out.println(content);

        /*
        * 判断功能
        * String Class public boolean matches(String regex）{}
        * 要求验证一个手机号，要求必须是以138 139开头
         * */
        String content1 = "13912345678";
         if(content1.matches("13(8|9)\\d{8}")){
             System.out.println("验证成功");
         }else{
             System.out.println("验证失败");
         }

         /*
         * 判断功能
         * String class : public String[] split(String regEx)
         * String content = "hello#fabc-jack12smith~Beijing"
         * Split by # or - or ~ or numbers
          *
         * */
        String content2 = "hello#fabc-jack12smith~Beijing";
        String[] split = content2.split("#|-|~|\\d+");
        for (String s:split
             ) {
            System.out.println(s);
        }

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

        /*
        *备注
         * String  matches method matches the entire region against the pattern.
         * 看源码
         * String:
         *     public boolean matches(String regex) {
              return Pattern.matches(regex, this);
                }

          Pattern:
          * public static boolean matches(String regex, CharSequence input) {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
        return m.matches();
    }
    *
     * Attempts to match the entire region against the pattern.
        Matcher：
        public boolean matches() {
            return match(from, ENDANCHOR);
        }
 */
    }
}
