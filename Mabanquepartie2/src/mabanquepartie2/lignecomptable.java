/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mabanquepartie2;

import java.util.Scanner;

/**
 *
 * @author hugodujols
 */
public class lignecomptable {
    
    
    public String moment = "null";
    public String motif = "null";
    public String paiement="null";
    public float sommedebiter =0;
    public float sommecrediter =0;
    public String action;
    Scanner scanner = new Scanner(System.in);
    
    public void créerLigneComptable(){
        System.out.println("Voulez vous debiter ou crediter ");
                    action = scanner.nextLine();
                    if(action.equals("debiter")){
                    System.out.println("quelle somme voulez vous débiter");
                    sommedebiter = scanner.nextFloat();
                 }else{
                 System.out.println("quelle somme voulez vous créditer");
                 sommecrediter = scanner.nextFloat();
                 }
                    
                System.out.println("entrez la date de l'opération YYYY-MM-JJ ");
                    scanner.nextLine();
                    moment = scanner.nextLine();
                    
                    System.out.println("entrez le motif de cette achat ou vente ");
                    motif = scanner.nextLine();
                    
                    System.out.println("entrez le mode de paiement");
                    paiement = scanner.nextLine();
                    
    }
                    
      public void afficherLigneComptable(){ 
          
         if(sommedebiter==0){

             System.out.println("Vous avez créditer + "+sommecrediter+ " la date de l'opération est le "+moment+"le motif du crédit est "+motif+" le mode de paiement est "+paiement);
             
         }
         else { 
             System.out.println("Vous avez débiter -"+sommedebiter+" la date de l'opération est le "+moment+" le motif du crédit est "+motif+" le mode de paiement est "+paiement);
             
         }
      }
      }          
                    
                    
                 
    
    



