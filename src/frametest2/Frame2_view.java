package frametest2;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import lib2.Calculation_lib;

public class Frame2_view extends Frame implements ActionListener, WindowListener{

	private TextField text1 = new TextField("", 10);
	private TextField text2 = new TextField("", 10);
	private TextField text3 = new TextField("", 10);
	private TextField text4 = new TextField("", 10);
	private TextField text5 = new TextField("", 10);
	private TextField text6 = new TextField("", 10);
	private TextField text7 = new TextField("", 10);
	private Button button1 = new Button("ë´ÇµéZ");
	private Button button2 = new Button("à¯Ç´éZ");
	private Button button3 = new Button("ä|ÇØéZ");
	private Button button4 = new Button("äÑÇËéZ");

	public Frame2_view() {
		addWindowListener(this);
		setTitle("FrameTest2");
		setLayout(new FlowLayout(FlowLayout.CENTER));
		add(text1);
		add(text2);
		add(button1);
		add(new Label("="));
		add(text3);
		button1.addActionListener(this);

		add(new Label(" // "));

		add(button2);
		add(new Label("="));
		add(text4);
		button2.addActionListener(this);

		add(new Label(" // "));

		add(button3);
		add(new Label("="));
		add(text5);
		button3.addActionListener(this);

		add(new Label(" // "));

		add(button4);
		add(new Label("="));
		add(text6);
		add(new Label("Åc"));
		add(text7);
		button4.addActionListener(this);
	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == button1) {
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			Calculation_lib clib = new Calculation_lib(val1, val2);
			text3.setText(String.valueOf(clib.getPlus()));
		} else if(e.getSource() == button2) {
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			Calculation_lib clib = new Calculation_lib(val1, val2);
			text4.setText(String.valueOf(clib.getMinus()));
		} else if(e.getSource() == button3) {
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			Calculation_lib clib = new Calculation_lib(val1, val2);
			text5.setText(String.valueOf(clib.getTime()));
		} else if(e.getSource() == button4) {
			int val1 = Integer.parseInt(text1.getText());
			int val2 = Integer.parseInt(text2.getText());
			Calculation_lib clib = new Calculation_lib(val1, val2);
			text6.setText(String.valueOf(clib.getDivide()));
			text7.setText(String.valueOf(clib.getMod()));
		}
	}

}
