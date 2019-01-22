
public class ejecutor implements Runnable{

	int cont;
	
	@Override
	public void run() {
		while(true) {
			System.out.println(cont);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			cont++;
		}
		
	}
	
	public void eco(String escribir) {
      	System.out.println("Has introducido: " + escribir);
	}
	
	
	
}
