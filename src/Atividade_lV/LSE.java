package Atividade_lV;

public class LSE {
	private Noh inicio;
	
	public LSE() {
		this.inicio = null;
	}
	
	public void insereInicio(Object obj) {
		Noh novo = new Noh(obj);
		if(inicio == null) {
			inicio = novo;
		}
		else {
			novo.setProximo(inicio);
			inicio = novo;
			}
	}
	
	public void insereFim(Object obj) {
		Noh novo = new Noh(obj);
		if(inicio == null) {
			inicio = novo;
		}
		else { 
			Noh ultimo = null;
			for(Noh i = inicio;i != null; i = i.getProximo())
				ultimo = i;
			ultimo.setProximo(novo);
		}
	}
	
	public boolean remove(Object obj) {
		Noh ant = null, p;
		p = inicio;
		
		while(p!= null && p.getObj() != obj) {
			ant =p;
			p = p.getProximo();
		}
		if(p==null) {
			return false;}
		if(ant == null) {
			inicio =p .getProximo();
		}else { 
			ant.setProximo(p).getProximo();
		}
		return true;
	}
	
	public boolean estaVazia() {
		return inicio == null;
	}
	
	
	public int tamanho() {
		int cont = 0;
		for(Noh i = inicio; i!= null;i = i.getProximo())
			cont++;
			return cont;
	}
	
	public void imprime(){ 
		Noh p = inicio;
		while(p != null) {
			System.out.println(p.getObj());
		p = p.getProximo();
	}	
}
}