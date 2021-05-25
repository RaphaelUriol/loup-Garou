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
public class Compte {
        public long numcompte=0  ;
        public String choixcompte = "null";
        public Float tauxdeplacement = null; 
        public float credite =0 ;
        public Scanner clavier = new Scanner(System.in);
        public lignecomptable ligne;
         int numatester =0; 
        
	public lignecomptable getLigne() {
		return ligne;
	}

	public void setLigne(lignecomptable ligne) {
		this.ligne = ligne;
	}

    public long getNumcompte() {
        return numcompte;
    }

    public void setNumcompte(long numcompte) {
        this.numcompte = numcompte;
    }

    public String getChoixcompte() {
        return choixcompte;
    }

    public void setChoixcompte(String choixcompte) {
        this.choixcompte = choixcompte;
    }

    public Float getTauxdeplacement() {
        return tauxdeplacement;
    }

    public void setTauxdeplacement(Float tauxdeplacement) {
        this.tauxdeplacement = tauxdeplacement;
    }

    public float getCredite() {
        return credite;
    }

    public void setCredite(int credite) {
        this.credite = credite;
    }

    public Scanner getClavier() {
        return clavier;
    }

    public void setClavier(Scanner clavier) {
        this.clavier = clavier;
    }

        
        
        public void créercompte(){
   System.out.println("Vous avez choisi de créer un compte");
               System.out.println("Quel type de compte voulez-vous créer?"+"\n"+
                       "courant" +"\n"+
                       "epargne" +"\n"+
                       "joint");
        
               choixcompte = clavier.nextLine();
               
               System.out.println("Quel est le numéro de compte ?");
               numcompte = clavier.nextLong();	 
               System.out.println("combien souhaitez vous créditez sur votre compte ?");
               credite = clavier.nextInt(); 
               
			 System.out.println("votre compte est de type compte "+ choixcompte);
			 System.out.println("Votre numéro de compte est le"+ numcompte);
			 System.out.println("Vous avez crédité "+ credite +  " euros sur votre compte");
			
        }
                         
      public void AfficherCompte(){
    System.out.println("Vous avez choisi d'afficher votre compte");
                System.out.println("Donnez votre numéro de compte");
               
                do{
                numatester = clavier.nextInt();
                if(numcompte==numatester){
                    		 
			 System.out.println("votre compte est de type compte "+ choixcompte);
			 System.out.println("Votre numéro de compte est le"+ numcompte);
			 System.out.println("Vous avez crédité "+ credite +  " euros sur votre compte");
			 if(choixcompte.equals("epargne")) {
				System.out.println("le taux de placement est de  "+ tauxdeplacement ); 
			 }
 if(ligne!=null){
     ligne.afficherLigneComptable();
 }
                } else{
                    System.out.println("votre numéro de compte n'est pas bon, recommencer");
                   
                            }
                
                }while(numcompte!=numatester);
                
    }
      
      public void creationlignecomptable(){
          ligne = new  lignecomptable();
          ligne.créerLigneComptable();
          credite = credite + ligne.sommecrediter - ligne.sommedebiter;
          System.out.println("votre nouveau solde est "+credite);
      }
   
}

