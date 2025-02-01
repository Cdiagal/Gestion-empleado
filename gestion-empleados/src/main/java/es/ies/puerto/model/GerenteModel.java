package es.ies.puerto.model;

/**
 * Clase GerenteModel que hereda los atributos y métodos de la clase EmpleadoModel.
 * El Gerente tiene un salario final del sueldo base +30%.
 * 
 * @author cdiagal
 * @version 1.0.0
 */

public class GerenteModel extends EmpleadoModel{

    /**
     * Constructor vacío de la clase.
     */
    public GerenteModel(){

    }


    /**
     * Construtor de la clase con todos los atributos. Están heredados de la clase EmpeladoModel
     * @param nombre del gerente
     * @param edad del gerente
     * @param salarioBase del gerente
     */

    public GerenteModel (String nombre, int edad, double salarioBase){
        super(nombre, edad, salarioBase);
    }

    /**
     * Método que recibe el salario base y le suma el 30%.
     * Calcula el salario final.
     */
    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() * 1.30;
    }

     /**
     * Muestra la información del gerente, incluyendo la información común de cualquier empleado.
     */
    @Override
    public void mostrarInformacion(){
        System.out.println("Empleado: Gerente" );
        super.mostrarInformacion();
        System.out.println("Salario final: " + calcularSalarioFinal());
    }

}
