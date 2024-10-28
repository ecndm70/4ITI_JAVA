import java.util.ArrayList;
import java.util.List;

public class Dolcetto {
    protected int sapore; // Scala da 1 a 10;
    protected float peso;
    protected int NumIngrediente;
    protected List<String> ingredienti = new ArrayList<>(); // Lista degli ingredienti

    public Dolcetto(int sapore, float peso, int NumIngrediente){
        this.sapore = sapore;
        this.peso = peso;
        this.NumIngrediente = NumIngrediente;
    }

    // Review: Da controllare se forse è meglio mettere gli ingredienti direttamente del costruttore. --> Inoltre meglio vedere se ha senso mettere in input i dati.
    // public void specificaIngredienti(){
    //     for(int i = 0; i < NumIngrediente; i++){
    //         // Riga 19 e 20 creano l'input.
    //         Scanner objScanner = new Scanner(System.in);
    //         String ingrediente = objScanner.nextLine();

    //         // Nella lista degli ingredienti aggiungiamo l'ingrediente specifico.
    //         ingredienti.add(ingrediente);
    //     }
    // }

    public void mangia(){
        if(sapore <= 4){
            System.out.println("Questo dolcetto non è nulla di che!");
        }else if(sapore > 4 && sapore <= 8){
            System.out.println("Questo dolcetto è abbastanza buono!");
        }else{
            System.out.println("Questo dolcetto è buonissimo!");
        }
    }

    // Debug:
    public void print(){
        System.out.println("ingredienti: " + ingredienti);
    }
}
