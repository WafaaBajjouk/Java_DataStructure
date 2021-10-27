package EX1;



public class EntNat {
	
	private int Ent;

	public EntNat(int ent) throws ErrConst{
	   	if(ent < 0) 
	   		throw new ErrConst("Erreure de constructeur !");
//	   		System.out.println("Erreure de constructeur !");
	   	
	   	this.Ent=ent;
	} 
	
	public int getEnt() {
		return this.Ent;
	}


}

