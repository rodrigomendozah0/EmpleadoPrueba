/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author Rodrigo
 */
public class Empleado_2 {
    private int codigo;
    private String nombres; 
    private String area_lb;
    private double sueldo_bruto; 
    private int horas; 
    private String afiliacion;
    private double descSalud = 0.03;
    private double descAFP = 0.11; 
    private double descSNP = 0.06; 
   
//CONSTRUCTOR
    public Empleado_2(int codigo, String nombres, String area_lb, double sueldo, int horas, String afiliacion) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.area_lb = area_lb;
        this.sueldo_bruto = sueldo;
        this.horas = horas;
        this.afiliacion = afiliacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getArea_lb() {
        return area_lb;
    }

    public void setArea_lb(String area_lb) {
        this.area_lb = area_lb;
    }

    public double getSueldo_bruto() {
        return sueldo_bruto;
    }

    public void setSueldo_bruto(double sueldo_bruto) {
        this.sueldo_bruto = sueldo_bruto;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public String getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(String afiliacion) {
        this.afiliacion = afiliacion;
    }

    @Override
    public String toString() {
        return "CODIGO: "+codigo+" ,NOMBRES: "+nombres+" ,AREA_L: "+area_lb+" ,SUELDO: "+sueldo_bruto+" , HORAS: "+horas+" , AFILIACION: "+afiliacion;
    }
    
    public double Cal_horas(){
    double calculo; 
        calculo= sueldo_bruto * horas /240; 
    return calculo; 
    }
    
    
    public double Cal_sueldo_neto(){
    double sueldo_neto; 
        if (afiliacion == "AFP"){
          sueldo_neto = sueldo_bruto - (sueldo_bruto*descAFP) - (sueldo_bruto * descSalud) + Cal_horas(); 
        }
        else {
          sueldo_neto = sueldo_bruto - (sueldo_bruto*descSNP) - (sueldo_bruto * descSalud) + Cal_horas(); 
        }
    return sueldo_neto; 
    }
    
}
