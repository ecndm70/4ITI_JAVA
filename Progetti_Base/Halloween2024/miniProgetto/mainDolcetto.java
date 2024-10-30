public class mainDolcetto {
	public static void main(String[] args) {

		Dolcetto biscottoClassico = new Dolcetto("Nutella Biscuits", 5, 10, new String[]{"Cioccolato", "Latte", "Zucchero"});
		Caramella Galatina = new Caramella("Galatina", 9, 10, new String[]{"Latte"}, 10);

		biscottoClassico.mangia();

		Galatina.mangia();
		Galatina.recensione();
	}
}
