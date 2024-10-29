import java.util.Arrays;

public class Dolcetto {
    protected String nome;
    protected int sapore; // Scala da 1 a 10;
    protected float peso;
    protected String[] ingredienti; // Array degli ingredienti

    // Da cambiare:
    public Dolcetto(String nome, int sapore, float peso, String[] ingredienti){
        this.nome = nome;
        this.sapore = sapore;
        this.peso = peso;
        this.ingredienti = ingredienti;
    }

    public void mangia(){
        String listaIngr = String.join(",", ingredienti);
        System.out.print(nome + " è composto da: " + listaIngr + ".\n");

        if(sapore <= 4){
            System.out.println(nome + " non è nulla di che!");
        }else if(sapore > 4 && sapore <= 8){
            System.out.println(nome + " è abbastanza buono!");
        }else{
            System.out.println(nome + " è buonissimo!");
        }
    }

    // Debug:
    public void print(){
        System.out.println("ingredienti: " + Arrays.toString(ingredienti));
    }
}
