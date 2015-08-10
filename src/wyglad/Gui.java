package wyglad;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gui implements ActionListener{

	private 		JFrame			frame			= new JFrame(Constant.NazwaAplikacji);
	private			JPanel			panel			= new JPanel();
	private			JButton			wyswietlBTN		= new JButton("Wyswietl");
	private			JButton			dodajBTN		= new JButton("Dodaj");
	private 		JButton			edycjaBTN		= new JButton("Edycja");
	
	
	public Gui() {
		// TODO Auto-generated constructor stub
		init();
	}

	private void set()
	{
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(Constant.szerokoscOkna, Constant.wysokoscOkna);
		
		panel.setLayout(new GridLayout(3, 1));
	}
	
	private void add()
	{
		frame.add(panel);
		
		panel.add(wyswietlBTN);
		panel.add(dodajBTN);
		panel.add(edycjaBTN);
		
		wyswietlBTN.addActionListener(this);
		dodajBTN.addActionListener(this);
		edycjaBTN.addActionListener(this);
	}
	
	private void init()
	{
		set();
		add();
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object source = e.getSource();
		
		if(source==wyswietlBTN)
		{
			System.out.println("Klikniecie wyswietl");
		}
		else if(source==dodajBTN)
		{
			System.out.println("Klikniecie dodaj");
		}
		else if(source==edycjaBTN)
		{
			System.out.println("Klikniecie edycja");
		}
	}

}
