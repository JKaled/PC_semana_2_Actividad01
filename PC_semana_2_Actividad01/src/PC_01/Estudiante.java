package PC_01;


public class Estudiante {

    private int codigo;
    private String nombre;
    private double calificacion;
    
   
    

    public Estudiante(int codigo, String nombre, double calificacion){
        this.codigo = codigo;
        this.nombre = nombre;
        this.calificacion = calificacion;
        
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
     public double getCalificacion() {
        return calificacion;
    }

    public void getCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}