package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 *
 * @author user
 */
public interface PourcentageServiceAsync {
  
/**
 * AsyncCallback pour Convertion Chiffre romain en chiffre arabe
 *
 * @param tabVal
 * @throws IllegalArgumentException
 */
  void calculPourcentageGAIN(String[] tabVal, AsyncCallback<String> callback);
    
  void calculPourcentageINITIAL(String[] tabVal, AsyncCallback<String> callback);

  void calculDiviseur(String[] tabVal, AsyncCallback<String> callback);
}