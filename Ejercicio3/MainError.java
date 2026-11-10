package Ejercicio3;

public class MainError {
    public static void main(String[] args) {
        /* 
         * RESPUESTA AL PUNTO 1 DEL EJERCICIO:
         * Si se intenta escribir aquí: super.tipo = "Orquídea";
         * Ocurriría un ERROR DE COMPILACIÓN porque la palabra clave 'super' 
         * solo se puede utilizar dentro de una clase derivada, y la clase Main 
         * no es una clase hija ni participa directamente en la jerarquía de herencia.
         */
        
        Orquidea orquidea = new Orquidea("Orquídea Phalaenopsis", "Morada");
        orquidea.mostrarAtributoPrivado();
        
        System.out.println("Demostración del Ejercicio 3 ejecutada con éxito.");
    }
}
