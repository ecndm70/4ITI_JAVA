public class mainDolcetto {
    public static void main(String[] args) {
        String[] Lista = {"Cioccolato", "Latte", "Zucchero"};
        Dolcetto biscottoClassico = new Dolcetto(5, 10, Lista);
        Caramella Galatina = new Caramella(9, 10, Lista, 2);

        biscottoClassico.mangia();
        biscottoClassico.print();

        Galatina.mangia();
        Galatina.recensione();
    }
}
