public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

        public static String uniqueChars(String s) {
            String x = "";
            for (int i = 0; i < s.length(); i++) {
                if (x.indexOf(s.charAt(i)) == -1){
                    x = x + s.charAt(i);
                }
            }
            return x;
        }
 }
