package Ejercicio3_T10;
public class DerivadaError extends Error {
    /* 
     * ANÁLISIS DE ERROR DE COMPILACIÓN:
     * Si se intenta usar la anotación @Override aquí cambiando la firma 
     * (por ejemplo, omitiendo el parámetro 'int x'), el compilador generará un error 
     * inmediato porque Java exige que el método sobrescrito coincida exactamente 
     * en nombre, tipo y cantidad de parámetros con el método de la clase base.
     */
    
    // @Override
    // public void calcular() { // <- Esto daría error de compilación
    //     System.out.println("Firma incorrecta");
    // }
}
