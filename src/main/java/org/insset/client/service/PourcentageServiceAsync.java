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
     * @param nbr1
     * @param nbr2
 * @throws IllegalArgumentException
 */
  void calculPourcentageGAIN(String nbr1, String nbr2, AsyncCallback<Integer> callback);
}