package zadatak3;
import java.util.*;

public class NizCena {
    final int maxBrojElemenata = 100;
    Scanner ulaz = new Scanner (System.in);
    
    private class Double {
        private double value;
        public Double(double value) {
            this.value = value;
        }
        public double getValue() {
            return value;
        }
    }
    
    //Atribut niza cena proizvoda sa maks kapacitetom od 100 elemenata
    private ArrayList<Double> nizCena = new ArrayList();
    //Brojač
    private int brojac = 0;
    
    //Metoda za dodavanje novog proizvoda u niz nizCena
    public void DodajCenuProizvoda(double cena) {
        if (cena <= 0) {
            System.out.println("Greška! \nDodat element mora imati cenu veću od 0.");
        } else if (brojac > maxBrojElemenata) {
            System.out.println("Greška! \nNema mesta u nizu.");
        } else {
            nizCena.add(new Double(cena));
            brojac++;
        }
    }
    
    //Metoda koja izračunava i vraća prosečnu cenu proizvoda
    public double ProsecnaCenaProizvoda(){
        if (brojac == 0){
            System.out.println("Niz je prazan.");
            return 0;
        } else {
            double sumaSvihCenaProizvoda = 0;
            for (int i = 0; i < brojac; i++){
            sumaSvihCenaProizvoda += nizCena.get(i).getValue();
            }
            return sumaSvihCenaProizvoda/brojac;
        }
    }
    
    //Metoda koja vraća najnižu cenu proizvoda
    public double NajnizaCenaProizvoda(){
        if (brojac == 0){
            System.out.println("Niz je prazan.");
            return 0;
        } else {
            double min = 1000000000000000000.0;
            for (int i = 0; i < brojac; i++){
                if (nizCena.get(i).getValue() < min){
                    min = nizCena.get(i).getValue();
                }
            }
            return min;
        }
    }
    
//Metoda koja vraća najvišu cenu proizvoda
    public double NajvisaCenaProizvoda(){
        if (brojac == 0){
            System.out.println("Niz je prazan.");
            return 0;
        } else {
            double max = 0.0;
            for  (int i = 0; i < brojac; i++){
                if (nizCena.get(i).getValue() > max){
                    max = nizCena.get(i).getValue();
                }
            }
            return max;
        }
    }
    
    //Metoda koja vraća razliku maks i min cene
    public double RazlikaMaxIMinCene(){
        if (brojac == 0){
            System.out.println("Niz je prazan.");
            return 0;
        } else {
            double najvecaCena = NajvisaCenaProizvoda();
            double najnizaCena = NajnizaCenaProizvoda();
            
            return najvecaCena - najnizaCena;
        }
    }
    
    //Metoda koja ispisuje cene veće od zadate granične vrednosti
    public void IspisCena (double granicnaVrednost){
        if (brojac == 0){
            System.out.println("Niz je prazan.");
        } else {
            for (int i = 0; i < brojac; i++){
                if (nizCena.get(i).getValue() > granicnaVrednost){
                    System.out.print(nizCena.get(i).getValue() + ", ");
                }
            }
        }
    }
}
