package logicaNegocio;

class Leon extends Animal {
    
    TipoHabitat habitat = TipoHabitat.TERRESTRE;

    @Override
    public String emitirSonido() {
        return "Rugido";
    }

    @Override
    public String obtenerDieta() {
        return "Carnívoro";
    }

    public TipoHabitat getHabitat() {
        return habitat;
    }
}
