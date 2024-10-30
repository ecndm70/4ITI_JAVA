public class CaramellaAmara extends Dolcetto {
    protected int amarezza;
    protected boolean sputato = false;

    public CaramellaAmara(String nome, int sapore, float peso, String[] ingredienti, int amarezza){
        super(nome, sapore, peso, ingredienti);

        this.amarezza = amarezza;
    }

    public void sputa(){
        this.sputato = !sputato;
    }

    @Override
    public void mangia(){
        
    }
    
}
