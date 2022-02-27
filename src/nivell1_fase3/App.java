package nivell1_fase3;

public class App {
    
    @FunctionalInterface
    public interface reverseInterface {
       public String reverse(String text);
    }

    public static void main(String[] args) throws Exception {
        //instanciem y pasem valor
        reverseInterface reverseInstance = (String value) -> {
            StringBuilder sb = new StringBuilder(value);
            return sb.reverse().toString();
        };
        System.out.println(reverseInstance.reverse("text reverse"));
    }
}