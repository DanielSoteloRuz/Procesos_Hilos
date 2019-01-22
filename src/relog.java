
public class relog implements Runnable{
	Thread h1;
	
	
	@Override
	public void run() {
		int horas = 0, minutos = 0, segundos = 0;
		
		while(true) {
			System.out.println(horas+":"+minutos+":"+segundos);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			segundos++;
			
			if(segundos == 60) {
				minutos++;
				segundos=0;
			}
			
			if(minutos == 60) {
				horas++;
				minutos=0;
			}
		}
	}
	
	public static void main (String[] args) {
		relog Relog = new relog();
		new Thread(Relog).start();
	}

	
	
}
