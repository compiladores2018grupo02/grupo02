package comandosAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import jdk.nashorn.internal.parser.Token;
import minhasClasses.*;

public class ComandoAtribuicao extends ComandoAltoNivel {
	Simbolo variavel;
	Expressao expressao;
	
	public ComandoAtribuicao(Token token, Simbolo _simb, Expressao _exp) {
		
	}
	@Override
	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
