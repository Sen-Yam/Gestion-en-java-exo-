package Exo1;

public class Fabrique implements Produit {
    static Produit CreeProduit (String Code) {
        Produit P;
        if(Code.charAt(0)=='9') {
            P = new Livre();
        }
        else {
            if(Code.charAt(0)=='4') {
                P = new Ordinateur();
            }
            else {
                P=null;
            }
        }
        return P;
        
    }

    @Override
    public void AfficherModeEmploi() {
        // TODO Auto-generated method stub
        
    }
}
