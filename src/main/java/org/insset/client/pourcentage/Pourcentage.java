package org.insset.client.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ResetButton;
import com.google.gwt.user.client.ui.SubmitButton;
import com.google.gwt.user.client.ui.TextBox;
import org.insset.client.message.dialogbox.DialogBoxInssetPresenter;
import org.insset.client.service.PourcentageService;
import org.insset.client.service.PourcentageServiceAsync;
import org.insset.shared.FieldVerifier;

/**
 *
 * @author insset
 */
public class Pourcentage extends Composite {
    
    @UiField
    public ResetButton boutonClearA;
    @UiField
    public SubmitButton boutonConvertRToA;
    @UiField
    public TextBox valA;
    @UiField
    public Label errorLabelRToA;
    @UiField
    public ResetButton boutonClearB;
    @UiField
    public TextBox valB;
    @UiField
    public Label errorLabelRToB;
    
    @UiField
    public ResetButton boutonClearC;
    @UiField
    public SubmitButton boutonConvertRToC;
    @UiField
    public TextBox valC;
    @UiField
    public Label errorLabelRToC;
    @UiField
    public ResetButton boutonClearD;
    @UiField
    public TextBox valD;
    @UiField
    public Label errorLabelRToD;
    
    @UiField
    public ResetButton boutonClearE;
    @UiField
    public SubmitButton boutonConvertRToE;
    @UiField
    public TextBox valE;
    @UiField
    public Label errorLabelRToE;
    @UiField
    public ResetButton boutonClearF;
    @UiField
    public TextBox valF;
    @UiField
    public Label errorLabelRToF;
    
    interface AddUiBinder extends UiBinder<HTMLPanel, Pourcentage> {
    }
    
    /**
     * Create UiBinder for the view
     */
    private static AddUiBinder ourUiBinder = GWT.create(AddUiBinder.class);
    
    /**
     * Create a remote service proxy to talk to the server-side Greeting
     * service.
     */
    private final PourcentageServiceAsync service = GWT.create(PourcentageService.class);

    /**
     * Constructeur
     */
    public Pourcentage() {
        initWidget(ourUiBinder.createAndBindUi(this));
        initHandler();
    }

    /**
     * Init des handler
     */
    private void initHandler() {
        boutonClearA.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valA.setText("");
                errorLabelRToA.setText("");
            }
        });
        boutonConvertRToA.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
               calculPourcentageGAIN();
            }

        });
        boutonClearB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valB.setText("");
                errorLabelRToB.setText("");
            }
        });
        boutonClearC.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valC.setText("");
                errorLabelRToC.setText("");
            }
        });
        boutonConvertRToC.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
               calculPourcentageINITIAL();
            }

        });
        boutonClearD.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valD.setText("");
                errorLabelRToD.setText("");
            }
        });
        boutonClearE.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valE.setText("");
                errorLabelRToE.setText("");
            }
        });
        boutonConvertRToE.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
               calculDiviseur();
            }

        });
        boutonClearF.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valF.setText("");
                errorLabelRToF.setText("");
            }
        });
    }
    
    /**
     * call server
     */
    private void calculPourcentageGAIN() {
        if (!FieldVerifier.isValidInt(Integer.parseInt(valA.getText()))) {
            errorLabelRToA.addStyleName("serverResponseLabelError");
            errorLabelRToA.setText("Format incorect");
            return;
        }
        String[] tabVal = new String[] {valA.getText(), valB.getText()};
        service.calculPourcentageGAIN(tabVal, new AsyncCallback<String>() {            
            @Override
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
                errorLabelRToA.setText("Failure    !!!!");
                new DialogBoxInssetPresenter("Erreur", valA.getText()+" "+valB.getText(), String.valueOf(caught));
            }
            
            public void onSuccess(String result) {
                errorLabelRToA.setText(String.valueOf(result));
                new DialogBoxInssetPresenter("Pourcentage", valA.getText()+" "+valB.getText(), String.valueOf(result));
            }
        });
    }
    
    /**
     * call server
     */
    private void calculPourcentageINITIAL() {
        if (!FieldVerifier.isValidInt(Integer.parseInt(valA.getText()))) {
            errorLabelRToC.addStyleName("serverResponseLabelError");
            errorLabelRToC.setText("Format incorect");
            return;
        }
        String[] tabVal = new String[] {valC.getText(), valD.getText()};
        service.calculPourcentageGAIN(tabVal, new AsyncCallback<String>() {            
            @Override
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
                errorLabelRToC.setText("Failure    !!!!");
                new DialogBoxInssetPresenter("Erreur", valC.getText()+" "+valD.getText(), String.valueOf(caught));
            }
            
            public void onSuccess(String result) {
                errorLabelRToC.setText(String.valueOf(result));
                new DialogBoxInssetPresenter("Pourcentage", valC.getText()+" "+valD.getText(), String.valueOf(result));
            }
        });
    }
    
    /**
     * call server
     */
    private void calculDiviseur() {
        if (!FieldVerifier.isValidInt(Integer.parseInt(valA.getText()))) {
            errorLabelRToE.addStyleName("serverResponseLabelError");
            errorLabelRToE.setText("Format incorect");
            return;
        }
        String[] tabVal = new String[] {valE.getText(), valF.getText()};
        service.calculPourcentageGAIN(tabVal, new AsyncCallback<String>() {            
            @Override
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
                errorLabelRToE.setText("Failure    !!!!");
                new DialogBoxInssetPresenter("Erreur", valE.getText()+" "+valF.getText(), String.valueOf(caught));
            }
            
            public void onSuccess(String result) {
                errorLabelRToE.setText(String.valueOf(result));
                new DialogBoxInssetPresenter("Pourcentage", valE.getText()+" "+valF.getText(), String.valueOf(result));
            }
        });
    }
}