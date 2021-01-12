/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjackvinteum.players;
import blackjackvinteum.enums.Naipe;
import blackjackvinteum.enums.Valores;

/**
 *
 * @author rodri
 */
public class Cards {
    private final Naipe naipe;
    private final Valores valor;
    
    public Cards(Naipe naipe, Valores valor){
        this.naipe = naipe;
        this.valor = valor;
    }
}
