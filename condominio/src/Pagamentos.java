public class Pagamentos {
    private int id;
    private double valorC; // Valor do Condominio
    private double multa;
    private int Napartamento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getValorC() {
        return valorC;
    }

    public void setValorC(double valorC) {
        this.valorC = valorC;
    }

    public double getMulta() {
        return multa;
    }

    public void setMulta(double multa) {
        this.multa = multa;
    }

    public int getNapartamento() {
        return Napartamento;
    }

    public void setNapartamento(int napartamento) {
        Napartamento = napartamento;
    }
}
