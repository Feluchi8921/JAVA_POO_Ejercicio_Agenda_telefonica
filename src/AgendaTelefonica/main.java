package AgendaTelefonica;

public class main {
    public static void main (String []args){
        Agenda agenda1 = new Agenda();
        Contacto contacto1 = new Contacto();
        Contacto contacto2 = new Contacto();

        //Setear contactos
        contacto1.setNombre("Felicitas");
        contacto1.setNumero("2494026987");
        contacto2.setNombre("Sebastian");
        contacto2.setNumero("2281470905");

        //Registrar contactos

        agenda1.registrarContacto(contacto1);
        agenda1.registrarContacto(contacto2);

        //Listar contactos
        agenda1.listarContactos();

        //Buscar Contacto
        System.out.println("El número del contacto de "+contacto1.getNombre()+" es "+agenda1.buscarContacto(contacto1.getNombre()));

    }
}
