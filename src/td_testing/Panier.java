package td_testing;

import java.util.ArrayList;

import td_testing.Orange;
import td_testing.Panier;

public class Panier {
	ArrayList <Orange> panier = new ArrayList<Orange>();
	int taille; 
	
	
	
	public int getPanier() {
		return panier.size();
	}

	public void setPanier(ArrayList<Orange> panier) {
		this.panier = panier;
	}

	public void Taillepanier(int n) {
		n=panier.size();
	}

	public Panier(ArrayList<Orange> panier, int taille) {
		super();
		
		this.panier = panier;
		
		this.taille = taille;
		
	}
	
	public boolean estPlein() {
		boolean resultat= false;
		if (panier.size()==this.taille){
			resultat=true;
		}
		return resultat;
	}
	
	public boolean estVide() {
		
		return panier.isEmpty();
	}
	
	public String toString() {
		String chaine="";
		for (Orange i: panier) {
			chaine+= i.getOrigine()+ " | "+i.getPrix()+"\n";
		}
		return chaine;
	}
	
	
	public void ajoute(Orange o) throws RuntimeException{
		if (panier.size()<this.taille)
			panier.add(o);
		else throw new RuntimeException("Le panier est plein");
			
			
	}
	
	public void retire() {
		panier.remove(panier.size()-1);
	}
	
	public double getPrix() {
		double resultat=0;
		for (Orange i: panier) {
			resultat+=i.getPrix();
		} 
		return resultat;
	}
	
	public void boycottOrigine(String origine) {
		//ArrayList<Orange> liste = new ArrayList<Orange>(this.panier);
		
		for (int i=0; i<panier.size(); i++) {
			if(panier.get(i).getOrigine()==origine) {
				panier.remove(i);
			}
		}
		
	}
	
	public boolean equals(Panier p1, Panier p2) {
		boolean resultat=false;
		for (int i=0; i<p1.panier.size();i++) {
			
			for (int k=0; k<p2.panier.size();k++) {
				Orange it= new Orange(0, "") ;
				if (p1.panier.get(i).getOrigine().equals(p2.panier.get(k).getOrigine()) && p1.panier.get(i).getPrix()==p2.panier.get(k).getPrix()){
					
					if (it!=p2.panier.get(k))
						it = p1.panier.get(i);
						resultat=true;
						
					if (it==p2.panier.get(k)) {
						resultat = false;	
						}
						
					}
			}
		}
		return resultat;
		}

}
