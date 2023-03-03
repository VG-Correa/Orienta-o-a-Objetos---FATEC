import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lista_de_Exercícios_Java_ILP034_1SEM2023 {

    public static String Ler(String mensagem) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(mensagem);
        try {
            String line = br.readLine();
            return line;
        } catch (IOException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        // int n1 = Integer.parseInt(Ler("Insira um número inteiro: "));
        // int n2 = Integer.parseInt(Ler("Insira o segundo número inteiro: "));
        // int n3 = Integer.parseInt(Ler("Insira o terceiro número inteiro: "));
        // int n4 = Integer.parseInt(Ler("Insira o quarto número inteiro: "));

        // System.out.println("A soma dos quatro números é: " + (n1 + n2 + n3 + n4));

        // Double n1 = Double.parseDouble(Ler("Insira um número inteiro: "));
        // Double n2 = Double.parseDouble(Ler("Insira o segundo número inteiro: "));
        // Double n3 = Double.parseDouble(Ler("Insira o terceiro número inteiro: "));

        // System.out.println("A média aritimética é: " + (n1 + n2 + n3) / 3);

        // Double n1 = Double.parseDouble(Ler("Insira um número inteiro: "));
        // Double peso_n1 = Double.parseDouble(Ler("Qual o peso da nota " + n1 + ": "));
        // Double n2 = Double.parseDouble(Ler("Insira o segundo número inteiro: "));
        // Double peso_n2 = Double.parseDouble(Ler("Qual o peso da nota " + n2 + ": "));
        // Double n3 = Double.parseDouble(Ler("Insira o terceiro número inteiro: "));
        // Double peso_n3 = Double.parseDouble(Ler("Qual o peso da nota " + n3 + ": "));

        // System.out.println("A média aritimética é: " + (n1 * peso_n1 + n2 * peso_n2 +
        // n3 * peso_n3));

        // Double n1 = Double.parseDouble(Ler("Insira o salário do funcionário: "));

        // System.out.println("O novo salário com aumento de 25% é de: " + (n1 * 0.25 +
        // n1));

        // Double n1 = Double.parseDouble(Ler("Insira o salário do funcionário: "));
        // Double aumento = Double.parseDouble(Ler("Insira o percentual de aumento do
        // funcionário: "));

        // System.out.println("O novo salário com aumento de 25% é de: " + (n1 * aumento
        // + n1));

        // Double n1 = Double.parseDouble(Ler("Insira o salário do funcionário: "));
        // Double gratificação = 0.05 * n1 + n1;
        // Double imposto = gratificação - 0.07 * gratificação;

        // System.out.println("O novo salário é de: " + imposto);

        // Double n1 = Double.parseDouble(Ler("Insira o salário do funcionário: "));
        // Double gratificação = 50.0;
        // Double imposto = n1 * 0.10;

        // System.out.println("O novo salário é de: " + (n1 + gratificação - imposto));

        // Double valor_inicial = Double.parseDouble(Ler("Insira o valor inicial: "));
        // Double taxa_juros = Double.parseDouble(Ler("Insira a taxa de juros: "));

        // Double rendimento = valor_inicial * taxa_juros;
        // Double resultado = valor_inicial + rendimento;

        // System.err.println("O valor do rendimento foi de: R$" + rendimento);
        // System.err.println("O valor final é de: R$" + resultado);

        // Double altura = Double.parseDouble(Ler("Insira a altura do triângulo: "));
        // Double largura = Double.parseDouble(Ler("Insira a largura do triângulo: "));
        // Double area = (altura * largura) / 2;

        // System.err.println("A área do triângulo é de: " + area);

        Double raio = Double.parseDouble(Ler("Insira o raio do círculo: "));
        Double area = 3.14 * (raio * raio);

        System.err.println("A área do círculo é de: " + area);

    }
}
