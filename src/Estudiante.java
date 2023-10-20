import java.util.Arrays;
import java.util.Scanner;
public class Estudiante {
    private  int matricula=0;
    private int cedula=0;
    private String nombre="";
    private String apellido="";

    Materia [] arregloMateria = new Materia[3];

    /*private Materia materia1;
    private Materia materia2;
    private Materia materia3;*/

    public Estudiante(){

    }

    /*public Estudiante(int matricula, int cedula, String nombre, String apellido, Materia materia1, Materia materia2, Materia materia3){
        this.cedula=cedula;
        this.matricula=matricula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.materia1=materia1;
        this.materia2=materia2;
        this.materia3=materia3;
    }*/

    public void ingresarDatos(){
        System.out.println("Ingrese los datos del estudiante");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: \n");
        this.nombre = sc.next();
        System.out.println("Ingrese el apellido del estudiante: \n");
        this.apellido = sc.next();
        System.out.println("Ingrese su numero de cedula: \n");
        this.cedula = sc.nextInt();
        System.out.println("Ingrese su numero de matrícula: \n");
        this.matricula = sc.nextInt();
    }

    public void imprimirDatos( int numEstudiante){
        System.out.println("El nombre del estudiante "+numEstudiante+" es: "+nombre);
        System.out.println("El apellido del estudiante es: "+apellido);
        System.out.println("La matricula es:"+matricula);
        System.out.println("La cedula es:"+cedula);
    }

    public void mostrarDatosMaterias(Materia materia, int i){

        materia.mostrarMaterias(materia, i, 1 );

    }


    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /*public Materia getMateria1() {
        return materia1;
    }

    public void setMateria1(Materia materia1) {
        this.materia1 = materia1;
    }

    public Materia getMateria2() {
        return materia2;
    }

    public void setMateria2(Materia materia2) {
        this.materia2 = materia2;
    }

    public Materia getMateria3() {
        return materia3;
    }

    public void setMateria3(Materia materia3) {
        this.materia3 = materia3;
    }*/

}
