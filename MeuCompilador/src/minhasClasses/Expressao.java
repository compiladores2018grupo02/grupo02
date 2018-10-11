package minhasClasses;

import java.util.LinkedList;

public class Expressao extends Item {

	
	LinkedList<Item> expressaoInfixa= new LinkedList<Item>();
	LinkedList<Item> expressaoPosfixa= new LinkedList<Item>();
	
	public Expressao() {
		
	}
	

	public void addItemInfixo(Item _item) {
		this.expressaoInfixa.add(_item);
	}


	public void addItemPosfixo(Item _item) {
		this.expressaoPosfixa.add(_item);
	}

	public TipoDado getTipo() {
		//INSERIR CODIGO###############
		return null;
	}
	
	public String geraCodigoDestino() {
		//INSERIR CODIGO AQUI########
		return "";
	}

	public LinkedList<Item> getExpressaoInfixa() {
		return expressaoInfixa;
	}


	public LinkedList<Item> getExpressaoPosfixa() {
		return expressaoPosfixa;
	}


	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
