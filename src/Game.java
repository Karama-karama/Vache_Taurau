import java.util.*;

public class Game {
	static boolean verif (int n) {
        String s = String.valueOf(n);
        if (s.length()!=4) 
        {return false;}
        for (int i=0;i<4;i++)
            {  for (int j=0;j<4;j++) {
        		if ( i!=j &&   String.valueOf(s.charAt(i)).equals(String.valueOf(s.charAt(j))))  
        				{System.out.println("Il ne faut pas avoir de redodances");
                         return false ;}
        	}
        }
        return true;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         VacheTaureau VT  = new VacheTaureau(1234);
         System.out.println("Le jeu comence ! "); 
         Scanner sc = new Scanner (System.in);
         
         
         while (!VT.gagne() && !VT.perdu()) 
         {
        	 int guess;
        	 
        	 do 
        	 {
        	 System.out.println("Donner votre proposition");
        	 guess= sc.nextInt();
        	 }
        	 while(!verif(guess)); 
        	 VT.propose(guess);
 			VT.etat();
         }
         
         
        	 if (VT.gagne())
        	 { System.out.println("Bravo! Vous l'avez deviné malla jaw"); }
        	 else if (VT.perdu())
        	 {System.out.println("Oups! vous avez épuisé vos essaies ! "); 
        	 System.out.println("La solution est "); 
        	 for (int i=0;i<4;i++) {
        			System.out.println(VT.nSolution[i]+"|");
        		}}
         }
         
	}

	

