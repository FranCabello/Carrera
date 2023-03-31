
public class Carrera {
	public static void main(String[] args) {
		// Creamos los hilos de tortuga y conejo
		Tortuga tor = new Tortuga("Tortuga");
		Conejo con = new Conejo("Conejo");
		// Comienza la carrera
		tor.start();
		System.out.println("Tortuga comienza la carrera");
		con.start();
		System.out.println("Conejo comienza la carrera");
	}

}

// Clase tortuga
class Tortuga extends Thread {
	public Tortuga(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i < 10; i++) { // i representa la distancia
			try {
				Thread.sleep(5000); // Por cada metro que recorre, el conejo recorre 5
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " va por " + i + " de la carrera.");
		}
		System.out.println(Thread.currentThread().getName() + " finaliza carrera.");
	}
}

// Clase conejo
class Conejo extends Thread {
	public Conejo(String name) {
		super(name);
	}

	public void run() {
		for (int i = 1; i <= 10; i++) { // i representa la distancia
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " va por " + i + " de la carrera.");
		}
		System.out.println(Thread.currentThread().getName() + " finaliza carrera.");
	}
}
