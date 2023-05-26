package P1;

public class ex_2 {
	
	public void selectionSort () {
		
		   for (int i = posMaior; i  >= 0; i--) {
			      int maior = this.posMaior( i );
			         if (maior != i) 
			            this.troca (i, maior);
			      }
			}
		private int posMaior (int fim) {
		   int maior = fim;
		   for (int i = fim-1; i >= 0; i--)
		      if (valor[i] > valor[maior])
		         maior = i;
		   return maior;
		}
		private void troca (int a, int b) {
		   float aux;
		   aux = valor[a];
		   valor[a] = valor[b];
		   valor[b] = aux;
		}

}
