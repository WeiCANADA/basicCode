package week12;

public class ConverterUI {
    public static void main(String[] args) {
//        System.out.println(bin2Decimal("1111111111111111"));
        System.out.println(english2encrypted("baluga"));
    }

    public static int bin2Decimal(String bin2) {
        int len = bin2.length();
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(bin2.charAt(i))) {
                return -1;
            }
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            int dt = Integer.parseInt(bin2.substring(i, i + 1));
            sum += Math.pow(2, len - i) * dt;
        }
        return sum;
    }

    public static String english2encrypted(String str) {
        str = str.replaceAll("^A-Za-z", "");
        str = str.toUpperCase();
        str = str.replace('E', '3');
        str = str.replace('B', '8');
        System.out.println(str);

        int len = str.length();
        for (int i = 0; i < len; i++) {
            char cha = str.charAt(i);
            if (cha == 'A') {
               str= str.replace(str.charAt(i), 'V');
            } else if (cha == 'V') {
                str= str.replace(str.charAt(i), 'A');
            } else if (cha == 'O') {
                str= str.replace(str.charAt(i), 'Q');
            } else if (cha == 'Q') {
                str= str.replace(str.charAt(i), 'O');
            }else if(cha == 'Y'){
                str= str.replace(str.charAt(i), 'I');
            }else if(cha == 'I'){
                str= str.replace(str.charAt(i), 'Y');
            }
        }
        System.out.println(str);
        if(len > 1){
            char temp = str.charAt(0);
            str = str.replace(str.charAt(0) , str.charAt(len - 1));
            str = str.replace(str.charAt(len - 1) , temp);

        }
        return str;
    }
}
