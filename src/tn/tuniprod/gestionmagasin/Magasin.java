/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tn.tuniprod.gestionmagasin;

/**
 *
 * @author ACER
 */
public class Magasin {
    
    int identifiant;
    String adresse;
    int capacite;
    
    ProduitAliementaire[] produits ;

    public Magasin(int identifiant, String adresse) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.produits = new ProduitAliementaire[50] ;
    }
    
    @Override
    public String toString(){
        String s ="";
        s+= "identifiant : "+ this.identifiant +" \n";
        s+= "adresse : "+ this.adresse +" \n";
        s+= "capacite : "+ this.capacite +" \n";
       
        
        String prods = "";
        for ( int i=0; i<this.capacite;i++){
            prods+=this.produits[i];
        }
        
        return s+prods;
    }
    
    public void ajouterProduit(ProduitAliementaire produit ){
        this.produits[capacite] = produit;
        this.capacite ++ ;
    }
    
    public int getTotalProduits(){
        return this.capacite;
    }
    
    
}
