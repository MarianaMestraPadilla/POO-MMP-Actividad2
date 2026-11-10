package Ejercicio2;

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); // Invoca el constructor de la clase base
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie(); // Invoca el método de la clase base
        System.out.println("Tipo de agua: " + tipoDeAgua);
    }
}
