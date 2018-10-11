package minhasClasses;
import java.util.HashMap;

public class Tabela {
      private HashMap<String,Simbolo> tab;
      int proximaReferencia;

      public Tabela() {
            this.tab = new HashMap<String,Simbolo>();
      }
      
      public void incluiSimbolo(Simbolo _simb) {
            if(!this.tab.containsKey(_simb.getLexema()))
                  this.tab.put(_simb.getLexema(),_simb);
      }
      
      public boolean verificaExistenciaSimbolo(String _chave) {
          return this.tab.containsKey(_chave);
    }
    
      public Simbolo consultaSimbolo(String _chave) {
    	  if(this.tab.containsKey(_chave))
    		  return this.tab.get(_chave);
    	  return null;
      }
      
      public int consultaReferencia(String _chave) {
            return ((Simbolo)this.tab.get(_chave)).getReferencia();
      }
      
      public TipoDado consultaTipo(String _chave) {
    	  return this.tab.get(_chave).tipo;
      }
      
      public String toString() {
            return this.tab.toString();
      }
}