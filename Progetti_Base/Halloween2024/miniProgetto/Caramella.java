public class Caramella extends Dolcetto {
    private int dolcezza; // Scala da 1 a 10;
    
    public Caramella(int sapore, float peso, int NumIngrediente, int dolcezza){
        super(sapore, peso, NumIngrediente);

        this.dolcezza = dolcezza;
    }

    @Override
    public void mangia(){
        if(dolcezza <= 4){
            System.out.println("Questa caramella è poco dolce!");
        }else if(dolcezza > 4 && dolcezza <= 8){
            System.out.println("Questa caramella è neutra!");
        }else{
            System.out.println("Questa caramella è dolcissima!");
        }
    }

    public void recensione(){
        if(ingredienti != null){
            System.out.println("Questo dolce è composto da:\n" + ingredienti + "\nPesa: " + peso + "g e da una scala da 0 a 10 ha una dolcezza pari a: " + dolcezza);
        }else{
            System.out.println("Questo dolce pesa: " + peso + "g e da una scala da 0 a 10 ha una dolcezza pari a: " + dolcezza);
        }
    }
}
