package cernaszamolodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CernaszamoloDos {

    public static void main(String[] args) {
        
        System.out.println("A Cérnszámoló program elindult!");
        System.out.println("-------------------------------");
         
        BufferedReader olvaso =  
                   new BufferedReader(new InputStreamReader(System.in)); 
        
        int oldalszam;
        
        try {
            System.out.println("Add meg az oldalszámot:");
            oldalszam = Integer.parseInt(olvaso.readLine());
            //System.out.println(oldalszam);
        } catch (IOException ex) {
            System.out.println("Csak számot adhatsz meg" + ex);
        }
  
         
        
        
    }
    
    
}
