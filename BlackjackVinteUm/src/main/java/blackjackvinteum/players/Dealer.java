/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackvinteum.players;
import java.util.Stack;
import blackjackvinteum.enums.Naipe;
import blackjackvinteum.enums.Valores;
import java.util.Random;

/**
 *
 * @author rodri
 */
public class Dealer {
    private Integer hand = 0;
    Stack<Cards> deck;

    public Dealer() {
        this.deck = new Stack<>();
        Random random = new Random();
        
        for (Naipe i = Naipe.PAUS; i.getNaipe()<=4; i.nextNaipe()){
            for (Valores j = Valores.UM; j.getValor()<=13; j.nextValor()){
                if (i.getNaipe() == 1 && j.getValor() == 1){
                    deck.push(new Cards(i, j));
                }else{
                    deck.insertElementAt(new Cards(i, j), random.nextInt(deck.size()));
                }              
            }
        }
    }
    
    public Cards deal(){
        Cards jogada = deck.pop();
        return jogada;
    }

    public void setHand(Integer hand) {
        this.hand = hand;
    }
}
