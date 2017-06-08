/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opdracht2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Bart
 */
public class Leden {
    
    private String naam;
    
    private final ArrayList<String>Ledenlijst = new ArrayList<>();

   public List <String> getLedenlijst()
{
    return (List<String>) Collections.unmodifiableList(Ledenlijst);
    //return items;
}
   
   

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public Leden(String naam) {
        this.naam = naam;
    }

    

    public Lid ZoekNaam(String nm)
    {
        return null;
    }
    
     public void VoegToeAanLedenLijst(String naam)
  {
      Ledenlijst.add(naam);
      System.out.println("Toegevoegd aan ledenlijst: " + Ledenlijst);
      
  }

    @Override
    public String toString() {
        return "Leden{" + "Ledenlijst=" + Ledenlijst + '}';
    }
     
     
    
}
