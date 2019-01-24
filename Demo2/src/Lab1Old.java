class Lab1OldHelper implements Runnable {
	@Override
	public void run() {
		System.out.println(" in run method of Lab1OldHelper");
	}
}

public class Lab1Old {

	public static void main(String[] args) {
		Thread  h = new Thread(new Lab1OldHelper());
		h.start();
	}
}
