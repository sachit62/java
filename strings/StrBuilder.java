// string builder use

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        // O(26) with sb
        // O(n^2) with string
    }
}
