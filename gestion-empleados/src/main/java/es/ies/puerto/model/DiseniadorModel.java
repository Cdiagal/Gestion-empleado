package es.ies.puerto.model;


/**
 * Clase DiseniadorModel que hereda los atributos y métodos de la clase EmpleadoModel.
 * El Diseniador tiene un salario final del sueldo base +10%.
 * 
 * @author cdiagal
 * @version 1.0.0
 */


public class DiseniadorModel extends EmpleadoModel{
    
    /**
     * Constructor vacío de la clase.
     */
    public DiseniadorModel (){

    }
    
    /**
     * Construtor de la clase con todos los atributos. Están heredados de la clase EmpeladoModel
     * @param nombre del diseniador
     * @param edad del diseniador
     * @param salarioBase del diseniador
     */
    public DiseniadorModel(String nombre, int edad, double salarioBase){
        super(nombre, edad, salarioBase);
    }

    /**
     * Método que recibe el salario base y le suma el 10%.
     * Calcula el salario final.
     */
    @Override
    public double calcularSalarioFinal(){
        return getSalarioBase() * 1.10;
    }

    /**
     * Muestra la información del diseniador, incluyendo la información común de cualquier empleado.
     */
    @Override
    public void mostrarInformacion(){
        System.out.println("Empleado: Diseniador" );
        super.mostrarInformacion();
        System.out.println("Salario final: " + calcularSalarioFinal());
        System.out.println();
    }




}
