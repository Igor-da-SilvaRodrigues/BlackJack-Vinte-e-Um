
package blackjackvinteum.players;
import java.util.Stack;
/**
 *
 * @author Igor da Silva Rodrigues
 */
public class Player {
    private Integer handTotal = 0;
    private Stack<Cards> hand;
    
    public Player(){
        hand = new Stack<>();
    }

    public void setHandTotal(Integer handTotal) {
        this.handTotal = handTotal;
    }
    
    public Integer getHandTotal(){
        return handTotal;
    }
    
    public Stack<Cards> getHand() {
        return hand;
    }
    
    public void addHand(Cards card){
        this.handTotal = this.handTotal + card.getValor().getValor();
        hand.push(card);
    }    
}
