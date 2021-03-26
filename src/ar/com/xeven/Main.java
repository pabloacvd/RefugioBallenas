package ar.com.xeven;

public class Main {

    public static void main(String[] args) {

        Refugio refugio = new Refugio();
        refugio.listarAnimales();

        System.out.println("Ballenas?");
        refugio.mostrarAnimalesPorEspecie("Ball");


    }
}
