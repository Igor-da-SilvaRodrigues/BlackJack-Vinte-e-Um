
package blackjackvinteum.players;
import blackjackvinteum.enums.Naipe;
import blackjackvinteum.enums.Valores;

/**
 *
 * @author Igor da Silva Rodrigues
 */
public class Cards {
    private final Naipe naipe;
    private final Valores valor;
    private String icon;
    
    public Cards(Naipe naipe, Valores valor){
        this.icon = "/cards/imagens/";
        this.naipe = naipe;
        this.valor = valor;
        this.icon = this.icon + valor.toString();
        this.icon = this.icon + naipe.toString();
        this.icon = this.icon + ".png";
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public Valores getValor() {
        return valor;
    }

    public String getIconPath() {
        return icon;
    }
}
