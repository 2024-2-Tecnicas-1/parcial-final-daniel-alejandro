
package logicaNegocio;


public class Principal {
    public static void main(String[] args) {
        Animal leon = new Leon();
        Animal delfin = new Delfin();
        Perro perro = new Perro();

        System.out.println("León:");
        System.out.println("Sonido: " + leon.emitirSonido());
        System.out.println("Dieta: " + leon.obtenerDieta());
   

        System.out.println("Delfín:");
        System.out.println("Sonido: " + delfin.emitirSonido());
        System.out.println("Dieta: " + delfin.obtenerDieta());


        System.out.println("Perro:");
        System.out.println("Sonido: " + perro.emitirSonido());
        System.out.println("Dieta: " + perro.obtenerDieta());
        System.out.println("Interacción con humanos: " + perro.interactuarConHumano());
    }
}
