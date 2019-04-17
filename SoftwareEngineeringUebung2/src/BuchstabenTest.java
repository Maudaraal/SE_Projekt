import javax.swing.*;

public class BuchstabenTest implements Projekt1 {
	
	static String s [] = new String [5];

	public static void main(String[] args) {
	
		String regeln [][] = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
		
		//[0][0] = A . [0][1]= C
		//[1][0] = C . [1][1]= D
		//[2][0] = B . [2][1]= C
		// Regel: A<C<D und B<C<D
		
		for(int i = 0; i< (s.length-1) ;i++) {
			s[i] = JOptionPane.showInputDialog("Bitte geben Sie einen der Buchstaben A B C D ein");
		}
		
		System.out.println(s);
		
		if(isWellSortet(regeln,s)== true) {System.out.println("yeyyy");}
		if(isWellSortet(regeln,s)== false) {System.out.println("noooo");}
	}
	
	
	public static boolean isWellSortet(String s [][] , String s2 []) {
       
		String erstesZeichen, folgeZeichen = null, folgeZeichen2 = null, folgeZeichen3 = null, zweitesZeichen , drittesZeichen, viertesZeichen , fuenftesZeichen;
        erstesZeichen = s2[0];
        zweitesZeichen = s2[1];
        drittesZeichen = s2[2];
        viertesZeichen = s2[3];
        fuenftesZeichen = s2[4];
       
        if(erstesZeichen.equals("A")&zweitesZeichen.equals("B")&drittesZeichen.equals("C")&viertesZeichen.equals("D")) {return true;
        }else{
        	if(erstesZeichen.equals("B")&zweitesZeichen.equals("A")&drittesZeichen.equals("C")&viertesZeichen.equals("D")) {return true;
        	}else return false;
        }
	}
        
        
}

	

