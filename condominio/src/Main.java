public class Main {
    public static void main(String[] args) {
        Moradores morador1 = new Moradores();
        Apartamentos ap1 = new Apartamentos();
        Garagem gr1 = new Garagem();
        Portaria p = new Portaria();
        Pagamentos pag = new Pagamentos();

        System.out.println("----------Morador---------------------");
        morador1.setId(1);
        morador1.setNome("jose");
        morador1.setCpf("123.456.789-09");
        morador1.setEmail("j@gmail.com");
        morador1.setTelefone("(31)91234-5678");
        morador1.Imprimir();
        System.out.println("----------Apartamento---------------------");
        ap1.setId(1);
        ap1.setNapartamento(101);
        ap1.setAndar("1º Andar");
        ap1.setNquartos(2);
        ap1.setTipo("Padrão");
        ap1.setNplaca("pln-9098");
        ap1.Imprimir();
        System.out.println("-----------Garagem---------------------");
        gr1.setId(1);
        gr1.setNumero();
        gr1.setNapartamento();
        System.out.println("-----------Portaria--------------------");
        p.setId(1);
        p.setPlaca("pln9098");
        p.setVisitante("");
        p.setPorteiro("");
        System.out.println("-----------Pagamentos------------------");
        pag.setId();
    }
}