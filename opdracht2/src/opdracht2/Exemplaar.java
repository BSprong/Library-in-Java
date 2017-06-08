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
public class Exemplaar {
    
    private int nummer;
    private Boolean uitgeleend;
    private Boek boek;

    public int getNummer() {
        return nummer;
    }

    public void setUitgeleend(Boolean uitgeleend) {
        this.uitgeleend = uitgeleend;
    }
    
    public Boek getBoek()
    {
        return null;
    }

    public Exemplaar(int nummer, Boolean uitgeleend, Boek boek) {
        this.nummer = nummer;
        this.uitgeleend = uitgeleend;
        this.boek = boek;
    }
    
    
    
}
