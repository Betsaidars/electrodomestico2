public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
        this.precioBase = 100;
        this.peso = 5;
        this.consumoEnergetico = getConsumoEnergetico();
        this.color = Color.blanco;
        this.carga = 5;
    }

    public Lavadora(double precioBase, char consumoEnergetico, double peso, Color color, double carga) {
        super(precioBase, consumoEnergetico, peso, color);
        this.carga = 5;
    }

    public double getCarga() {
        return carga;
    }

    public void precioFinal(){
        double precio = 0;
        if (carga > 30){
            precio += 50;
        } else {
            precioFinal();
        }
    }





}
