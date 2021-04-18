
public class VacheTaureau {
  // Variables
  public int nSolution[];
  private int nProp[];
  private int nTentatives ; 
  private int nVache ;
  private int nTaureau ; 
  // Constructor
  public VacheTaureau(int val  ) {
	  // Tab Prop
		 this.nProp = new int [4];
		 for   (int i=0; i<4;i++) 
		 {nProp[i]=0;}
	  //Tab Solution
	 this.nSolution = new int [4];
	 nSolution[0] = val   / 1000; 
	 nSolution[1] = (val    %1000)/100; 
	 nSolution[2] = (val   % 100)/10; 
	 nSolution[3] = val   % 10; 
	 //System.out.println("working");
	  //Counting
	 this.nVache=this.nTentatives=this.nTaureau=0;
  }
  
   boolean gagne() {
	   return (this.nTaureau ==4 && this.nTentatives<10);    
  }
   boolean perdu() {
	   return (this.nTaureau <4 && this.nTentatives==10);    
  }
  void propose(int val) {
	     this.nProp[0] = val   / 1000; 
	     this.nProp[1] = (val    %1000)/100; 
	     this.nProp[2] = (val   % 100)/10; 
	     this.nProp[3] = val   % 10; 
	     this.nVache=0;
	     this.nTaureau=0;
	     this.nTentatives++;
	     // Comparing tabs
	     for (int i=0; i<4;i++) {
	    	 if (this.nProp[i]==this.nSolution[i])
	    	 {this.nTaureau++;}
	    	}
	     for (int i=0;i<4;i++) {
	    	 for (int j=0;j<4;j++) {
	    		 if (this.nSolution[i]==nProp[j] && i!=j)
	    			 this.nVache++;
	    	 }
	     }
	     
  }

void etat() {
	System.out.println("--------------------");
	System.out.println("Tentaive n°:"+this.nTentatives);
	for (int i=0;i<4;i++) {
		System.out.print(this.nProp[i]+ "|");
	}
	System.out.println("\n Vache :"+this.nVache);
	System.out.println("Taureau :"+this.nTaureau);


}  

}
