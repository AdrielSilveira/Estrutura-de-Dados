package Atividade;


public class PontoCartesiano {
	
	private double x;
	private double y;
	
	public PontoCartesiano(double x,double y) {
		this.x = x;
		this.y = y;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y =y;
	}
	
	public static double Distancia(PontoCartesiano x, PontoCartesiano y) {
		
		double x1, y1, resposta;
	
		 x1 = Math.pow(x.getX() - x.getY(),2);
		 y1 = Math.pow(y.getX() - y.getY(),2);
		 resposta =Math.sqrt(x1 + y1);
		 
		 return  resposta;
	}
}
