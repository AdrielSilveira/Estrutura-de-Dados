package Trab_ind;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Queue<Aluno> filaAlunos = new LinkedList<>();
        filaAlunos.add(new Aluno("João", 20));
        filaAlunos.add(new Aluno("Maria", 22));
        filaAlunos.add(new Aluno("Pedro", 21));

        pilhaAluno pilha = new pilhaAluno();

        while (!filaAlunos.isEmpty()) {
            pilha.push(filaAlunos.poll());
        }

        System.out.println("Estado da pilha:");
        printPilha(pilha);
    }
    
    public static void printPilha(pilhaAluno pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
            return;
        }

        Stack<Aluno> tempStack = new Stack<>();
        while (!pilha.isEmpty()) {
            Aluno aluno = pilha.pop();
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
            tempStack.push(aluno);
        }

        while (!tempStack.isEmpty()) {
            pilha.push(tempStack.pop());
        }
    }
}
