public class LowerCase {
    public static void main(String[] args){
        String str = args[0];
        System.out.println(lowerCase(str));
    }

    public static String lowerCase(String s) {
        String str2 = "";
        for (int i = 0; i < s.length(); i++){
            if ((char)(s.charAt(i)) < 91){
                if ((char)(s.charAt(i)) > 64){
                    str2 = str2 + ((char)(s.charAt(i) + 32));
                } else {
                    str2 = str2 + s.charAt(i);
                }
            } else {
                str2 = str2 + s.charAt(i);
            }
        }
        return str2;
    }
}
