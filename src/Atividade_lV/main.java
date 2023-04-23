package Atividade_lV;

public class main {
	
	public static void main(String args[]) {
		
		Aluno Al1 = new Aluno("Felipe", 23, "Es");
		Aluno Al2 = new Aluno("Guilherme ", 30, "Es");
		Aluno Al3 = new Aluno("Adriel", 26, "Es");
		
		LSE lista = new LSE();
		
		lista.insereInicio(Al1);
		lista.insereFim(Al3);
		lista.insereFim(Al2);
		lista.imprime();
		
		System.out.println(lista.estaVazia());
		
	}
}
