package AgendaTelefonica;

public class Agenda {
    //Constantes
    public static final int MAX = 10;
    //Atributo
    Contacto[] agenda = new Contacto[MAX];

    //Contructores
    public Agenda() {

    }

    public Agenda(Contacto[] agenda) {
        this.agenda = agenda;
    }

    //Metodos

    public void listarContactos() {
        for (int i = 0; i < MAX && agenda[i] != null; i++) {
            System.out.println("Nombre: " + agenda[i].getNombre() + "-Número: " + agenda[i].getNumero() + "\n");
        }
    }

    public boolean registrarContacto(Contacto contacto) {
        for (int i = 0; i < MAX; i++) {
            if (agenda[i] == null) {
                agenda[i] = contacto;
                return true;
            }
        }
        return false;
    }
    public String buscarContacto(String nombre){
        String numero=null;
        for(int i=0; i<MAX; i++){
            if(agenda[i]!=null && agenda[i].getNombre().equals(nombre)){
               numero = agenda[i].getNumero();
            }
        }
        return numero;
    }
    public int disponibles(){
        int contador=0;
        for(int i=0; i<MAX; i++){
            if(agenda[i]==null){
                contador++;
            }
        }
        return MAX-contador;
    }

}
