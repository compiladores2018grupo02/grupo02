package comandosAltoNivel;

import comandoPrimitivo.ListaComandosPrimitivos;
import minhasClasses.Expressao;

public abstract class ComandoCondicional extends ComandoAltoNivel {

	Expressao expressao;
	ListaComandosAltoNivel listacomandosAltoNivelTrue;

	public abstract ListaComandosPrimitivos geraListaComandosPrimitivos();

	public abstract String toString();

}
