import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Materia materia1=new Materia();
        materia1.setNombre("Programacion");
        materia1.setCodigo(15);
        materia1.setNumhoras(3);
        Profesor profesor1=new Profesor();
        profesor1.setNombre("Juan Medina");
        profesor1.setCelular("0987456324");
        profesor1.setCodigo(15);

        Materia materia2=new Materia();
        materia2.setNombre("Calculo");
        materia2.setCodigo(20);
        materia2.setNumhoras(4);
        Profesor profesor2=new Profesor();
        profesor2.setNombre("Lola Perez");
        profesor2.setCelular("0978632541");
        profesor2.setCodigo(20);

        Materia materia3=new Materia();
        materia3.setNombre("Ciudadania");
        materia3.setCodigo(25);
        materia3.setNumhoras(2);
        Profesor profesor3=new Profesor();
        profesor3.setNombre("Carla Malta");
        profesor3.setCelular("096359878");
        profesor3.setCodigo(25);


        System.out.println("---------------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = sc.next();
        System.out.println("Ingrese el apellido del estudiante: ");
        String apellido = sc.next();
        System.out.println("Ingrese la matricula: ");
        int matricula = sc.nextInt();
        System.out.println("Ingrese la cedula: ");
        int cedula = sc.nextInt();

        Estudiante estudiante1 = new Estudiante(matricula,cedula,nombre,apellido, materia1, materia2, materia3);
        estudiante1.imprimirDatos(1);
        System.out.println("---------------------------------------------------------");
        materia1.mostrarMaterias(1);
        profesor1.mostrarProfesor(1);
        System.out.println("---------------------------------------------------------");
        materia2.mostrarMaterias(2);
        profesor2.mostrarProfesor(2);
        System.out.println("---------------------------------------------------------");
        materia3.mostrarMaterias(3);
        profesor3.mostrarProfesor(3);

    }
}