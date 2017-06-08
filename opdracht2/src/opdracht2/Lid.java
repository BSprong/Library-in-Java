/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht2;

/**
 *
 * @author Bart
 */
public class Lid {
    
    private String naam;

    public String getNaam() {
        return naam;
    }

    public Lid(String naam) {
        this.naam = naam;
    }
    
    public void leenExpl(Exemplaar expl)
    {
        
    }
    
    public Exemplaar zoekExpl (String isbn)
    {
        return null;
    }
    
    public void verwijderExpl(Exemplaar expl)
    {
        
    }
    
    public void nieuwLid(String naam)
    {
        Leden lid = new Leden("bart");
        lid.VoegToeAanLedenLijst(naam);
    }
    
     
    
}
