package i.am.hage;

public class Application {

	public void run() {
		System.out.println("i am hage");

		Nishiyan hage = new NishiyanAge();
		hage.setFusafusa();
		hage.setHage();
	}

	public static void main(String[] args) {
		Application application = new Application();
		application.run();
	}
}
