package p_6.Wallet;

public class Run {

	public static void main(String[] args) {
		
		Wallet w = new Wallet(3, "¿ÕÁ·¹ßº¸½Ó", "¿øÇÒ¸Å");
		
		System.out.println(w.toString());

		Wallet w2 = new Wallet(1, "Ä«Æä");
		Wallet w3 = new Wallet("¿Ê°¡°Ô", "È«±æµ¿");
	}

}
