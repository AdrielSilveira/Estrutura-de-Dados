package Palindromo;
import java.util.Scanner;
import java.util.Stack;

public class main {
	    public static boolean palindromo(String palavra) {
	        palavra = palavra.toLowerCase(); // Convertendo a palavra para letras minúsculas

	        Stack<Character> pilha = new Stack<>();

	        // Preenchendo a pilha com as letras da metade inicial da palavra
	        for (int i = 0; i < palavra.length() / 2; i++) {
	            char letra = palavra.charAt(i);
	            pilha.push(letra);
	        }

	        // Verificando se a palavra é um palíndromo comparando as letras da pilha com as letras da metade final da palavra
	        int inicio;
	        if (palavra.length() % 2 == 0) {
	            inicio = palavra.length() / 2;
	        } else {
	            inicio = (palavra.length() / 2) + 1;
	        }

	        for (int i = inicio; i < palavra.length(); i++) {
	            char letra = palavra.charAt(i);
	            if (pilha.isEmpty() || letra != pilha.pop()) {
	                return false;
	            }
	        }

	        return true;
	    }

	    public static void printPilha(Stack<Character> pilha) {
	        if (pilha.isEmpty()) {
	            System.out.println("A pilha está vazia.");
	            return;
	        }

	        System.out.println("Estado da pilha:");
	        for (char letra : pilha) {
	            System.out.println(letra);
	        }
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite uma palavra: ");
	        String palavra = scanner.nextLine();
	        scanner.close();

	        boolean resultado = palindromo(palavra);

	        System.out.println("A palavra '" + palavra + "' é um palíndromo? " + resultado);
	    }
	}

