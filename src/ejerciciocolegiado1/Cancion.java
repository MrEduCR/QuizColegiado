
package ejerciciocolegiado1;


public class Cancion {
    
    private String nombreCancion;
    private String titulo;
    private String autor;
    private String duracion;
    private String año;

    public Cancion(){ // este es el constructor y crea el objeto en memoria y asigna varas. Si lleva argumentos se pone en main
    
    }
    
    
    
    public String getNombreCancion() {
        return nombreCancion;
    }

    public void setNombreCancion(String nombreCancion) {
        this.nombreCancion = nombreCancion; // se refiere a al nombre del objeto y no al str
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

}
