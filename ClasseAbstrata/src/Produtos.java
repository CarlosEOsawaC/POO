public abstract class Produtos {
    private int id;
    private String nome;
    private double preco;

    public void Inserir(int id, String nome, double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
            System.out.println(this.id+"\n"+this.nome+"\n"+this.preco);
    }
    public void Deletar(){
        System.out.println("Deletando o Produto.....");
    }
    public void Ler(){
        System.out.println("Lendo o Produto.....");
    }
    public abstract void atulizar();
}
