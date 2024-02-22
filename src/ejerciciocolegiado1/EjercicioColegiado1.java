
package ejerciciocolegiado1;



public class EjercicioColegiado1 {


    public static void main(String[] args) {
        Cancion generarCancion = new Cancion();//generearCancion es un objeto. Este es el constructor siendo llamado
        generarCancion.setNombreCancion("Burn");
        generarCancion.setTitulo("VULTURES 1");
        generarCancion.setAutor("Kanye West");
        generarCancion.setDuracion("2:34");
        generarCancion.setAño("2024");
        
                   
        System.out.println(generarCancion.getNombreCancion());
        System.out.println(generarCancion.getTitulo());
        System.out.println(generarCancion.getAutor());
        System.out.println(generarCancion.getDuracion());
        System.out.println(generarCancion.getAño());
        
       
      
    }
    
}
