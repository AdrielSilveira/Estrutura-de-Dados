package Atividade_Vl_2;

public class Noh {
    private Object info;
    private Noh ant;
    private Noh prox;
    
    public Noh (Object info){
        this.info = info;
        this.ant = null;
        this.prox = null;
    }
    
    public Object getInfo(){
        return this.info;
    }
    public Noh getProx(){
        return this.prox;
    }
    public Noh getAnt(){
        return this.ant;
    }
    
    public void setProx(Noh n){ 
        this.prox = n; 
    }
    public void setAnt(Noh n){ 
        this.ant = n; 
    }
}
