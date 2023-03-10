import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
/*<applet code=Division.class height=500 width=500>
</applet>*/
public class Division extends Applet implements ActionListener
{
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1;
	public void init()
	{
		setSize(500,200);
		FlowLayout g=new FlowLayout();
		setLayout(g);
		l1=new Label("Enter the num1 :");
		l1.setForeground(Color.blue);
		add(l1);

		tf1=new TextField(5);
		add(tf1);
		
		l2=new Label("Enter the num2 :");
		l2.setForeground(Color.blue);
		add(l2);

		tf2=new TextField(5);
		add(tf2);	
		
		l3=new Label("Result :");
		l3.setForeground(Color.blue);
		add(l3);
		
		tf3=new TextField(10);
		add(tf3);

		b1=new Button("Divide");
		b1.addActionListener(this);
		add(b1);

		l3=new Label();
		add(l3);
	}
	public void actionPerformed(ActionEvent ae)
	{
		try
		{
			int num1=Integer.parseInt(tf1.getText());
			int num2=Integer.parseInt(tf2.getText());
			double num3=num1/num2;
			tf3.setText(String.valueOf(num3));
		}
		catch(ArithmeticException e)
		{
			JOptionPane.showMessageDialog(this,"Exception :"+e);
		}
		catch(NumberFormatException e)
		{
			JOptionPane.showMessageDialog(this,"Exception :"+e);
		}
	}
}