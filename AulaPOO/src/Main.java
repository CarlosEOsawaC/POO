public class Main {
    public static void main(String[] args) {
        Produtos prod1 = new Produtos(1,"Tenis Nike", 456.90);
        Produtos prod2 = new Produtos(2);
        Produtos prod3 = new Produtos(3);

        System.out.println("Prod1"+" Id: "+prod1.getId()+" Descrição "+ prod1.getDescricao()+" Preço "+ prod1.getPreco());
        System.out.println("Prod2"+" Id: "+prod2.getId()+" Descrição "+ prod2.getDescricao()+" Preço "+ prod2.getPreco());
        System.out.println("Prod3"+" Id: "+prod3.getId()+" Descrição "+ prod3.getDescricao()+" Preço "+ prod3.getPreco());
    }
}