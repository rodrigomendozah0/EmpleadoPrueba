/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author Rodrigo
 */
public class Empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado_2 a1= new Empleado_2( 234 , "Alejandro Gomez", "Recursos Humanos" , 2000, 6 , "AFP");
        Empleado_2 a2= new Empleado_2( 235 , "Camila Fernandez", "Limpieza" , 1500, 8 , "SNP");
        Empleado_2 a3= new Empleado_2( 236 , "Valentina Rojas", "Asesor" , 1700, 7 , "AFP");
        Empleado_2 a4= new Empleado_2( 237 , "Sofia Vargas", "Supervisor" , 1800, 9 , "SNP");
    
        double rpta, rpta_1; 
        rpta = a1.Cal_horas();
        rpta_1 = a1.Cal_sueldo_neto(); 
        System.out.println("El calculo de las horas para el empleado es: " +rpta );
        System.out.println("El calculo del sueldo neto para el empleado es: " +rpta_1 );
        System.out.println(a1.toString());
        System.out.println("Buenas noches");
        System.out.println("Segundo intento");
    } 
}
