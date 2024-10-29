
public class Caramella extends Dolcetto {
    private int dolcezza; // Scala da 1 a 10;
    
    public Caramella(String nome, int sapore, float peso, String[] ingredienti, int dolcezza){
        super(nome, sapore, peso, ingredienti);

        this.dolcezza = dolcezza;
    }

    @Override
    public void mangia(){
        if(dolcezza <= 4){
            System.out.println(nome + " è poco dolce!");
        }else if(dolcezza > 4 && dolcezza <= 8){
            System.out.println(nome + " è neutra!");
        }else{
            System.out.println(nome + " è dolcissima!");
        }
    }

    public void recensione(){
        String listaIngr = String.join(",", ingredienti);
        System.out.print(nome + " è composto da: " + listaIngr + ".");

        System.out.println(" pesa: " + peso + "g ed è");
        if(dolcezza <= 4){
            System.out.println("per niente dolce.");
        }else if(dolcezza > 4 && dolcezza <= 8){
            System.out.println("poco dolce.");
        }else{
            System.out.println("molto dolce.");
        }
    }
}
