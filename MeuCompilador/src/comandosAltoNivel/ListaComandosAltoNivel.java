package comandosAltoNivel;

import java.util.LinkedList;

import comandoPrimitivo.ListaComandosPrimitivos;

public class ListaComandosAltoNivel extends ComandoAltoNivel{
	LinkedList<ComandoAltoNivel> listaComandosAltoNivel;

	public ListaComandosPrimitivos geraListaComandosPrimitivos() {
		//IMPLEMENTAÇAO VAI AQUI############################3
		return null;
	}

	public void addComando(ComandoAltoNivel comando) {
		//IMPLEMENTAÇAO VAI AQUI############################3	
	}

	public LinkedList<ComandoAltoNivel> getListaComandosAltoNivel(){
		return this.listaComandosAltoNivel;
	}
	
	public String toString() {
		//ACHO QUE ESTA BEM ERRADO RECURSAO INFINITA##############33
		return this.listaComandosAltoNivel.toString();
	}

}
