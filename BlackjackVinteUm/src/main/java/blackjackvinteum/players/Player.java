
package blackjackvinteum.players;

/**
 *
 * @author Igor da Silva Rodrigues
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
