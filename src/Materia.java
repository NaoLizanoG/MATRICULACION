import java.util.Scanner;

public class Materia {
    private String nombre="";
    private int codigo=0;
    private int numhoras=0;
    Profesor[] arregloProfe = new Profesor[3];



    public Materia(){
    }



    public void ingresarMateria(int m){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese nombre de la materia "+m+":");
        this.nombre = sc.next();
        System.out.println("Ingrese el codigo de la materia "+m+":");
        this.codigo = sc.nextInt();
        System.out.println("Ingrese el numero de horas de la materia "+m+":");
        this.numhoras = sc.nextInt();
    }

    public void datosProfesores(){

        Profesor profesor1 = new Profesor();
        arregloProfe[0]=profesor1;
        profesor1.ingresarProfesor(1);
        Profesor profesor2 = new Profesor();
        arregloProfe[1]=profesor2;
        profesor2.ingresarProfesor(2);
        Profesor profesor3 = new Profesor();
        arregloProfe[2]=profesor3;
        profesor3.ingresarProfesor(3);
        }
    public void mostrarMaterias(Materia mater, int numMateria, int numProfesor){
        System.out.println("La materia "+numMateria+" es: "+nombre);
        System.out.println("El codigo es: "+codigo);
        System.out.println("La materia tiene "+numhoras+" horas");
        System.out.println("Su profesor asignado es " + mater.arregloProfe[numProfesor].getNombre());
    }

    public void bienvenido(){
        System.out.println("Bienvenido a tu sistema de matriculacion");
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }


}


