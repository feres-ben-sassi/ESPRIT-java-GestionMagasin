/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

import java.util.Date;

/**
 *
 * @author ACER
 */
public class TuniProdGestionMagasin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ProduitAliementaire produit1 = new ProduitAliementaire();
        ProduitAliementaire produit2 = new ProduitAliementaire(1021, "Lait", "Delice");
        ProduitAliementaire produit3 = new ProduitAliementaire(2510, "yaourt", "Vitalait");
        ProduitAliementaire produit4 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);
        ProduitAliementaire produit44 = new ProduitAliementaire(3250, "Tomate", "Sicam", 1.200f);

//        produit2.afficher();
//        
        produit2.affecterPrix(0.7f);
//        
//        produit2.afficher();
//        
//        System.out.println( produit2.toString());
//        System.out.println(produit2);
//        
//        produit2.affecterDateExpiration(new Date(1377249026));
//        System.out.println(produit2.dateExpriration.toString());

//---------------------------------------
        Magasin m1 = new Magasin(12345, "El Aouina");
//        System.out.println(m1);

        m1.ajouterProduit(produit1);
        m1.ajouterProduit(produit2);
        m1.ajouterProduit(produit3);
        m1.ajouterProduit(produit4);
       // m1.ajouterProduit(produit44);
        
        
        
//        System.out.println(m1);
//        
//        System.out.println("Total des Produits  " + m1.getTotalProduits() );
//---------------------------------------

//        System.out.println(produit44.comparer(produit4));
//        
//        System.out.println(Magasin.comparer(produit4,produit2));
//        
        
        m1.supprimerProduit(new ProduitAliementaire(98798, "qsd", "qsd"));
        System.out.println(m1);

    }

}
