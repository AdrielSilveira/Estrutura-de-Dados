package Trab_ind;

import java.util.Stack;

public class pilhaAluno {
    private Stack<Aluno> pilha;

    public pilhaAluno() {
        pilha = new Stack<>();
    }

    public int size() {
        return pilha.size();
    }

    public boolean isEmpty() {
        return pilha.isEmpty();
    }

    public Aluno top() {
        if (isEmpty()) {
            return null;
        }
        return pilha.peek();
    }

    public void push(Aluno aluno) {
        pilha.push(aluno);
    }

    public Aluno pop() {
        if (isEmpty()) {
            return null;
        }
        return pilha.pop();
    }
}
