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

    @Override
    public String calculPourcentageGAIN(String[] tabVal) throws IllegalArgumentException {
        
        float prix_remise;
        float valeur_remise;
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        valeur_remise = Integer.parseInt(tabVal[1]) * (float) 0.01;
        prix_remise = Integer.parseInt(tabVal[0]) * valeur_remise;
        
        return "Votre article est au prix originel de " + tabVal[0] + " avec une réduction de " + tabVal[1] + "% ce qui vous fait économiser : " + df.format(prix_remise)+"€";
    }
    
    @Override
    public String calculPourcentageINITIAL(String[] tabVal) throws IllegalArgumentException {
        
        float prix_depart;
        float valeur_remise;
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        valeur_remise = Integer.parseInt(tabVal[1]) * (float) 0.01;
        prix_depart = Integer.parseInt(tabVal[0]) * (1+valeur_remise);
        
        return "Votre article est au prix solder de " + tabVal[0] + " avec une réduction de " + tabVal[1] + "% ce qui vous un prix initial de : " + df.format(prix_depart)+"€";
        
    }
    
    @Override
    public String calculDiviseur(String[] tabVal) throws IllegalArgumentException {
        
        float result;
        
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        
        if ((Integer.parseInt(tabVal[0]) == 0) || (Integer.parseInt(tabVal[1]) == 0))
        {
            return "Division par 0 impossible !";
        }else{
            result = Float.parseFloat(tabVal[0]) / Float.parseFloat(tabVal[1]);
            return "Resultat de votre division : " + df.format(result);
        }
        
    }
}