package DAO;

public interface CRUD {
    public abstract void Inserir();
    public abstract void Atualizar();
    public abstract void Apagar();
    abstract void Ler();
    public void Selecionar();
    public String imprimir();
}
