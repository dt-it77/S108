package nivell1_fase1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    public static void main(String[] args) throws Exception {
        List<String> nomsPropis = new ArrayList<String>(Arrays.asList("Ade","Ana","Abde","Adelaida","David","Joan","Jordi","Laura","Miriam"));

        System.out.println("Ex 1");
        System.out.println(nomsPropis.stream().filter(nom->nom.startsWith("A") && nom.length() == 3).collect(Collectors.toList()));  

        System.out.println("Ex 2");
        List<Integer> llistaNumeros = new ArrayList<Integer>(Arrays.asList(1,152,189,3,458,1296));
        System.out.println(llistaNumeros.stream()
        .map(x->x%2 == 0 ? "e"+x : "o"+x)
        .collect(Collectors.joining(",")));

        System.out.println("Ex 3");
        System.out.println(nomsPropis.stream().filter(x->x.toLowerCase().contains("o")).collect(Collectors.toList()));
        
        System.out.println("Ex 4");
        System.out.println(nomsPropis.stream().filter(x->x.length() > 5).collect(Collectors.toList()));

        System.out.println("Ex 5");
        List<String> months = new ArrayList<String>(Arrays.asList("gener","febrer","març","abril","maig","juny","juliol","agost","septembre","octubre","novembre","decembre"));
        months.forEach(m->System.out.println(m));

        System.out.println("Ex 6");
        months.forEach(System.out::println);
    }

}