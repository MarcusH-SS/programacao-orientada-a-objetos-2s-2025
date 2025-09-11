package Sistema_IPTU;

public class secretariaDaFazenda {

    public static void main(String[] args) {
        município = new município("Brasília", "DF", 31.5);
        apartamento apt = new apartamento(município, 63.0, 0, true);

        system.out.println("IPTU R$: " + apt.calcularIPTU());
    }
    
}
