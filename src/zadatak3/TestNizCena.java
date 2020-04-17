package zadatak3;
public class TestNizCena {

    public static void main(String[] args) {
        NizCena nizCena = new NizCena();
        nizCena.DodajCenuProizvoda(123.0);
        nizCena.DodajCenuProizvoda(234.55);
        nizCena.DodajCenuProizvoda(301.0);
        nizCena.DodajCenuProizvoda(5000.0);
        
        System.out.println("Cene veće od 300: ");
        nizCena.IspisCena(300.0);
        
        System.out.println();
        System.out.println("Razlika između najviše i najniže cene je: " + nizCena.RazlikaMaxIMinCene());
        
    }
    
}
