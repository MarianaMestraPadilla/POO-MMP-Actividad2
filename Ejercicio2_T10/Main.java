package Ejercicio2_T10;

public class Main {
    public static void main(String[] args) {
        Vehiculo vGenerico = new Vehiculo();
        Vehiculo miBici = new Bicicleta(); 

        vGenerico.moverse();
        miBici.moverse();
    }
}
