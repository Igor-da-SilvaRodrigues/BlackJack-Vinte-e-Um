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
    
}
