package exercicioum;

/**
 *
 * @author AUGUSTO ALEX CAIXETA SILVA
 */
public class Principal {
    public static void main(String[] args) {
        MaterialEscolar lapis = new MaterialEscolar();
        lapis.setTipo("Lápis");
        lapis.setMarca("Fabber Castel");
        lapis.setValor(12.0);
        lapis.setEspecificacao("Lápis de escrever com grafite preto.");
        
        System.out.println("Tipo: " + lapis.getTipo() + "\n"
                + "Marca: " + lapis.getMarca() + "\n"
                + "Valor: R$ " + lapis.getValor() + "\n"
                + "Especificação: " + lapis.getEspecificacao() + "\n");
        
        MaterialEscolar caneta = new MaterialEscolar();
        caneta.setTipo("Caneta Azul");
        caneta.setMarca("Bic");
        caneta.setValor(8.0);
        caneta.setEspecificacao("Caneta Bic cor azul.");
        
        System.out.println("Tipo: " + caneta.getTipo() + "\n"
                + "Marca: " + caneta.getMarca() + "\n"
                + "Valor: R$ " + caneta.getValor() + "\n"
                + "Especificação: " + caneta.getEspecificacao());
    }
}
