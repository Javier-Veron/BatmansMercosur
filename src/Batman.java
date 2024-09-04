package src;

public class Batman{

    String nacionalidad,otroIdioma;
    boolean anglosajon;
    int medialunasIngeridas;

    public Batman(){

        nacionalidad = null;
        otroIdioma = null;
        anglosajon = false;
        medialunasIngeridas = 0;

    }

    public Batman(boolean anglosajon){

        this.anglosajon = anglosajon;


    }

    public Batman(String nacionalidad,String otroIdioma,boolean anglosajon){

        this.nacionalidad = nacionalidad;
        this.otroIdioma = otroIdioma;
        this.anglosajon = anglosajon;
        medialunasIngeridas = 0;

    }

    public void comer(int cantidad){
        medialunasIngeridas += cantidad;
    }

    public boolean esKryngo(){

        return nacionalidad.equals("Krypton") ;

    }

    public boolean necesitaTraductor(){
        return anglosajon && otroIdioma == null;
    }

    public void esComilon(){
        medialunasIngeridas += 6;

    }

    public boolean esGoloso(){

        return medialunasIngeridas >= 1500;

    }

}
