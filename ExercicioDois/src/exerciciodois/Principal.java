package exerciciodois;

/**
 *
 * @author AUGUSTO ALEX CAIXETA SILVA
 */
public class Principal {
    public static void main(String[] args) {
        Eletrodomestico geladeira = new Eletrodomestico();
        geladeira.setVoltagem(300);
        geladeira.setMarca("Eletrolux");
        geladeira.setConsumo(220);
        geladeira.setDimensao("80x180");
        
        System.out.println("Voltagem: " + geladeira.getVoltagem() + "\n"
                + "Marca: " + geladeira.getMarca() + "\n"
                + "Consumo: " + geladeira.getConsumo() + "\n"
                + "Dimensao: " + geladeira.getDimensao() + "\n");

        Televisao televisao = new Televisao();
        televisao.setVoltagem(40);
        televisao.setMarca("LG");
        televisao.setConsumo(115); // 110
        televisao.setDimensao("140x100");
        televisao.setPolegadas(40);
        televisao.setTipo("4K");
        televisao.setFuncoes("Smart TV");
        
        System.out.println("****************************************\n");

        System.out.println("Voltagem: " + televisao.getVoltagem() + "\n"
                + "Marca: " + televisao.getMarca() + "\n"
                + "Consumo: " + televisao.getConsumo() + "\n"
                + "Dimensao: " + televisao.getDimensao() + "\n"
                + "Polegadas: " + televisao.getPolegadas() + "\n"
                + "Tipo: " + televisao.getTipo() + "\n"
                + "Funcoes: "+ televisao.getFuncoes() + "\n");

        Microondas microondas = new Microondas();
        microondas.setVoltagem(80);
        microondas.setMarca("Eletrolux");
        microondas.setConsumo(220);
        microondas.setDimensao("60x50");
        microondas.setDisplayDigital(true);
        microondas.setAutoLimpante(false);
        microondas.setCapacidadeLitros(10);
        
        System.out.println("****************************************\n");

        System.out.println("Voltagem: " + microondas.getVoltagem() + "\n"
                + "Marca: " + microondas.getMarca() + "\n"
                + "Consumo: " + microondas.getConsumo() + "\n"
                + "Dimensao: " + microondas.getDimensao() + "\n"
                + microondas.formatarAtributosBooleanos() + "\n"
                + "Capacidade de Litros: " + microondas.getCapacidadeLitros() + "L" + "\n");
    }
}
