import javax.swing.*;

public class BuchstabenTest implements Projekt1 {
	
	static String s [] = new String [5];

	public static void main(String[] args) {
	
		String regeln [][] = {{ "A" , "C" }, { "C", "D" }, { "B", "C" }};
		
		//[0][0] = A . [0][1]= C
		//[1][0] = C . [1][1]= D
		//[2][0] = B . [2][1]= C
		// Regel: A<C<D und B<C<D
		
		for(int i = 0; i< s.length ;i++) {
			s[i] = JOptionPane.showInputDialog("Bitte geben Sie einen der Buchstaben A B C D ein");
		}
		
		System.out.println(s);
		
		isWellSortet(regeln,s);
	
	}
	
	
	public static boolean isWellSortet(String s [][] , String s2 []) {
       
		String erstesZeichen, folgeZeichen = null, zweitesZeichen , drittesZeichen, viertesZeichen , fuenftesZeichen;
        erstesZeichen = s2[0];
        zweitesZeichen = s2[1];
        drittesZeichen = s2[2];
        viertesZeichen = s2[3];
        fuenftesZeichen = s2[4];
        
        if(fuenftesZeichen.equals(" ")) {
        	
        	if(erstesZeichen.equals("A")) {}
        	if(erstesZeichen.equals("B")) {}
        	if(erstesZeichen.equals("C")) {}
        	if(erstesZeichen.equals("D")) {
        		
        	}
        }	
        
        
        return true;
    }
	
	
	
	
	
	public void methode() {
		for( int i=0; i<=s.length; i++ ){
            if( s[i][0] == erstesZeichen ){
                folgeZeichen = s[i][1];
            }
            while( zweitesZeichen != folgeZeichen){
                for( int j=0; j<= s.length; j++ ){
                    if( s[j][0] == folgeZeichen ){
                        folgeZeichen = s[i][0];
                    }
                }
            }
		}    
	} 
}

	

