public class Lab1 {
	public static void main(String[] args) {
		Thread h = new Thread(()->System.out.println(" in run method of Lab1OldHelper"));
		h.start();
	}
}
