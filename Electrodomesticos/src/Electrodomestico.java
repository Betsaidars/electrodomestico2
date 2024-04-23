public class Electrodomestico {

    protected double precioBase;
    protected char consumoEnergetico;
    protected double peso;
    protected Color color;
    enum Color{
        blanco,
        negro,
        rojo,
        azul,
        gris
    }


    public Electrodomestico() {
    }

    public Electrodomestico(double precioBase, double peso){
        this.precioBase = 100;
        this.peso = 5;
        this.consumoEnergetico = 'F';
        this.color = Color.blanco;
    }

    public Electrodomestico(double precioBase, char consumoEnergetico, double peso, Color color) {
        this.precioBase = precioBase;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.color = color;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public Color getColor() {
        return color;
    }

    public boolean comprobarConsumoEnergetico(char letra){
        if (letra == 'A'){
            return true;
        } else if (letra == 'B') {
            return true;
        } else if (letra == 'C') {
            return true;
        } else if (letra == 'D') {
            return true;
        } else if (letra == 'E') {
            return true;
        } else if (letra == 'F') {
            return true;
        }
            return false;
    }

    public boolean comprobarColor(String color){
        if (color == "blanco"){
            return true;
        } else if (color == "negro") {
            return true;
        } else if (color == "rojo") {
            return true;
        } else if (color == "azul") {
            return true;
        } else if (color == "gris") {
            return true;
        }
        return false;
    }

    public void precioFinal() {
        double precioFinalConsumo = 0;
        if (consumoEnergetico == 'A'){
            precioFinalConsumo += 100;
        } else if (consumoEnergetico == 'B') {
            precioFinalConsumo += 80;
        } else if (consumoEnergetico == 'C') {
            precioFinalConsumo += 60;
        } else if (consumoEnergetico == 'D') {
            precioFinalConsumo += 50;
        } else if (consumoEnergetico == 'E') {
            precioFinalConsumo += 30;
        } else if (consumoEnergetico == 'F') {
            precioFinalConsumo += 10;
        }
    }

    public void comprobarTamaño(double peso){
        double precioFinalTamaño = 0;
        if (peso <= 0 && peso >= 19){
            precioFinalTamaño += 10;
        } else if (peso <= 20 && peso >= 49) {
            precioFinalTamaño += 50;
        } else if (peso <= 50 && peso >= 79) {
            precioFinalTamaño += 80;
        } else if (peso > 80) {
            precioFinalTamaño += 100;
        }
    }


}


