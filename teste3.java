import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class teste3 {

    public static class Usuario {

        private String nome;
        private String senha;
        private String email;
        private boolean logged;

        public Usuario(String nome, String email, String senha) {
            this.nome = nome;
            this.senha = senha;
            this.email = email;
            this.logged = false;
        }

        public boolean Autenticar(String email, String senha) {
            boolean result;
            result = (this.email.equals(email) && this.senha.equals(senha));
            return result;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSenha() {
            return senha;
        }

        public void setSenha(String senha_antiga, String nova_senha) {
            this.senha = (this.senha.equals(senha_antiga)) ? nova_senha : this.senha;
            String result = this.senha.equals(senha_antiga) ? "Senha alterada" : "Informe a senha antiga correta";
            System.out.println(result);
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void logar(String email, String senha) {
            this.logged = (this.senha.equals(senha) && this.email.equals(email));
        }

        public String islogged() {
            return this.logged ? "Usuário " + this.nome + " logado" : "Usuário deslogado";
        }

    }

    public static Usuario login(ArrayList<Usuario> usuarios, String email, String senha) {

        for (Usuario usuario : usuarios) {

            if (usuario.Autenticar(email, senha)) {
                usuario.logar(email, senha);
                return usuario;

            }

        }
        return null;

    }

    public static void main(String[] args) {

        String email = "fabricio@gmail.com";
        String senha = "456";

        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

        try {

            FileReader arq = new FileReader("exemplo.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha

            while (linha != null) {

                if (!linha.equals("Nome,email,senha")) {
                    String[] dados = linha.split(",");
                    usuarios.add(new Usuario(dados[0], dados[1], dados[2]));
                }

                linha = lerArq.readLine(); // lê da segunda até a última linha

            }

            Usuario usuario = login(usuarios, email, senha);

            if (usuario != null) {
                System.out.println(usuario.islogged());
            } else {
                System.out.println("Credenciais incorretas!");
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
    }
}