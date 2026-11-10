package Ejercicio1_T10;

public class Main {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Estudiante(); // Polimorfismo
        Persona p3 = new Profesor();   // Polimorfismo

        p1.presentarse();
        p2.presentarse();
        p3.presentarse();
    }
}
