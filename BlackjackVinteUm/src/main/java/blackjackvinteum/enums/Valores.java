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
  UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10), VALETE(11) , RAINHA(12), REI(13);
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
    
    
}
