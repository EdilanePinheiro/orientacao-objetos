package aulaMarco;

public class Principal {
    public static void main(String[] args) {


        Filme filme1 = new Filme();

        filme1.setTitulacao("Era do Gelo");
        System.out.println(filme1.getTitulacao());

        filme1.setDuracao(30);
        System.out.println(filme1.getDuracao());

        filme1.setAno(2002);


    }   
}
