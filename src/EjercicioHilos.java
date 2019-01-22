
public class EjercicioHilos extends Thread{
	
	int n1,n2,n3;
	
	public EjercicioHilos(int n1, int n2, int n3) {
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	public void run() {
		imprimir();
	}
	
	public void imprimir() {
		System.out.println("Estos son los números: " + n1 + " " + n2 + " " + n3);
	}
	
	
}
