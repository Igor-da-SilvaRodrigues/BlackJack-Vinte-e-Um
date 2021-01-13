/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackvinteum.enums;

/**
 *
 * @author rodri
 */
public enum Naipe {
    PAUS(1), OUROS(2), COPAS(3), ESPADAS(4);
    private int naipe;
    
    Naipe(int naipe){
        this.naipe = naipe;
    }
    
    public void nextNaipe(){
        if (this.naipe == 4){
            this.naipe = 1;
        }else{
            this.naipe++;
        }
    }

    public int getNaipe() {
        return naipe;
    }

    /**
     *  Usado para obter a representação em String do objeto enum.
     * @return
     *  O nome do objeto Enum.
     */
    @Override public String toString(){
        switch(this.naipe){
            case 1:
                return "PAUS";
            case 2:
                return "OUROS";
            case 3:
                return "COPAS";
            case 4:
                return "ESPADAS";
            default:
                return "ERRO";
        }
    }
  
}
