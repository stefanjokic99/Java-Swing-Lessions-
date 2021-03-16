package main;

import dialog.CustomDialog;
import frame.MainFrame;

public class MainClass {

	public static void main(String[] args) {
		
		MainFrame frame = new MainFrame();
		new CustomDialog(frame);
	}

}
