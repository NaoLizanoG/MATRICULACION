import java.util.Scanner;

public class Profesor {
    private String nombre="";
    private String cedula="";
    private int codigo=0;



    public Profesor(){

    }
    public Profesor(String nombre, String cedula, int codigo) {
        this.nombre = nombre;
        this.cedula= cedula;
        this.codigo = codigo;
    }


    public void ingresarProfesor(int p){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre del profesor "+p+":");
        this.nombre = sc.next();
        System.out.println("Ingrese cedula del profesor "+p+":");
        this.cedula = sc.next();
        System.out.println("Ingrese el idBanner"+p+":");
        this.codigo = sc.nextInt();
    }




   /* public void mostrarProfesor (){
        System.out.println("El profesor de la materia  es: "+nombre);
        System.out.println("El codigo del maestro es: "+codigo);
        System.out.println("El telefono del maestro es "+cedula);
    }*/

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
