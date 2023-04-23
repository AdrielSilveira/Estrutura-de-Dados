package Atividade_lV;

public class Noh {
	private Object obj;
	private Noh proximo;
	
	public Noh (Object obj1) {
		this.obj = obj1;
		this.proximo = null;
	}
	
	public Object getObj() {
		return obj;
	}
	
	public Noh getProximo() {
		return proximo;
	}
	
	public Noh setProximo(Noh n) {
		return this.proximo = n;
	}
	
	public String toString() {
		return obj.toString();
		
	}
}
