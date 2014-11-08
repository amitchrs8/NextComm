package swingPrac;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarPrac extends JFrame{

	JProgressBar jBar;
	public ProgressBarPrac() {
		// TODO Auto-generated constructor stub
		jBar= new JProgressBar(0,2000);
	jBar.setBounds(40, 40, 200, 30);
	jBar.setValue(0);
	jBar.setStringPainted(true);
	add(jBar);
	jBar.setLayout(new FlowLayout());
	jBar.setVisible(true);
	jBar.setSize(400,400);
	}
	public void iterate(){
	int i=0;
	while(i<=1000){
		i+=20;
		jBar.setValue(i);
	try {
		Thread.currentThread().sleep(100);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	}

	public static void main(String[] args) {
		ProgressBarPrac obj = new ProgressBarPrac();
		obj.setVisible(true);
		obj.iterate();
	}
}
