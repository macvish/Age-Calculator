import java.awt.*;
import javax.swing.*;
public class Age2
{
public static void main(String []args)
{
String name = JOptionPane.showInputDialog("Enter your name");
JOptionPane.showMessageDialog(null," Welcome to Age Calculator " + name);
int a = Integer.parseInt(JOptionPane.showInputDialog("Enter your Age", "Age"));
int b = Integer.parseInt(JOptionPane.showInputDialog("Enter Current Year", "Current Year"));
int ans = b-a;
int ahead = 15+a;
JOptionPane.showMessageDialog(null, "You are born in the year " + ans);
JOptionPane.showMessageDialog(null, "In 15 years time, you'll be " + ahead + "years old");
JOptionPane.showMessageDialog(null, "Thank you and have a nice day " + name);
}
}