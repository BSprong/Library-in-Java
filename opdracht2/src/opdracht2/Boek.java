/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Bart
 */
public class Boek {
    
    private String isbn;
    private List<Exemplaar> exemplarenlijst;

    public String getIsbn() {
        return isbn;
    }

    public Boek(String isbn) {
        this.isbn = isbn;
        //this.exemplarenlijst = exemplarenlijst;
        List<Exemplaar> exemplarenlijst = new ArrayList<Exemplaar>();
    }

   
    public void nieuwboek(String isbn)
    {
        Boeken boek = new Boeken("1839849");
        boek.VoegToeAanLijst(isbn);
    }
    
    
    
    
    public Exemplaar getVrijExp ()
    {
        return null;
    }
    
}
