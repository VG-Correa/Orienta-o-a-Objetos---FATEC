public class ILP034_1SEM2023_Aula_Prática_03 {

    public static class Carro {

        String marca;
        String modelo;
        String cor;

        public Carro(String marca, String modelo, String cor) {
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
        }
    }

    public static class Pessoa {
        private String nome;
        private String CPF;
        private int idade;
        private Double altura;
        private Double peso;

        public Pessoa(String nome, String CPF, int idade, Double altura, Double peso) {
            this.nome = nome;
            this.CPF = CPF;
            this.idade = idade;
        }

        public void SeApresentar() {
            System.out.println("O número do meu CPF é " + this.CPF + ", eu sou " + this.nome + " e tenho " + this.idade
                    + " anos.");
        }

    }

    public static void main(String[] args) {

        Pessoa Victor = new Pessoa("Victor", "457.767.938-82", 26, 1.71, 69.0);
        Victor.SeApresentar();

    }
}
