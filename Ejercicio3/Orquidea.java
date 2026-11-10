package Ejercicio3;

public class Orquidea extends Planta{
    private String color;

    public Orquidea(String tipo, String color) {
        super(tipo); // Uso correcto de super para el constructor
        this.color = color;
    }

    public void mostrarAtributoPrivado() {
        /* 
         * RESPUESTA AL PUNTO 2 DEL EJERCICIO:
         * Si se intenta escribir: System.out.println(super.tipo);
         * Ocurriría un ERROR DE COMPILACIÓN porque el atributo 'tipo' es private 
         * en la clase base, y las clases hijas no pueden acceder a miembros privados 
         * de manera directa ni usando super. 
         * Solución aplicada: Usar el método getter público de la clase padre.
         */
        System.out.println("Tipo (vía getter): " + getTipo());
        System.out.println("Color: " + color);
    }
}
