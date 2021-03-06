import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class ContadorApplet extends Applet implements Runnable, ActionListener{

	private Thread h;
	long CONTADOR = 0;
	private boolean parar;
	private Font fuente;
	private Button b1,b2; //botones.del.Applet
	
	public void start() {}
	
	public void init() {
		setBackground(Color.yellow); //color.de.fondo
		add(b1=new Button("Iniciar contador"));
		b1.addActionListener(this);
		add(b2=new Button("Parar contador"));
		b2.addActionListener(this);
		fuente = new Font("Verdana", Font.BOLD, 26); //tipo.letra
	}
	
	public void run() {
		parar = false;
		Thread hiloActual = Thread.currentThread();
		while (h == hiloActual && !parar) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			repaint();
			CONTADOR++;
		}
	}
	public void paint(Graphics g) {
		g.clearRect(0, 0, 400, 400);
		g.setFont(fuente); //fuente
		g.drawString(Long.toString((long)CONTADOR), 80, 100);
	}
	//para.controlar.que.se.pulsan.los.botones
	public void actionPerformed(ActionEvent e) {
		b1.setLabel("Continuar");
		if(e.getSource() == b1) //comienzo
		{
			if(h!=null && h.isAlive()) {} //Si.el.hilo.esta.corriendo
										  //No.hago.nada
			else { //lo.creo
				h=new Thread(this);
				h.start();
			}
		}else if(e.getSource()==b2) //parada
			parar = true;
	}//actionPerformed
	
	public void stop() {h = null;}
}//fin.applet
