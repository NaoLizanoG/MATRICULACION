import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------------------------");
        System.out.println("Bienvenido a tu sistema de matriculación");
        System.out.println("Para iniciar, ingrese los datos de las materias correspondientes a este semestre");


         Materia materia1= new Materia();
         materia1.ingresarMateria(1);
         materia1.datosProfesores();

        Materia materia2= new Materia();
        materia2.ingresarMateria(2);
        materia2.datosProfesores();

        Materia materia3= new Materia();
        materia3.ingresarMateria(3);
        materia3.datosProfesores();

        System.out.println("Ingrese los datos de los estudiantes");
        Estudiante estudiante1=new Estudiante();
        estudiante1.ingresarDatos();

        System.out.println("Decida el profesor de la materia 1");
        Scanner sc = new Scanner(System.in);
        int mat1 = sc.nextInt();
        System.out.println("Decida el profesor de la materia 2");
        int mat2 = sc.nextInt();
        System.out.println("Decida el profesor de la materia 3");
        int mat3 = sc.nextInt();


        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("---------------------------------------------------------");
        System.out.println("Sus datos son:");
        estudiante1.imprimirDatos(1);

        int i=0;
        do {

        System.out.println("Ingrese el número de materia del que quiera conocer los datos");
        i = sc.nextInt();
        switch (i) {
            case 1:
                estudiante1.mostrarDatosMaterias(materia1, i, mat1);
                break;
            case 2:
                estudiante1.mostrarDatosMaterias(materia2, i, mat2);
                break;
            case 3:
                estudiante1.mostrarDatosMaterias(materia3, i, mat3);
                break;
            default:
                System.out.println("Número inválido");
        }


        }while (i>0 && i<4);
    }
}