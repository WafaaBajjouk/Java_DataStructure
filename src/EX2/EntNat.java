class ErrConst extends Exception{
    public ErrConst(String message){
        super(message);
    }
}
class ErrSomme extends Exception{
    public ErrSomme(String message){
        super(message);
    }
}
class ErrDiff extends Exception{
    public ErrDiff(String message){
        super(message);
    }
}
class ErrProd extends Exception{
    public ErrProd(String message){
        super(message);
    }
}


class EntNat{
    private int n;
    public EntNat(int n)throws ErrConst{
        if(n<0)throw new ErrConst("error a la valeur <"+n+">");
        this.n = n;
    }
    public static int somme(EntNat a1 ,EntNat b1)throws ErrSomme,ErrConst{
        int a = a1.getN();
        int b = b1.getN();
        long sum = (long)a+(long)b;
        if(sum>Integer.MAX_VALUE)throw new ErrSomme("error a la valeur est grand <"+sum+">");
        if(sum<0) throw new ErrConst("Erreure de def !"); 
        return (int)sum;
    }
    public static int FuncProd(EntNat a1 ,EntNat b1)throws ErrConst,ErrProd{
        int a = a1.getN();
        int b = b1.getN();
        long prod = (long)a*(long)b;
        if(prod>Integer.MAX_VALUE)throw new ErrProd("error a la valeur est grand <"+prod+">");
        if(prod<0) throw new ErrConst("Erreure de def !"); 
        return (int)prod;
    }
    public static int FuncDiff(EntNat a1 ,EntNat b1)throws ErrConst,ErrDiff{
        int a = a1.getN();
        int b = b1.getN();
        long diff = (long)a-(long)b;
        if(diff>Integer.MAX_VALUE)throw new ErrDiff("error a la valeur est grand <"+diff+">");
        if(diff<0) throw new ErrConst("Erreure de def !"); 
        return (int)diff;
    }
    
    public int getN(){
        return this.n;
    }
}
       
public class Ex3
{
    public static void main(String[] args) {
    try {
        EntNat a= new EntNat(9);
        EntNat b= new EntNat(9);
        EntNat c= new EntNat(9);
        System.out.println("la somme "+c.somme(a,b));
        System.out.println("le produit "+c.FuncProd(a,b));
        System.out.println("le difff "+c.FuncDiff(a,b));
        
        

    } catch(ErrConst e) {
        System.out.println("la valeur est negative dans catch "+e.getMessage());
    }catch(ErrSomme e) {
        System.out.println("la valeur est negative dans catch "+e.getMessage());
    }catch(ErrProd e) {
        System.out.println("la valeur est negative dans catch "+e.getMessage());
    }catch(ErrDiff e) {
        System.out.println("la valeur est negative dans catch "+e.getMessage());
    }
    }
}
