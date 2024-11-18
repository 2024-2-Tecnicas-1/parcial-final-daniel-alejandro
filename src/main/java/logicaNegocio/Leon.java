package logicaNegocio;

public class Leon extends Animal {

    @Override
    public void obtenerDieta() {
        super.obtenerDieta();     }

    @Override
    public String emitirSonido() {
        super.emitirSonido();
        System.out.println("Rugido");
    }

    
    
}
