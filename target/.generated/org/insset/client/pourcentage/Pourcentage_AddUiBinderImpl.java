// .ui.xml template last modified: 1666963445000
package org.insset.client.pourcentage;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.safehtml.shared.SafeUri;
import com.google.gwt.safehtml.shared.UriUtils;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Pourcentage_AddUiBinderImpl implements UiBinder<com.google.gwt.user.client.ui.HTMLPanel, org.insset.client.pourcentage.Pourcentage>, org.insset.client.pourcentage.Pourcentage.AddUiBinder {

  interface Template extends SafeHtmlTemplates {
    @Template("<span id='{0}'></span> <h1>Projet de mise en pratique Scrum</h1>  <div class='bs-section'> <span id='{1}'></span> <span id='{2}'></span> </div>  <div class='bs-section'> <span id='{3}'></span> <span id='{4}'></span> </div>  <div class='bs-section'> <span id='{5}'></span> <span id='{6}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5, String arg6);
     
  }

  Template template = GWT.create(Template.class);


  public com.google.gwt.user.client.ui.HTMLPanel createAndBindUi(final org.insset.client.pourcentage.Pourcentage owner) {


    return new Widgets(owner).get_f_HTMLPanel1();
  }

  /**
   * Encapsulates the access to all inner widgets
   */
  class Widgets {
    private final org.insset.client.pourcentage.Pourcentage owner;


    public Widgets(final org.insset.client.pourcentage.Pourcentage owner) {
      this.owner = owner;
      build_domId0();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId1();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId2();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId3();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId4();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId5();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId6();  // more than one getter call detected. Type: DOM_ID_HOLDER, precedence: 2
      build_domId0Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId1Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId2Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId3Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId4Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId5Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
      build_domId6Element();  // more than one getter call detected. Type: DEFAULT, precedence: 2
    }

    SafeHtml template_html1() {
      return template.html1(get_domId0(), get_domId1(), get_domId2(), get_domId3(), get_domId4(), get_domId5(), get_domId6());
    }

    /**
     * Getter for clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay called 0 times. Type: GENERATED_BUNDLE. Build precedence: 1.
     */
    private org.insset.client.pourcentage.Pourcentage_AddUiBinderImpl_GenBundle get_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      return build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay();
    }
    private org.insset.client.pourcentage.Pourcentage_AddUiBinderImpl_GenBundle build_clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay() {
      // Creation section.
      final org.insset.client.pourcentage.Pourcentage_AddUiBinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (org.insset.client.pourcentage.Pourcentage_AddUiBinderImpl_GenBundle) GWT.create(org.insset.client.pourcentage.Pourcentage_AddUiBinderImpl_GenBundle.class);
      // Setup section.

      return clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay;
    }

    /**
     * Getter for f_HTMLPanel1 called 1 times. Type: DEFAULT. Build precedence: 1.
     */
    private com.google.gwt.user.client.ui.HTMLPanel get_f_HTMLPanel1() {
      return build_f_HTMLPanel1();
    }
    private com.google.gwt.user.client.ui.HTMLPanel build_f_HTMLPanel1() {
      // Creation section.
      final com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template_html1().asString());
      // Setup section.

      {
        // Attach section.
        UiBinderUtil.TempAttachment __attachRecord__ = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());

        get_domId0Element().get();
        get_domId1Element().get();
        get_domId2Element().get();
        get_domId3Element().get();
        get_domId4Element().get();
        get_domId5Element().get();
        get_domId6Element().get();

        // Detach section.
        __attachRecord__.detach();
      }
      f_HTMLPanel1.addAndReplaceElement(get_menu(), get_domId0Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel2(), get_domId1Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel10(), get_domId2Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel16(), get_domId3Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel26(), get_domId4Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel32(), get_domId5Element().get());
      f_HTMLPanel1.addAndReplaceElement(get_f_FlowPanel42(), get_domId6Element().get());

      return f_HTMLPanel1;
    }

    /**
     * Getter for domId0 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId0;
    private java.lang.String get_domId0() {
      return domId0;
    }
    private java.lang.String build_domId0() {
      // Creation section.
      domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId0;
    }

    /**
     * Getter for menu called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private org.insset.client.menu.Menu get_menu() {
      return build_menu();
    }
    private org.insset.client.menu.Menu build_menu() {
      // Creation section.
      final org.insset.client.menu.Menu menu = (org.insset.client.menu.Menu) GWT.create(org.insset.client.menu.Menu.class);
      // Setup section.

      return menu;
    }

    /**
     * Getter for domId0Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId0Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId0Element() {
      return domId0Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId0Element() {
      // Creation section.
      domId0Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId0());
      // Setup section.

      return domId0Element;
    }

    /**
     * Getter for domId1 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId1;
    private java.lang.String get_domId1() {
      return domId1;
    }
    private java.lang.String build_domId1() {
      // Creation section.
      domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId1;
    }

    /**
     * Getter for f_FlowPanel2 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel2() {
      return build_f_FlowPanel2();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel2() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel2 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel2.add(get_f_FlowPanel3());
      f_FlowPanel2.add(get_f_FlowPanel5());
      f_FlowPanel2.add(get_f_FlowPanel7());
      f_FlowPanel2.add(get_f_FlowPanel8());
      f_FlowPanel2.add(get_f_FlowPanel9());

      return f_FlowPanel2;
    }

    /**
     * Getter for f_FlowPanel3 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel3() {
      return build_f_FlowPanel3();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel3() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel3 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel3.add(get_f_Label4());

      return f_FlowPanel3;
    }

    /**
     * Getter for f_Label4 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label4() {
      return build_f_Label4();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label4() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label4 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label4.setText("CALCUL DU POURCENTAGE");

      return f_Label4;
    }

    /**
     * Getter for f_FlowPanel5 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel5() {
      return build_f_FlowPanel5();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel5() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel5 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel5.add(get_f_Label6());

      return f_FlowPanel5;
    }

    /**
     * Getter for f_Label6 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label6() {
      return build_f_Label6();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label6() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label6 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label6.setText("Entre le prix de votre article");

      return f_Label6;
    }

    /**
     * Getter for f_FlowPanel7 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel7() {
      return build_f_FlowPanel7();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel7() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel7 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel7.add(get_valA());

      return f_FlowPanel7;
    }

    /**
     * Getter for valA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valA() {
      return build_valA();
    }
    private com.google.gwt.user.client.ui.TextBox build_valA() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valA = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valA.setText("Entrer une valeur");

      this.owner.valA = valA;

      return valA;
    }

    /**
     * Getter for f_FlowPanel8 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel8() {
      return build_f_FlowPanel8();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel8() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel8 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel8.add(get_errorLabelRToA());

      return f_FlowPanel8;
    }

    /**
     * Getter for errorLabelRToA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToA() {
      return build_errorLabelRToA();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToA() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToA = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToA = errorLabelRToA;

      return errorLabelRToA;
    }

    /**
     * Getter for f_FlowPanel9 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel9() {
      return build_f_FlowPanel9();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel9() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel9 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel9.add(get_boutonClearA());

      return f_FlowPanel9;
    }

    /**
     * Getter for boutonClearA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearA() {
      return build_boutonClearA();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearA() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearA = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearA.setText("Clear");

      this.owner.boutonClearA = boutonClearA;

      return boutonClearA;
    }

    /**
     * Getter for domId1Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId1Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId1Element() {
      return domId1Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId1Element() {
      // Creation section.
      domId1Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId1());
      // Setup section.

      return domId1Element;
    }

    /**
     * Getter for domId2 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId2;
    private java.lang.String get_domId2() {
      return domId2;
    }
    private java.lang.String build_domId2() {
      // Creation section.
      domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId2;
    }

    /**
     * Getter for f_FlowPanel10 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel10() {
      return build_f_FlowPanel10();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel10() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel10 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel10.add(get_f_FlowPanel11());
      f_FlowPanel10.add(get_f_FlowPanel13());
      f_FlowPanel10.add(get_f_FlowPanel14());
      f_FlowPanel10.add(get_f_FlowPanel15());

      return f_FlowPanel10;
    }

    /**
     * Getter for f_FlowPanel11 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel11() {
      return build_f_FlowPanel11();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel11() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel11 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel11.add(get_f_Label12());

      return f_FlowPanel11;
    }

    /**
     * Getter for f_Label12 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label12() {
      return build_f_Label12();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label12() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label12 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label12.setText("Entre la remise sur celui-ci");

      return f_Label12;
    }

    /**
     * Getter for f_FlowPanel13 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel13() {
      return build_f_FlowPanel13();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel13() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel13 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel13.add(get_valB());

      return f_FlowPanel13;
    }

    /**
     * Getter for valB called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valB() {
      return build_valB();
    }
    private com.google.gwt.user.client.ui.TextBox build_valB() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valB = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valB.setText("Entrer une valeur");

      this.owner.valB = valB;

      return valB;
    }

    /**
     * Getter for f_FlowPanel14 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel14() {
      return build_f_FlowPanel14();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel14() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel14 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel14.add(get_errorLabelRToB());
      f_FlowPanel14.add(get_boutonConvertRToA());

      return f_FlowPanel14;
    }

    /**
     * Getter for errorLabelRToB called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToB() {
      return build_errorLabelRToB();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToB() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToB = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToB = errorLabelRToB;

      return errorLabelRToB;
    }

    /**
     * Getter for boutonConvertRToA called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertRToA() {
      return build_boutonConvertRToA();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertRToA() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertRToA = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertRToA.setText("TEST POURCENTAGE");

      this.owner.boutonConvertRToA = boutonConvertRToA;

      return boutonConvertRToA;
    }

    /**
     * Getter for f_FlowPanel15 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel15() {
      return build_f_FlowPanel15();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel15() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel15 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel15.add(get_boutonClearB());

      return f_FlowPanel15;
    }

    /**
     * Getter for boutonClearB called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearB() {
      return build_boutonClearB();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearB() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearB = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearB.setText("Clear");

      this.owner.boutonClearB = boutonClearB;

      return boutonClearB;
    }

    /**
     * Getter for domId2Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId2Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId2Element() {
      return domId2Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId2Element() {
      // Creation section.
      domId2Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId2());
      // Setup section.

      return domId2Element;
    }

    /**
     * Getter for domId3 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId3;
    private java.lang.String get_domId3() {
      return domId3;
    }
    private java.lang.String build_domId3() {
      // Creation section.
      domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId3;
    }

    /**
     * Getter for f_FlowPanel16 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel16() {
      return build_f_FlowPanel16();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel16() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel16 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel16.add(get_f_FlowPanel17());
      f_FlowPanel16.add(get_f_FlowPanel19());
      f_FlowPanel16.add(get_f_FlowPanel21());
      f_FlowPanel16.add(get_f_FlowPanel23());
      f_FlowPanel16.add(get_f_FlowPanel24());
      f_FlowPanel16.add(get_f_FlowPanel25());

      return f_FlowPanel16;
    }

    /**
     * Getter for f_FlowPanel17 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel17() {
      return build_f_FlowPanel17();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel17() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel17 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel17.add(get_f_Label18());

      return f_FlowPanel17;
    }

    /**
     * Getter for f_Label18 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label18() {
      return build_f_Label18();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label18() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label18 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label18.setText("-----------------------------------------------------------------");

      return f_Label18;
    }

    /**
     * Getter for f_FlowPanel19 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel19() {
      return build_f_FlowPanel19();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel19() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel19 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel19.add(get_f_Label20());

      return f_FlowPanel19;
    }

    /**
     * Getter for f_Label20 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label20() {
      return build_f_Label20();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label20() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label20 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label20.setText("CALCUL DU POURCENTAGE INVERSE");

      return f_Label20;
    }

    /**
     * Getter for f_FlowPanel21 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel21() {
      return build_f_FlowPanel21();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel21() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel21 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel21.add(get_f_Label22());

      return f_FlowPanel21;
    }

    /**
     * Getter for f_Label22 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label22() {
      return build_f_Label22();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label22() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label22 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label22.setText("Entre le prix de votre article");

      return f_Label22;
    }

    /**
     * Getter for f_FlowPanel23 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel23() {
      return build_f_FlowPanel23();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel23() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel23 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel23.add(get_valC());

      return f_FlowPanel23;
    }

    /**
     * Getter for valC called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valC() {
      return build_valC();
    }
    private com.google.gwt.user.client.ui.TextBox build_valC() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valC = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valC.setText("Entrer une valeur");

      this.owner.valC = valC;

      return valC;
    }

    /**
     * Getter for f_FlowPanel24 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel24() {
      return build_f_FlowPanel24();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel24() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel24 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel24.add(get_errorLabelRToC());

      return f_FlowPanel24;
    }

    /**
     * Getter for errorLabelRToC called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToC() {
      return build_errorLabelRToC();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToC() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToC = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToC = errorLabelRToC;

      return errorLabelRToC;
    }

    /**
     * Getter for f_FlowPanel25 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel25() {
      return build_f_FlowPanel25();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel25() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel25 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel25.add(get_boutonClearC());

      return f_FlowPanel25;
    }

    /**
     * Getter for boutonClearC called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearC() {
      return build_boutonClearC();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearC() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearC = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearC.setText("Clear");

      this.owner.boutonClearC = boutonClearC;

      return boutonClearC;
    }

    /**
     * Getter for domId3Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId3Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId3Element() {
      return domId3Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId3Element() {
      // Creation section.
      domId3Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId3());
      // Setup section.

      return domId3Element;
    }

    /**
     * Getter for domId4 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId4;
    private java.lang.String get_domId4() {
      return domId4;
    }
    private java.lang.String build_domId4() {
      // Creation section.
      domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId4;
    }

    /**
     * Getter for f_FlowPanel26 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel26() {
      return build_f_FlowPanel26();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel26() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel26 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel26.add(get_f_FlowPanel27());
      f_FlowPanel26.add(get_f_FlowPanel29());
      f_FlowPanel26.add(get_f_FlowPanel30());
      f_FlowPanel26.add(get_f_FlowPanel31());

      return f_FlowPanel26;
    }

    /**
     * Getter for f_FlowPanel27 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel27() {
      return build_f_FlowPanel27();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel27() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel27 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel27.add(get_f_Label28());

      return f_FlowPanel27;
    }

    /**
     * Getter for f_Label28 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label28() {
      return build_f_Label28();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label28() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label28 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label28.setText("Entre la remise sur celui-ci");

      return f_Label28;
    }

    /**
     * Getter for f_FlowPanel29 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel29() {
      return build_f_FlowPanel29();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel29() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel29 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel29.add(get_valD());

      return f_FlowPanel29;
    }

    /**
     * Getter for valD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valD() {
      return build_valD();
    }
    private com.google.gwt.user.client.ui.TextBox build_valD() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valD = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valD.setText("Entrer une valeur");

      this.owner.valD = valD;

      return valD;
    }

    /**
     * Getter for f_FlowPanel30 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel30() {
      return build_f_FlowPanel30();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel30() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel30 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel30.add(get_errorLabelRToD());

      return f_FlowPanel30;
    }

    /**
     * Getter for errorLabelRToD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToD() {
      return build_errorLabelRToD();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToD() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToD = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToD = errorLabelRToD;

      return errorLabelRToD;
    }

    /**
     * Getter for f_FlowPanel31 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel31() {
      return build_f_FlowPanel31();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel31() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel31 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel31.add(get_boutonClearD());
      f_FlowPanel31.add(get_boutonConvertRToC());

      return f_FlowPanel31;
    }

    /**
     * Getter for boutonClearD called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearD() {
      return build_boutonClearD();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearD() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearD = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearD.setText("Clear");

      this.owner.boutonClearD = boutonClearD;

      return boutonClearD;
    }

    /**
     * Getter for boutonConvertRToC called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertRToC() {
      return build_boutonConvertRToC();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertRToC() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertRToC = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertRToC.setText("Convertir");

      this.owner.boutonConvertRToC = boutonConvertRToC;

      return boutonConvertRToC;
    }

    /**
     * Getter for domId4Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId4Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId4Element() {
      return domId4Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId4Element() {
      // Creation section.
      domId4Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId4());
      // Setup section.

      return domId4Element;
    }

    /**
     * Getter for domId5 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId5;
    private java.lang.String get_domId5() {
      return domId5;
    }
    private java.lang.String build_domId5() {
      // Creation section.
      domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId5;
    }

    /**
     * Getter for f_FlowPanel32 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel32() {
      return build_f_FlowPanel32();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel32() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel32 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel32.add(get_f_FlowPanel33());
      f_FlowPanel32.add(get_f_FlowPanel35());
      f_FlowPanel32.add(get_f_FlowPanel37());
      f_FlowPanel32.add(get_f_FlowPanel39());
      f_FlowPanel32.add(get_f_FlowPanel40());
      f_FlowPanel32.add(get_f_FlowPanel41());

      return f_FlowPanel32;
    }

    /**
     * Getter for f_FlowPanel33 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel33() {
      return build_f_FlowPanel33();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel33() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel33 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel33.add(get_f_Label34());

      return f_FlowPanel33;
    }

    /**
     * Getter for f_Label34 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label34() {
      return build_f_Label34();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label34() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label34 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label34.setText("-----------------------------------------------------------------");

      return f_Label34;
    }

    /**
     * Getter for f_FlowPanel35 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel35() {
      return build_f_FlowPanel35();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel35() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel35 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel35.add(get_f_Label36());

      return f_FlowPanel35;
    }

    /**
     * Getter for f_Label36 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label36() {
      return build_f_Label36();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label36() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label36 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label36.setText("DIVISER 2 NOMBRES");

      return f_Label36;
    }

    /**
     * Getter for f_FlowPanel37 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel37() {
      return build_f_FlowPanel37();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel37() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel37 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel37.add(get_f_Label38());

      return f_FlowPanel37;
    }

    /**
     * Getter for f_Label38 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label38() {
      return build_f_Label38();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label38() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label38 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label38.setText("Entre votre entier");

      return f_Label38;
    }

    /**
     * Getter for f_FlowPanel39 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel39() {
      return build_f_FlowPanel39();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel39() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel39 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel39.add(get_valE());

      return f_FlowPanel39;
    }

    /**
     * Getter for valE called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valE() {
      return build_valE();
    }
    private com.google.gwt.user.client.ui.TextBox build_valE() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valE = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valE.setText("Entrer une valeur");

      this.owner.valE = valE;

      return valE;
    }

    /**
     * Getter for f_FlowPanel40 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel40() {
      return build_f_FlowPanel40();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel40() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel40 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel40.add(get_errorLabelRToE());

      return f_FlowPanel40;
    }

    /**
     * Getter for errorLabelRToE called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToE() {
      return build_errorLabelRToE();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToE() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToE = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToE = errorLabelRToE;

      return errorLabelRToE;
    }

    /**
     * Getter for f_FlowPanel41 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel41() {
      return build_f_FlowPanel41();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel41() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel41 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel41.add(get_boutonClearE());

      return f_FlowPanel41;
    }

    /**
     * Getter for boutonClearE called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearE() {
      return build_boutonClearE();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearE() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearE = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearE.setText("Clear");

      this.owner.boutonClearE = boutonClearE;

      return boutonClearE;
    }

    /**
     * Getter for domId5Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId5Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId5Element() {
      return domId5Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId5Element() {
      // Creation section.
      domId5Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId5());
      // Setup section.

      return domId5Element;
    }

    /**
     * Getter for domId6 called 2 times. Type: DOM_ID_HOLDER. Build precedence: 2.
     */
    private java.lang.String domId6;
    private java.lang.String get_domId6() {
      return domId6;
    }
    private java.lang.String build_domId6() {
      // Creation section.
      domId6 = com.google.gwt.dom.client.Document.get().createUniqueId();
      // Setup section.

      return domId6;
    }

    /**
     * Getter for f_FlowPanel42 called 1 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel42() {
      return build_f_FlowPanel42();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel42() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel42 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel42.add(get_f_FlowPanel43());
      f_FlowPanel42.add(get_f_FlowPanel45());
      f_FlowPanel42.add(get_f_FlowPanel46());
      f_FlowPanel42.add(get_f_FlowPanel47());

      return f_FlowPanel42;
    }

    /**
     * Getter for f_FlowPanel43 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel43() {
      return build_f_FlowPanel43();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel43() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel43 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel43.add(get_f_Label44());

      return f_FlowPanel43;
    }

    /**
     * Getter for f_Label44 called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_f_Label44() {
      return build_f_Label44();
    }
    private com.google.gwt.user.client.ui.Label build_f_Label44() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label f_Label44 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.
      f_Label44.setText("Entre votre entier");

      return f_Label44;
    }

    /**
     * Getter for f_FlowPanel45 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel45() {
      return build_f_FlowPanel45();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel45() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel45 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel45.add(get_valF());

      return f_FlowPanel45;
    }

    /**
     * Getter for valF called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.TextBox get_valF() {
      return build_valF();
    }
    private com.google.gwt.user.client.ui.TextBox build_valF() {
      // Creation section.
      final com.google.gwt.user.client.ui.TextBox valF = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
      // Setup section.
      valF.setText("Entrer une valeur");

      this.owner.valF = valF;

      return valF;
    }

    /**
     * Getter for f_FlowPanel46 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel46() {
      return build_f_FlowPanel46();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel46() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel46 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel46.add(get_errorLabelRToF());

      return f_FlowPanel46;
    }

    /**
     * Getter for errorLabelRToF called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.Label get_errorLabelRToF() {
      return build_errorLabelRToF();
    }
    private com.google.gwt.user.client.ui.Label build_errorLabelRToF() {
      // Creation section.
      final com.google.gwt.user.client.ui.Label errorLabelRToF = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
      // Setup section.

      this.owner.errorLabelRToF = errorLabelRToF;

      return errorLabelRToF;
    }

    /**
     * Getter for f_FlowPanel47 called 1 times. Type: DEFAULT. Build precedence: 3.
     */
    private com.google.gwt.user.client.ui.FlowPanel get_f_FlowPanel47() {
      return build_f_FlowPanel47();
    }
    private com.google.gwt.user.client.ui.FlowPanel build_f_FlowPanel47() {
      // Creation section.
      final com.google.gwt.user.client.ui.FlowPanel f_FlowPanel47 = (com.google.gwt.user.client.ui.FlowPanel) GWT.create(com.google.gwt.user.client.ui.FlowPanel.class);
      // Setup section.
      f_FlowPanel47.add(get_boutonClearF());
      f_FlowPanel47.add(get_boutonConvertRToE());

      return f_FlowPanel47;
    }

    /**
     * Getter for boutonClearF called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.ResetButton get_boutonClearF() {
      return build_boutonClearF();
    }
    private com.google.gwt.user.client.ui.ResetButton build_boutonClearF() {
      // Creation section.
      final com.google.gwt.user.client.ui.ResetButton boutonClearF = (com.google.gwt.user.client.ui.ResetButton) GWT.create(com.google.gwt.user.client.ui.ResetButton.class);
      // Setup section.
      boutonClearF.setText("Clear");

      this.owner.boutonClearF = boutonClearF;

      return boutonClearF;
    }

    /**
     * Getter for boutonConvertRToE called 1 times. Type: DEFAULT. Build precedence: 4.
     */
    private com.google.gwt.user.client.ui.SubmitButton get_boutonConvertRToE() {
      return build_boutonConvertRToE();
    }
    private com.google.gwt.user.client.ui.SubmitButton build_boutonConvertRToE() {
      // Creation section.
      final com.google.gwt.user.client.ui.SubmitButton boutonConvertRToE = (com.google.gwt.user.client.ui.SubmitButton) GWT.create(com.google.gwt.user.client.ui.SubmitButton.class);
      // Setup section.
      boutonConvertRToE.setText("Convertir");

      this.owner.boutonConvertRToE = boutonConvertRToE;

      return boutonConvertRToE;
    }

    /**
     * Getter for domId6Element called 2 times. Type: DEFAULT. Build precedence: 2.
     */
    private com.google.gwt.uibinder.client.LazyDomElement domId6Element;
    private com.google.gwt.uibinder.client.LazyDomElement get_domId6Element() {
      return domId6Element;
    }
    private com.google.gwt.uibinder.client.LazyDomElement build_domId6Element() {
      // Creation section.
      domId6Element = new com.google.gwt.uibinder.client.LazyDomElement<Element>(get_domId6());
      // Setup section.

      return domId6Element;
    }
  }
}
