import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        // llamar a materia (a las 3 con sus respectivos datos de profesores)
         Materia materia1= new Materia();
         materia1.bienvenido();
         materia1.ingresarMateria(1);
         materia1.datosProfesores();

        Materia materia2= new Materia();
        materia2.ingresarMateria(2);
        materia2.datosProfesores();

        Materia materia3= new Materia();
        materia3.ingresarMateria(3);
        materia3.datosProfesores();




      /*  System.out.println("Ingrese los datos de los estudiantes");
        Estudiante estudiante1=new Estudiante();
        estudiante1.ingresarDatos();*/

        Estudiante estudiante1 = new Estudiante();
        estudiante1.ingresarDatos();

                estudiante1.imprimirDatos(1);


                estudiante1.mostrarDatosMaterias(materia1, 1);

                estudiante1.mostrarDatosMaterias(materia2, 2);

                estudiante1.mostrarDatosMaterias(materia3, 3);


        }

}


