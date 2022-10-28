package org.insset.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("pourcentage")
public interface PourcentageService extends RemoteService {
        
    /**
     * Calcul pourcentage
     *
     * @param tabVal
     * @return
     * @throws IllegalArgumentException
     */
    String calculPourcentageGAIN(String[] tabVal) throws IllegalArgumentException;
    
    String calculPourcentageINITIAL(String[] tabVal) throws IllegalArgumentException;
    
    String calculDiviseur(String[] tabVal) throws IllegalArgumentException;
}