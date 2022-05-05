package Atividade_ll;

public class Vector {

	private int val = 0;
	private Aluno alunos[];
	
	public void Vetor(int tam) {
		this.alunos = new Aluno[tam]; 
	}
	
	public void adiciona(Aluno aluno) {
		this.alunos[val] = aluno;
		this.val++;
	}
	
	public int tamanho() {return val;}
	
	public boolean contem(Aluno aluno){
		for(int i = 0; i < val; i++) {
			if (this.alunos[i] == ) {
				return true;
			}
		}
		return false;
	}
	
}
