package org.vaadin.cookie;

import com.vaadin.flow.component.AttachEvent;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JavaScript;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.html.Div;

/**
 * @author jcgueriaud
 */
@CssImport(value = "styles/cookie-consent.css")
@NpmPackage(value = "tartemeringuee", version = "1.2.2")
@JsModule("./tartemeringuee-connector.js")
@Tag("tarte-meringuee")
public class CookieConsent extends Div {

/*
    protected void onAttach(AttachEvent event) {
        super.onAttach(event);
        // executing JS should be avoided in constructor
        getElement().executeJs("initTarteAuCitron()");
    }*/
}
