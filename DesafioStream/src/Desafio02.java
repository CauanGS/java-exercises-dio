import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Desafio02 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // Desafio - Imprima a soma dos números pares da lista:
        numeros.stream().filter(numero -> numero % 2 == 0).forEach(System.out::println);
    }
}
