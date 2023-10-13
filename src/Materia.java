public class Materia {
    private String nombre="";
    private int codigo=0;
    private int numhoras=0;
    private Profesor profesor1;
    private Profesor profesor2;


    public Materia(){
    }

    public Materia(String nombre, int codigo, int numhoras, Profesor profesor1, Profesor profesor2) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.numhoras = numhoras;
        this.profesor1 = profesor1;
        this.profesor2 = profesor2;
    }

    public void mostrarMaterias(int numMateria){
        System.out.println("La materia "+numMateria+" es: "+nombre);
        System.out.println("El codigo es: "+codigo);
        System.out.println("La materia tiene "+numhoras+" horas");
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
}


