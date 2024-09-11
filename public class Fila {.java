public class Fila {
 

    private static Fila instancia;
 

    private Fila() {

    }
 

    public static Fila getInstancia() {
        if (instancia == null) {
            instancia = new Fila();
        }
        return instancia;
    }
 
    public void adicionarDocumento(String documento) {
        System.out.println("Documento " + documento + " adicionado à fila.");
    }
 
    public void removerDocumento() {
        System.out.println("Documento removido da fila.");
    }
}






