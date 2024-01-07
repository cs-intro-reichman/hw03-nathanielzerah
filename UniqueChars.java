public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

        public static String uniqueChars(String s) {
            String x = "";
            for (int i = 0; i < s.length(); i++) {
                char y = s.charAt(i);
                if (y == ' '){
                    x = x + " ";
                    i++;
                }
                if (x.indexOf(y) == -1){
                    x = x + y;
                }
            }
            return x;
        }
 }
