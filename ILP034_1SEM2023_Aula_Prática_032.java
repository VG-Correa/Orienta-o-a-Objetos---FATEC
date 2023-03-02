import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ILP034_1SEM2023_Aula_Prática_032 {

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

    public static class Carrinho {

        private ArrayList<Produto> produtos = new ArrayList<Produto>();

        public void add_produto() {
            String repetir = "";

            while (!repetir.equals("N")) {
                Produto produto = new Produto();
                produto.categoria = Ler("Informe a categoria do produto: ");
                produto.nome = Ler("Informe o nome do produto: ");
                produto.valor_venda = Integer.parseInt(Ler("Informe o valor do produto: "));
                produto.id = produtos.size();

                this.produtos.add(produto);

                repetir = Ler("Quer adicionar mais produtos? (Y/N): ");
            }
        }

        public void showProdutos() {

            int valor_total = 0;

            for (Produto produto : this.produtos) {
                System.out.println("============================================");
                System.out.println("id: " + produto.id);
                System.out.println("Produto: " + produto.nome);
                System.out.println("Categoria: " + produto.categoria);
                System.out.println("Valor de venda: " + produto.valor_venda);
                valor_total += produto.valor_venda;
            }

            System.out.println("============================================");
            System.out.println("O valor total do carrinho é: " + valor_total);

        }

    }

    public static class Produto {
        int id;
        String nome;
        String categoria;
        int valor_venda;
    }

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        carrinho.add_produto();
        carrinho.showProdutos();

    }
}
