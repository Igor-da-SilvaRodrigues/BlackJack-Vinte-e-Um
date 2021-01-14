
package blackjackvinteum.enums;

/**
 *
 * @author Igor da Silva Rodrigues
 */
public enum Naipe {
    PAUS(1), OUROS(2), COPAS(3), ESPADAS(4);
    private final int naipe;
    
    Naipe(int naipe){
        this.naipe = naipe;
    }
    
    /**
     * Retorna o proximo valor ao objeto.<br>
     *     &nbsp;ex: <b>'Naipe.PAUS.nextNaipe()'</b> retorna 'Naipe.OUROS'<br>
     *     &nbsp;ex2: <b>'Naipe.ESPADAS.nextNaipe()'</b> retorna 'Naipe.PAUS'<br>
     *      
     *     &nbsp;a ordem dos naipes é a seguinte:<br>
     *         &emsp;PAUS-&gt;OUROS-&gt;COPAS-&gt;ESPADAS-&gt;PAUS...    
     * @return 
     *      Naipe
     */
    public Naipe nextNaipe(){
        switch(this.naipe){
            case 1:
                return Naipe.OUROS;
            case 2:
                return Naipe.COPAS;
            case 3:
                return Naipe.ESPADAS;
            case 4:
                return Naipe.PAUS;
            default:
                return null;
        }
    }

    public int getNaipe() {
        return naipe;
    }

    /**
     *  Usado para obter a representação em String do objeto enum.
     * @return
     *  String
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
