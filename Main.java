public class Main {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public static class Porta {
        private String Material, cor;
        private int altura, largura;

        public String getMaterial() {
            return Material;
        }

        public void setMaterial(String material) {
            Material = material;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public int getAltura() {
            return altura;
        }

        public void setAltura(int altura) {
            this.altura = altura;
        }

        public int getLargura() {
            return largura;
        }

        public void setLargura(int largura) {
            this.largura = largura;
        }

    }

}
