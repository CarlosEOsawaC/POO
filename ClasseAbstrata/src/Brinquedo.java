public class Brinquedo extends Produtos{
    @Override
    public void atulizar() {
        System.out.println("Atulizando Brinquedo");
    }

    @Override
    public void Inserir(int id, String nome, double preco) {
        super.Inserir(id, nome, preco);
    }

    @Override
    public void Deletar() {
        super.Deletar();
    }

    @Override
    public void Ler() {
        super.Ler();
    }
}
