public class Moradores {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void Imprimir() {
        System.out.println("id"+getId()+"\n"+
                "Nome"+getNome()+"\n"+
                "CPF"+getCpf()+"\n"+
                "E-mail"+getEmail()+"\n"+
                "Telefone"+getTelefone()+"\n"+);
    }
}
