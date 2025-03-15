import java.util.Arrays;
import java.util.List;

public class Desafio01 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio 1 - Mostre a lista na ordem numérica:
        numeros.sort((n1, n2) -> Integer.compare(n1, n2));
        System.out.println(numeros);
    }

}