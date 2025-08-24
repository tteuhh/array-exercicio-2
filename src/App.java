public class App {
    public static void main(String[] args) {
        
        double[] notas = {7.0, 6.5, 8.0, 9.0};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;

        }

        double media = soma / 4;
        System.out.println("Média das notas: " + media);

    }
}
