import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Bienvenido a tu sistema de matriculación");
         Estudiante estudiante1=new Estudiante();
         estudiante1.ingresarDatos();


         Materia materia1= new Materia();
         materia1.ingresarMateria(1);
         materia1.datosProfesores();

        Materia materia2= new Materia();
        materia2.ingresarMateria(2);
        materia2.datosProfesores();

        Materia materia3= new Materia();
        materia3.ingresarMateria(3);
        materia2.datosProfesores();

        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("Sus datos son:");
        estudiante1.imprimirDatos(1);
        System.out.println("Ingrese el número de materia del que quiera conocer los datos");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        estudiante1.mostrarDatosMaterias(materia1, 1);



    }
}