public class mainDolcetto {
    public static void main(String[] args) {
        String[] lista = {"Cioccolato", "Latte", "Zucchero"};
        Dolcetto biscottoClassico = new Dolcetto(5, 10, lista);
        Caramella Galatina = new Caramella(9, 10, lista, 2);

        biscottoClassico.mangia();
        biscottoClassico.print();

        Galatina.mangia();
        Galatina.recensione();
    }
}
