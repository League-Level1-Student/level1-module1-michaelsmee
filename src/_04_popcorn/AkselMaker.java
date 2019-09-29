package _04_popcorn;

import javax.swing.JOptionPane;

public class AkselMaker {
public static void main(String[] args) {
	
	
	
Popcorn aksel = new Popcorn("aksely");	
	String yum=JOptionPane.showInputDialog("u want yum or no yum, IPHONE XS dudes, driving with dat prius");
	
	String cook=JOptionPane.showInputDialog("u cook or no cook, imagine having an IPHON XS haha, IPHONE 11 dabs");
int a=Integer.parseInt(cook);

Microwave aksel1 = new Microwave();
	aksel1.putInMicrowave(aksel);
	aksel1.setTime(a);
	aksel1.startMicrowave();

}


}
