package currencyConvertor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
class Converter extends JFrame implements ActionListener
{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JRadioButton rb1,rb2;
	JButton b1;
	ButtonGroup g1;
	public Converter(String s)
	{
		super(s);
		l1=new JLabel("INR");
		l1.setBackground(Color.GREEN);
		l2=new JLabel("USD");
		t1=new JTextField("0");
		t2=new JTextField("0");
		rb1=new JRadioButton("INR TO USD");
		rb2=new JRadioButton("USD TO INR");
		b1=new JButton("Convert");
		g1=new ButtonGroup();
		l3=new JLabel();
		add(l1);add(l2);add(rb1);add(rb2);add(b1);add(t1);add(t2);
		g1.add(rb1);g1.add(rb2);add(l3);
		setLayout(null);
		l1.setBounds(50, 50, 80, 20);
		t1.setBounds(50, 100, 100, 20);
		l2.setBounds(200,50,80,20);
		t2.setBounds(200, 100, 100, 20);
		rb1.setBounds(50, 160, 100, 20);
		rb2.setBounds(200, 160, 100, 20);
		b1.setBounds(150, 260, 100, 20);
		l3.setBounds(150, 280, 200, 20);
		b1.addActionListener(this);

		
	}
	
	
	
	
	public static void main(String[] args)
	{
		Converter jf=new Converter("Currency Converter");
		jf.setBackground(Color.green);
		jf.setVisible(true);
		jf.setSize(400,400);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 // Converting to double 
        double d = Double.parseDouble(t1.getText());         
        // Converting rupees to dollars //INR TO USD
        double d1 = (d / 72.98); 

        // Converting to double 
        double d2  = Double.parseDouble(t2.getText()); 

        // converting Dollars to rupees //USD TO INR
        double d3 = (d2 * 72.98); 

		

			if(rb1.isSelected())
			{		
				l3.setText("conversion is: " + d1);
			}
			else
			{
			    l3.setText("conversion is: " + d3 );
			}
		
		
		
	}
}