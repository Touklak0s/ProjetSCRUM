/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.insset.client.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.Messages;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.PourcentageService;
import org.insset.client.service.PourcentageServiceAsync;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author insset
 */
public class Pourcentage {
    
    @UiField
    public ResetButton boutonClear;
    @UiField
    public SubmitButton boutonEnregistrer;
    @UiField
    public TextBox nom;
    @UiField
    public Label errorLabel;
    
    /**
     * The message displayed to the user when the server cannot be reached or
     * returns an error.
     */
    private static final String SERVER_ERROR = "An error occurred while "
            + "attempting to contact the server. Please check your network "
            + "connection and try again.";

    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final PourcentageServiceAsync service = GWT.create(Pourcentage.class);

    private final Messages messages = GWT.create(Messages.class);

    private void initWidget(HTMLPanel createAndBindUi) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    interface MainUiBinder extends UiBinder<HTMLPanel, Pourcentage> {
    }

    private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

    /**
     * Constructeur
     */
    public Pourcentage() {
        //bind de la page
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }
    
    /**
     * Methode qui innitialise les handler pour les cliques sur les boutons
     */
    protected void initHandler() {
        boutonClear.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                nom.setText("");
                errorLabel.setText("");
            }
        });
        boutonEnregistrer.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                contacterService();
            }

        });
    }
    
    private void contacterService() {
        errorLabel.setText("");
        final String textToServer = nom.getText();
        if (!FieldVerifier.isValidName(textToServer)) {
            errorLabel.addStyleName("serverResponseLabelError");
            errorLabel.setText("Aucun texte entré!!");
            return;
        }
        service.calculPourcentage(textToServer, new AsyncCallback<String>() {
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
                Window.alert(SERVER_ERROR);
            }

            public void onSuccess(String result) {
                new DialogBoxInssetPresenter("Vous gagnez X€ sur votre Article :", textToServer, result);
            }
        });
    }
}