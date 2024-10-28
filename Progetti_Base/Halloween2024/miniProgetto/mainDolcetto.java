public class mainDolcetto {
    public static void main(String[] args) {
        Dolcetto biscottoClassico = new Dolcetto(5, 10, 2);
        Caramella Galatina = new Caramella(9, 10, 1, 10);

        biscottoClassico.specificaIngredienti();
        biscottoClassico.mangia();
        biscottoClassico.print();

        Galatina.specificaIngredienti();
        Galatina.mangia();
        Galatina.recensione();
    }
}
