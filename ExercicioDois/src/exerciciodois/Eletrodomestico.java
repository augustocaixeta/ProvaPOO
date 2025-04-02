package exerciciodois;

public class Eletrodomestico {
    private int voltagem;
    private String marca;
    private int consumo;
    private String dimensao;

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        if (consumo != 220) {
            consumo = 110;
        }

        this.consumo = consumo;
    }

    public String getDimensao() {
        return dimensao;
    }

    public void setDimensao(String dimensao) {
        this.dimensao = dimensao;
    }
}
