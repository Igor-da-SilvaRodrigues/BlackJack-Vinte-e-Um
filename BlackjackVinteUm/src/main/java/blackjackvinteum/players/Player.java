/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackvinteum.players;

/**
 *
 * @author rodri
 */
public class Player {
    private Integer hand = 0;

    public void setHand(Integer hand) {
        this.hand = hand;
    }
    
    public Integer getHand(){
        return hand;
    }
    
    public void addHand(Integer hand){
        this.hand = this.hand + hand;
    }
    
}
