package proyectohackupc;


public class Persona {
    
    //Atributos (privados)
    private String dni;
    private String nombre;
    private int edad;

    //Constructor
    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }   

    //Métodos (públicos)
    public String getDni() {
        return dni;
    }  

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }    

    public void cumpleaños() {
        edad++;
    }


    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + ", edad=" + edad + '}';
    }

}
