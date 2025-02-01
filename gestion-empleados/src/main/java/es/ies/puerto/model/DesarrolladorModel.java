package es.ies.puerto.model;

/**
 * Clase DesarrolladorModel que hereda los atributos y métodos de la clase EmpleadoModel.
 * El Desarrollador tiene un salario final del sueldo base +20%.
 * 
 * @author cdiagal
 * @version 1.0.0
 */


public class DesarrolladorModel extends EmpleadoModel {


    /**
     * Constructor vacío de la clase.
     */
    public DesarrolladorModel(){}

    /**
     * Construtor de la clase con todos los atributos. Están heredados de la clase EmpeladoModel
     * @param nombre del desarrollador
     * @param edad del desarrollador
     * @param salarioBase del desarrollador
     */
    public DesarrolladorModel(String nombre, int edad, double salarioBase){
        super(nombre, edad, salarioBase);
    }


    /**
     * Método que recibe el salario base y le suma el 20%.
     * Calcula el salario final.
     */
    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() * 1.20;
    }

    /**
     * Muestra la información del desarrollador, incluyendo la información común de cualquier empleado.
     */
    @Override
    public void mostrarInformacion(){
        System.out.println("Empleado: Desarrollador" );
        super.mostrarInformacion();
        System.out.println("Salario final: " + calcularSalarioFinal());
        System.out.println();
    }
}
