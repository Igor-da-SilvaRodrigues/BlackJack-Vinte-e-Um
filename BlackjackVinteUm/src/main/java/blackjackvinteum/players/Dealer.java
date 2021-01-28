
package blackjackvinteum.players;
import java.util.Stack;
import blackjackvinteum.enums.Naipe;
import blackjackvinteum.enums.Valores;
import java.util.Random;

/**
 *
 * @author Igor da Silva Rodrigues
 */
public class Dealer {
    private boolean standing = false;
    private Integer handTotal = 0;
    Stack<Cards> deck;
    Stack<Cards> hand;

    public Dealer() {
        this.deck = new Stack<>();
        this.hand = new Stack<>();
        Random random = new Random();
        
        for (Naipe i = Naipe.PAUS; i.getNaipe()<=4; i = i.nextNaipe()){
            for (Valores j = Valores.UM; j.getValor()<=13; j = j.nextValor()){                
                if (i.getNaipe() == 1 && j.getValor() == 1){
                    deck.push(new Cards(i, j));
                }else{
                    deck.insertElementAt(new Cards(i, j), random.nextInt(deck.size()));
                } 
                if (j.getValor() == 13) {  break; }
            }
            if (i.getNaipe() == 4 ) { break; }
        }
        
        Cards aux = deck.pop();
        deck.insertElementAt(aux, random.nextInt(deck.size()));
        
    }
    
    public Cards deal(){
        Cards jogada;
        try{
            jogada = deck.pop();
        }catch(java.util.EmptyStackException e){
            jogada = null;
        }
        
        return jogada;
    }
    
    public Cards bet(){
        Cards cartaAtual = null;
        if (this.handTotal < 17 && standing == false){
            cartaAtual = this.deal();
            if (cartaAtual != null){
                this.addHand(cartaAtual);
            }
        }else{
            this.stand();
        }
        return cartaAtual;
    }
    
    public void stand(){
        this.standing = true;
    }
    
    public boolean isStanding() {
        return standing;
    }
    
    public Integer getHandTotal() {
        return handTotal;
    }
    
    public void setHandTotal(Integer hand) {
        this.handTotal = hand;
    }
    
    public void addHand(Cards card){
        this.handTotal = this.handTotal + card.getValor().getValor();
        hand.push(card);
    }

    public Stack<Cards> getHand() {
        return hand;
    }
}
