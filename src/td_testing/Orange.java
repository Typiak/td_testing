package td_testing;

import td_testing.Orange;

public class Orange {
	
	private double prix;
	private String origine;
	
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix){
		if (prix<0) throw new RuntimeException("Le prix ne peut pas etre negatif");
		else
			this.prix = prix;
			
	}
	
	public String getOrigine() {
		return origine;
	}
	public void setOrigine(String origine) {
		this.origine = origine;
	}
	public Orange(double prix, String origine) {
		super();
		this.prix = prix;
		this.origine = origine;
	}
	
	public String toString() {
				
		return getOrigine()+ " | "+getPrix()+"\n";
	}
	
	public boolean equals(Orange o2) {
		boolean resultat=false;
		
		System.out.println("o1 ori = " + this.getOrigine() + "o2 ori = " + o2.getOrigine());
		
		if (this.getOrigine().equals(o2.getOrigine()) && this.getPrix()==o2.getPrix()) {
			System.out.println("o1 ori = " + this.getOrigine() + "o2 ori = " + o2.getOrigine());
			resultat=true;
		}
		return resultat;
	}
	
}
