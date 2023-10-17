import java.util.Scanner;
public class Estudiante {
    private  int matricula=0;
    private int cedula=0;
    private String nombre="";
    private String apellido="";
    private Materia materia1;
    private Materia materia2;
    private Materia materia3;

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

    public void imprimirTodosProfesores (){
        System.out.println("Profesor 1 de la materia: "+materia1.getNombre()+" es: "+materia1.getProfesor1().getNombre());
        System.out.println("Profesor 2 de la materia: "+materia3.getNombre()+" es: "+materia3.getProfesor2().getNombre());
        System.out.println("Profesor 3 de la materia: "+materia2.getNombre()+" es: "+materia2.getProfesor3().getNombre());
    }
    public void materiaEstudiante(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese Materia 1: \n");
        String materia1 = sc.next();
        System.out.println("Ingrese Materia 2: \n");
        String materia2 = sc.next();
        System.out.println("Ingrese Materia 3: \n");
        String materia3 = sc.next();

    }

    public void mostrarDatosMaterias(Materia materia, int i){

       switch (i){
            case 1:
                materia.mostrarMaterias(1);
            case 2:
                materia.mostrarMaterias(2);
            case 3:
                 materia.mostrarMaterias(3);
    }}

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

    public Materia getMateria1() {
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
    }

}
