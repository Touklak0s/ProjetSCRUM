/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pourcentage;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author insset
 */
public class Pourcentage {
    public Pourcentage(){
        /**/
        
    }
        
    public String GainPrixSolder(int prix_depart, int remise){
        float prix_remise;
        float valeur_remise; 
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        valeur_remise = remise * (float) 0.01;        
        prix_remise = prix_depart * valeur_remise;
        
        System.out.println(prix_depart);
        System.out.println(remise);
        System.out.println(prix_remise);        
               
        return df.format(prix_remise);
    }
    
    public String PrixInitialise(int prix_reduit, int remise){
        float prix_depart;
        float valeur_remise;
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        valeur_remise = remise * (float) 0.01;
        prix_depart = prix_reduit * (1+valeur_remise);
        
        System.out.println(prix_reduit);
        System.out.println(remise);
        System.out.println(prix_depart);        
               
        return df.format(prix_depart);

    }
    
    public String Diviseur(int val1, int val2){
        float result;
        String s = new String();

        if((val1 == 0) || (val2 == 0)){
            return "Division par 0, impossible";
        }
        else{
            result = val1 / val2;
            return s.valueOf(result);
        }
    }
}
