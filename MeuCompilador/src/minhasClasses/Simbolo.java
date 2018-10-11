package minhasClasses;

import jdk.nashorn.internal.parser.Token;

public class Simbolo {
      private String nome;      //nome da variável
      private int referencia;   //referência usada na geração do código destino
      protected TipoDado tipo;
      Token token;
      
      public Simbolo(Token token, TipoDado tipo) {

      }
      
      public Simbolo(Token token, TipoDado tipo, int referencia) {

      }
      
      public String getLexema() {
            return this.nome;
      }
      
      public TipoDado getTipo() {
    	  return this.tipo;
      }
      
      public int getReferencia() {
            return this.referencia;
      }
      
      public String toString() {
            return "Nome:" + this.getLexema() + " / " + "Referência:" + this.getReferencia() + "\n";
      }
}