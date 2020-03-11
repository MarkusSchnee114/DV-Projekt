import java.util.ArrayList;

/**
 * Beschreiben Sie hier die Klasse Datenbank.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class Datenbank
{
    private int anzahl;
    ArrayList <Werkstoffe> liste;

    public Datenbank ()
    {
        anzahl=0;
        liste = new ArrayList<Werkstoffe>();
    }
    
    public void ErstellenStahl (String Name, int Nummer, String Verwendung, String eLeitf, double Eisengehalt, double Kohlenstoffgehalt)
    {
        anzahl+=1;
        Werkstoffe stahl = new Stahl (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Kohlenstoffgehalt);
        liste.add(stahl);
    }
    
    public void ErstellenGuss (String Name, int Nummer, String Verwendung, String eLeitf, double Eisengehalt, double Siedetemp)
    {
        anzahl+=1;
        Werkstoffe guss = new Gusswerkstoffe (Name, Nummer, Verwendung, eLeitf, Eisengehalt, Siedetemp);
        liste.add(guss);
    }
    
    public void ErstellenSchwermetalle (String Name, int Nummer, String Verwendung, String eLeitf, String Hauptelement, String Verform)
    {
        anzahl+=1;
        Werkstoffe schwer = new Schwermetalle (Name, Nummer, Verwendung, eLeitf, Hauptelement, Verform);
        liste.add(schwer);
    }
    
    public void ErstellenLeichtmetalle
    
    public void ErstellenHalbleiter
    
    public void ErstellenKeramik
    
    public void ErstellenKunststoffe
    
    public void ErstellenNaturstoffe
}
