// string compression question

public class compression {

    public static String compress(String str) {
        // String newstr = "";

        // for(int i=0;i<str.length();i++){
        // Integer count = 1;
        // while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
        // count++;
        // i++;
        // }
        // newstr += str.charAt(i);
        // if(count>1){
        // newstr += count.toString();
        // }
        // }
        // return newstr;

        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
