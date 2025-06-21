import java.util.Scanner;

public class CalculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua altura em metros (ex: 1.75): ");
        double altura = scanner.nextDouble();

        System.out.print("Digite seu peso em kg (ex: 70): ");
        double peso = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);
        System.out.println("Interpretação: " + interpretarIMC(imc));

        scanner.close();
    }

    private static String interpretarIMC(double imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidade";
        }
    }
}