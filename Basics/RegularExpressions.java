
public class RegularExpressions {
    public static void main(String[] args) {
        String text = "Java123@";

        String pattern = "[A-Za-z]+\\d+";

        boolean match = text.matches(pattern);

        System.out.println(match);
    }
}
