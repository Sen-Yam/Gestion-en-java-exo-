package Exo1;
import java.util.Scanner;
public class Application {
    

    public static void main(String arg[]) {
      
        Scanner e= new Scanner(System.in);
        System.out.println("Donnez un code ");
        String S=e.next();
        
        if(Fabrique.CreeProduit(S) instanceof Ordinateur) {
            Produit P = new Ordinateur();
            
        P.AfficherModeEmploi();
        }
        else {
            if( Fabrique.CreeProduit(S) instanceof Livre) {
                Produit P = new Livre();
                P.AfficherModeEmploi();
            }
            else {
                System.out.println("NULL");
            }
        }
    }

    

  
}
/* Les concepts de POO utilisees sont :  
les interfaces , 
*/
