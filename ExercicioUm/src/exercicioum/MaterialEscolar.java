package exercicioum;

public class MaterialEscolar {
    private String tipo;
    private String marca;
    private double valor;
    private String especificacao;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("Lápis") || tipo.equals("Caneta") || tipo.equals("Caderno")) {
            this.tipo = tipo;
        } else {
            this.tipo = "Sem informação";
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 10.0) {
            valor = 10.0;
        }

        this.valor = valor;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}
