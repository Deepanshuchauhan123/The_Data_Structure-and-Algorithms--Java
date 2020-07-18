import javax.swing.*;
public class frames{
	public static void main (String ar[])
		{
		JFrame f1=new JFrame("My Frame");
		JFrame f2=f1;
		JFrame f3=f2;
		f1.setVisible(true);
		f2.setVisible(true);
		f3.setVisible(true);
		}
}