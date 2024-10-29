import java.util.Arrays;

public class Dolcetto {
    protected int sapore; // Scala da 1 a 10;
    protected float peso;
    protected String[] ingredienti; // Array degli ingredienti

    // Da cambiare:
    public Dolcetto(int sapore, float peso, String[] ingredienti){
        this.sapore = sapore;
        this.peso = peso;
        this.ingredienti = ingredienti;
    }

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
        System.out.println("ingredienti: " + Arrays.toString(ingredienti));
    }
}
