
public class HiloPrioridad1 extends Thread{
	private int c = 0;
	private boolean stopHilo = false;
	
	public int getContador() {
		return c;
	}
	public void pararHilo() {
		stopHilo = true;
	}
	public void run() {
		while (!stopHilo) c++;
	}
}
