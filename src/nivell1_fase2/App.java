package nivell1_fase2;

public class App {
    
    @FunctionalInterface
    public interface PiInterface {
        public double getPiValue();
    }

    public static void main(String[] args) throws Exception {
        //instanciem y pasem valor
        PiInterface piInst = () -> 3.1415;
        System.out.println(piInst.getPiValue());
    }
}