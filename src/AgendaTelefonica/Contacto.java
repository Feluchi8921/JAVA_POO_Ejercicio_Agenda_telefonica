package AgendaTelefonica;

public class Contacto {
    //Atributos
    private String nombre;
    private String numero;

    //Constructores

    public Contacto() {
        this.nombre = nombre;
        this.numero = numero;
    }

    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
