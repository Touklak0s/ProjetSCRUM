/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.insset.client.service.RomanConverterService;

/**
 *
 * @author user
 */
@SuppressWarnings("serial")
public class RomanConverterServiceImpl extends RemoteServiceServlet implements
        RomanConverterService {

    public static final String[] Romains= {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public static final Integer[] Arabes= {1000,900,500,400,100,90,50,40,10,9,5,4,1};

    /**
     * Méthode de conversion d'une date en chiffre Arabe a convertir en Romain
     * @param NotreChiffre
     * @return
     * @throws IllegalArgumentException 
     */
    @Override
    public String convertDateYears(String NotreChiffre) throws IllegalArgumentException {
        String resultat = "";
        String other = "";
        
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        for (int i = 0; i < NotreChiffre.length(); i++){
            if ("/".equals(String.valueOf(NotreChiffre.charAt(i)))){
                resultat = resultat + instance.convertArabeToRoman(Integer.parseInt(other));
                resultat = resultat + "/";
                other = "";
            } else {
                other = other + String.valueOf(NotreChiffre.charAt(i));
            }
        }
        resultat = resultat + instance.convertArabeToRoman(Integer.parseInt(other));
        return resultat;
        
    }
    /**
     * Méthode de conversion Roman to Arab
     * @param NotreChiffre
     * @return
     * @throws IllegalArgumentException 
     */

    @Override
    public Integer convertRomanToArabe(String NotreChiffre) throws IllegalArgumentException {
        
        RomanConverterServiceImpl instance = new RomanConverterServiceImpl();
        Integer a = Arabes[instance.findRomanIdByValue(String.valueOf(NotreChiffre.charAt(0)))];
        Integer b = 0;
        Integer resultat = a;
        
        for (int i = 1; i < NotreChiffre.length(); i++){
            b = Arabes[instance.findRomanIdByValue(String.valueOf(NotreChiffre.charAt(i)))];
            
            if (b <= a){
                resultat = resultat + b;
            } else {
                resultat = resultat + b -(2*a);
            }
            a = b;
        }
        return resultat;
    }

    /**
     * Méthode de conversion Arabe to Roman 
     * @param NotreChiffre
     * @return
     * @throws IllegalArgumentException 
     */
 @Override
    public String convertArabeToRoman(Integer NotreChiffre) throws IllegalArgumentException {
        String resultat = "";
        Integer index = 0;
        while (NotreChiffre != 0) {
            if ((NotreChiffre - Arabes[index]) < 0){
                index += 1;
            }
            else {
                resultat = resultat + Romains[index];
                NotreChiffre = NotreChiffre - Arabes[index];
            }
        }
        return resultat; //TEST
    }
    
    public Integer findRomanIdByValue(String value){
        Integer id = 0;
        for (int i = 0; i < Romains.length; i++){
            if (Romains[i].equals(value)){
                id = i;
            }
        }
        return id;
    }

}
