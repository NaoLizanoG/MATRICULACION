public class Profesor {
    private String nombre="";
    private String celular="";
    private int codigo=0;


    public Profesor(){

    }
    public Profesor(String nombre, String celular, int codigo) {
        this.nombre = nombre;
        this.celular = celular;
        this.codigo = codigo;
    }

    public void mostrarProfesor (){
        System.out.println("El profesor de la materia  es: "+nombre);
        System.out.println("El codigo del maestro es: "+codigo);
        System.out.println("El telefono del maestro es "+celular);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
