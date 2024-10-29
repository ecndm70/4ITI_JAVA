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
        if(amarezza <= 4){
            System.out.println(nome + " è amarisima!");
        }else if(amarezza > 4 && amarezza <= 8){
            System.out.println(nome + " è neutra!");
        }else{
            System.out.println(nome + " è poco amara!");
        }
    }
    
}
