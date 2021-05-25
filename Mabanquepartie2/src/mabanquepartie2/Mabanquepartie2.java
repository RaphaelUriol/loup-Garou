/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mabanquepartie2;
import java.util.*;

/**
 *
 * @author hugodujols
 */
public class Mabanquepartie2 {
    
    

    Scanner clavier = new Scanner(System.in);
	public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );
        
        
        int choix;
        Compte Compte1=null;
        long numatester;
        int fin =0;
        
        
        
        do{
        System.out.println("bienvenue dans la banque");
        
       choix = MenuPrincipal();
       
       switch(choix){
           case 1:
        Compte1 = new Compte();
        Compte1.créercompte();
        break;
        
           case 2:
         System.out.println("Vous avez choisi de créer une  ligne comptable");
         System.out.println("Donnez votre numéro de compte");
         numatester = scanner.nextLong();
	 if(numatester== Compte1.getNumcompte()) {
				
		 Compte1.AfficherCompte();
                    }else {
				 System.out.println(" Le compte n'existe pas ");
			 }
         
         break;
           case 3:
                System.out.println("Vous avez choisi de créer une  ligne comptable");
                System.out.println("Donnez votre numéro de compte");
                numatester = scanner.nextLong();
                
                if(numatester== Compte1.numcompte){
                    
                  Compte1.creationlignecomptable();
                    Compte1.ligne.afficherLigneComptable();
                    
                
                }else{
                System.out.println("le numéro de compte n'est pas le bon");
                }
                    
               
                
            break;
    
            
       
       case 4:
       System.out.println("Vous sortez de la banque, merci et à bientot");
       break; 
       
     }
        }while(fin!=5);
        }
        public static int MenuPrincipal(){
       int choix;
       Scanner clavier = new Scanner(System.in);
        System.out.println("Taper 1 pour Créer un compte"+"\n"+
				 "Taper 2 pour afficher un compte"+"\n"+
				 "Taper 3 pour creer une ligne comptable"+"\n"+
				 "Taper 4 pour sortir");
        choix = clavier.nextInt();
        return choix;
    
    }
}