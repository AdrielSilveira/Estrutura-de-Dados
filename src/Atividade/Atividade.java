package Atividade;

public class Atividade {

	public static void main(String[] args){
		
			
		 PontoCartesiano x,y;
		 
		 x = new PontoCartesiano(5.0, 3.0);
		 y = new PontoCartesiano(5.0, 3.0);
		 
		 double Resultado = PontoCartesiano.Distancia(x, y);
		 System.out.println(Resultado);
	 }
}