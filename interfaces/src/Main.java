import Classes.ClienteA;
import Classes.ClienteB;
import Classes.ClientePremiun;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");
        ClienteA clienteA = new ClienteA();
        System.out.println("ClienteA:");
        System.out.println(clienteA.CalcularCompra());
        System.out.println(clienteA.CalcularImposto());
        clienteA.Inserir();
        System.out.println("-----------------------------------------");
        System.out.println("ClienteB:");
        ClienteB clienteB = new ClienteB();
        System.out.println(clienteB.CalcularCompra());
        System.out.println(clienteB.CalcularImposto());
        clienteB.Inserir();
        System.out.println("-----------------------------------------");
        System.out.println("ClientePremiun:");
        ClientePremiun clientePremiun = new ClientePremiun();
        System.out.println(clientePremiun.CalcularCompra());
        System.out.println(clientePremiun.CalcularImposto());
        clientePremiun.Inserir();
        System.out.println("-----------------------------------------");
    }
}