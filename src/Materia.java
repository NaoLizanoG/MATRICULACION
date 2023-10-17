import java.util.Scanner;

public class Materia {
    private String nombre="";
    private int codigo=0;
    private int numhoras=0;
    private Profesor profesor1;
    private Profesor profesor2;
    private Profesor profesor3;


    public Materia(){
    }

    public Materia(String nombre, int codigo, int numhoras, Profesor profesor1, Profesor profesor2, Profesor profesor3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numhoras = numhoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
        this.profesor3= profesor3;
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

        profesor1 = new Profesor();
        profesor1.ingresarProfesor(1);
        profesor2 = new Profesor();
        profesor2.ingresarProfesor(2);
        profesor3 = new Profesor();
        profesor3.ingresarProfesor(3);
        }
    public void mostrarMaterias(int numMateria){
        System.out.println("La materia "+numMateria+" es: "+nombre);
        System.out.println("El codigo es: "+codigo);
        System.out.println("La materia tiene "+numhoras+" horas");
        System.out.println("Su profesor asignado es"+profesor1);
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

    public Profesor getProfesor1() {
        return profesor1;
    }

    public void setProfesor1(Profesor profesor1) {
        this.profesor1 = profesor1;
    }

    public Profesor getProfesor2() {
        return profesor2;
    }

    public void setProfesor2(Profesor profesor2) {
        this.profesor2 = profesor2;
    }


    public Profesor getProfesor3() {
        return profesor3;
    }

    public void setProfesor3(Profesor profesor3) {
        this.profesor3 = profesor3;
    }
}


