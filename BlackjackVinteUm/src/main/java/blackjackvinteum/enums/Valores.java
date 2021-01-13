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
public enum Valores {
  UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9),
  DEZ(10), VALETE(11) , RAINHA(12), REI(13);
   private int valor;
   
   Valores(int valor){
       this.valor = valor;
   }
   
   public void nextValor(){
       if (this.valor == 13){
           this.valor = 1;
       }else{
           this.valor++;
       }
   }
   
    public int getValor() {
        return valor;
    }
    
    /**
     *  Usado para obter a representação em String do objeto enum.
     * @return
     *  O nome do objeto Enum.
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
                return "ERRO";
        }
    }
    
}
