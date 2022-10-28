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
               calculPourcentage();
            }

        });
        boutonClearB.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {
                valB.setText("");
                errorLabelRToB.setText("");
            }
        });
    }
    
    /**
     * call server
     */
    private void calculPourcentage() {
        if (!FieldVerifier.isValidInt(Integer.parseInt(valA.getText()))) {
            errorLabelRToA.addStyleName("serverResponseLabelError");
            errorLabelRToA.setText("Format incorect");
            return;
        }
        service.calculPourcentageGAIN(valA.getText(),valB.getText(), new AsyncCallback<Integer>() {            
            @Override
            public void onFailure(Throwable caught) {
                // Show the RPC error message to the user
//                Window.alert(SERVER_ERROR);
                errorLabelRToA.setText("Failure    !!!!");
                new DialogBoxInssetPresenter("Pourcentage", valA.getText(), String.valueOf(caught));
            }
            
            public void onSuccess(Integer result) {
                errorLabelRToA.setText(String.valueOf(result));
                new DialogBoxInssetPresenter("Pourcentage", valA.getText(), String.valueOf(result));
            }
        });
    }
}