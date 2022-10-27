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

    
    @Override
    public String convertDateYears(String nbr) throws IllegalArgumentException {
        //Implement your code
        return "XV/III/MX";
    }

    @Override
    public Integer convertRomanToArabe(String nbr) throws IllegalArgumentException {
        //Implement your code
        return 3;
    }

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
