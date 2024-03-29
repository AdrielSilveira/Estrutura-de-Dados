package Atividade_V;


public class LSE implements Lista {
    private Noh inicio;
    
    public LSE (){
        this.inicio = null;
    }

    public void insereInicio(Object info) {
        Noh novo = new Noh(info);
        if (inicio == null){
            inicio = novo;
        }
        else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public boolean estaVazia(){
        if(tamanho() == 0){
            return true;
        }
        return false;
    }

    public int tamanho(){
        Noh p = inicio;
        int i = 0;
        while (p!=null){ 
            p = p.getProx();
            i++;
        }
        return i;
    }

    public void insereFim(Object info) {
        Noh novo = new Noh(info);
        Noh ultimo;
        ultimo = null;
        if (inicio == null){
            inicio = novo;
        }
        else {
            for(Noh i=inicio; i != null; i=i.getProx()){
                ultimo = i;
            }
            ultimo.setProx(novo);
        }
    }

    public boolean remove(Object info) {
        Noh ant, p;
        p = inicio;
        ant = null;
        while (p!=null && p.getInfo() != info){ //busca
        ant = p;
        p = p.getProx();
        }
        if (p==null){
            return false;
        }
        if (ant==null){
            inicio = p.getProx();
        }
        else{
            ant.setProx(p.getProx());
        }
        return true;
    }

    public void imprime(){
        Noh p = inicio;
        while (p!=null){ 
            System.out.println(p.getInfo());
            p = p.getProx();
        }
    }
}
