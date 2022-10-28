package org.insset.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import org.insset.client.service.PourcentageService;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class PourcentageServiceImpl extends RemoteServiceServlet implements
        PourcentageService {

    public String calculPourcentageGAIN(Integer nbr1, Integer nbr2) throws IllegalArgumentException {
        
        float prix_remise;
        float valeur_remise;
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        valeur_remise = nbr2 * (float) 0.01;
        prix_remise = nbr1 * valeur_remise;
        
        return df.format(prix_remise);
    }

    @Override
    public Integer calculPourcentageGAIN(String nbr1, String nbr2) throws IllegalArgumentException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}