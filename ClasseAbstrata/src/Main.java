import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Brinquedo bri = new Brinquedo();
        bri.Inserir(1,"boneca", 12.90);
        bri.Deletar();
        bri.atulizar();
        bri.Ler();
            System.out.println("--------------------------------------------");
        Bolas b = new Bolas();
        b.atulizar();
        b.Deletar();
        b.Inserir(1,"Capotao",278);
        b.Ler();
    }
}