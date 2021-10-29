package EX2;

import EX2.ErrConst;

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
	
	
	


	public static EntNat somme (EntNat a , EntNat b) throws ErrSom ,ErrConst {
		
		EntNat s= new EntNat(0);
		s.Ent=a.getEnt()+b.getEnt();
		
		if(s.getEnt()<Integer.MAX_VALUE) throw new ErrSom("Erreure de somme !");
		if(s.getEnt()<0) throw new ErrConst("Erreure de def !");
		return s;		
	}

    public static int produit (EntNat a , EntNat b) throws ErrProd , ErrConst {
		
		int p;
		
		p=a.getEnt()*b.getEnt();
		
		if(p<Integer.MAX_VALUE) throw new ErrProd("Erreure de produit !");
		if(p<0) throw new ErrConst("Erreure de def !");
		return p;	
	}

	
    public static int def (EntNat a , EntNat b) throws ErrDiff, ErrConst{
		
  		int p;
  		
  		p=a.getEnt()-b.getEnt();
  		
  		if(p<Integer.MAX_VALUE) throw new ErrDiff("Erreure de def !");
  		if(p<0) throw new ErrConst("Erreure de def !");

  		return p;	
  		
  	}



}

