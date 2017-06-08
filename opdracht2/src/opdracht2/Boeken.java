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
public class Boeken {
    
    private String isbn;
    
    //private List<Boek> boekenlijst;
    private ArrayList<String>boekenlijst = new ArrayList<>();

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
      

    
    //public Boeken() {
    //    List<Boek> boekenlijst = new ArrayList<Boek>();
    //}
    
   // public List <String> getboekenlijst()
//{
 //   return (List<String>) Collections.unmodifiableList(boekenlijst);
    //return items;
//}
    
    

    public ArrayList<String> getBoekenlijst() {
        return boekenlijst;
    }

    public Boeken(String isbn) {
        this.isbn = isbn;
        this.boekenlijst = new ArrayList();
    }

   

  public String zoekBoek(String isbn)
  {
      
  for(String s : boekenlijst){
      if(s.contains(isbn))
          return isbn;
  }
    return null;
  }
  
  public boolean VoegToeAanLijst(String isbn)
  {
     
       if( boekenlijst.contains(isbn )) {
              System.out.println("book exist");
              return false;
      }
      boekenlijst.add(isbn);
      System.out.println("Add to list: " + boekenlijst);
     return true;
      /*
      for(String s : boekenlijst){
          if(s.equals(isbn)){
              System.out.println("boek bestaat al");
              return false;
          }
                   
      }
          boekenlijst.add(isbn);
      System.out.println("Toegevoegd aan lijst: " + boekenlijst);
     return true;*/
     
  }
  
  public boolean verwijder(String isbn){
        if(boekenlijst.contains(isbn)){
            boekenlijst.remove(isbn);
                    return true;
        }
        else{
            return false;
        }
        
    }

    @Override
    public String toString() {
        return "Boeken{" + "boekenlijst=" + boekenlijst + '}';
    }

    
  
  
    
    
    
}
