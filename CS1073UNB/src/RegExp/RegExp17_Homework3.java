package RegExp;
/*
* 对一个url 进行解析 RegExp17_Homework3
* http://www.sohu.com:8080/abc/index.htm
* a) 要求得到协议 http
* b）域名： www.sohu.com
* c) 端口：8080
* d）文件名 index.htm
* 思路： 分组（3组）分别获取对应值
*
* */

import javax.xml.stream.events.EntityReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Wei Liu
 * @version V1.0
 * @date 2021/11/23
 */
public class RegExp17_Homework3 {
    public static void main(String[] args) {
        String content = "http://www.sohu.com:8080/abc/index.htm";
        String regExp = "^([A-Za-z]+)://([A-Za-z.]+):(\\d+)[\\w-/]*/([\\w.@#$%]+)$";
        Pattern pattern = Pattern.compile(regExp);
        Matcher matcher = pattern.matcher(content);
        //entire region matches,if match ，we get the specific content by group（x）；
        if (matcher.matches()){
            System.out.println("Entire match :" + matcher.group(0));
            System.out.println("协议: " + matcher.group(1));
            System.out.println("域名: " + matcher.group(2));
            System.out.println("端口号： " + matcher.group(3));
            System.out.println("文件名： " + matcher.group(4));

        }
    }
        }
