package exerciciodois;

public class Televisao extends Eletrodomestico {
    private int polegadas;
    private String tipo;
    private String funcoes;

    public int getPolegadas() {
        return polegadas;
    }

    public void setPolegadas(int polegadas) {
        this.polegadas = polegadas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Full") || tipo.equals("HD") || tipo.equals("UHD") || tipo.equals("LED")) {
            this.tipo = tipo;
        } else {
            this.tipo = "4K";
        }

        /*

        import java.util.Set;
        
        Set<String> tiposValidos = Set.of("Full", "HD", "UHD", "LED");
        this.tipo = (tipo != null && tiposValidos.contains(tipo)) ? tipo : "4K";
        
        */
    }

    public String getFuncoes() {
        return funcoes;
    }

    public void setFuncoes(String funcoes) {
        this.funcoes = funcoes;
    }
}
