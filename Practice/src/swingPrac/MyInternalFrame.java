package swingPrac;

import javax.swing.JInternalFrame;

public class MyInternalFrame extends JInternalFrame{

		static int openFrameCount=0;
		static int xOffset=30,yoffset=30;
		
		public MyInternalFrame(){
			super("Document#"+(++openFrameCount),true,true,true,true);
			setSize(300,300);
			setLocation(xOffset*openFrameCount, yoffset*openFrameCount);
		}
}
