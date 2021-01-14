
package blackjackvinteum.enums;

/**
 *
 * @author Igor da Silva Rodrigues
 */
public enum Valores {
  UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9),
  DEZ(10), VALETE(11) , RAINHA(12), REI(13);
   private final int valor;
   
   Valores(int valor){
       this.valor = valor;
   }
   
  /**
   * Retorna o proximo valor ao objeto.<br>
   *    ex: <b>'Valores.UM.nextValor()'</b> retorna Valores.DOIS<br>
   *    ex2: <b>'Valores.REI.nextValor()'</b> retorna Valores.UM<br>
   * 
   *    a ordem dos valores é a seguinte:<br>
   *        UM-&gt;DOIS-&gt;...DEZ-&gt;VALETE-&gt;RAINHA-&gt;REI-&gt;UM...
   * @return 
   *    Valores
   */
   public Valores nextValor(){
       
       switch (this.valor){
            case 1:
                return Valores.DOIS;
            case 2:
                return Valores.TRES;
            case 3:
                return Valores.QUATRO;
            case 4:
                return Valores.CINCO;
            case 5:
                return Valores.SEIS;
            case 6:
                return Valores.SETE;
            case 7:
                return Valores.OITO;
            case 8:
                return Valores.NOVE;
            case 9:
                return Valores.DEZ;
            case 10:
                return Valores.VALETE;
            case 11:
                return Valores.RAINHA;
            case 12:
                return Valores.REI;
            case 13:
                return Valores.UM;
            default:
                return null;
        }
   }
   
    public int getValor() {
        return valor;
    }
    
    /**
     *  Usado para obter a representação em String do objeto enum.
     * @return
     *  String
     */
    @Override public String toString(){
        switch(this.valor){
            case 1:
                return "UM";
            case 2:
                return "DOIS";
            case 3:
                return "TRES";
            case 4:
                return "QUATRO";
            case 5:
                return "CINCO";
            case 6:
                return "SEIS";
            case 7:
                return "SETE";
            case 8:
                return "OITO";
            case 9:
                return "NOVE";
            case 10:
                return "DEZ";
            case 11:
                return "VALETE";
            case 12:
                return "RAINHA";
            case 13:
                return "REI";
            default:
                return null;
        }
    }
    
}
