package org.vaadin.cookie.views.main;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.cookie.views.MainLayout;

@Route(value = "", layout = MainLayout.class)
@PageTitle("Main")
@RouteAlias(value = "", layout = MainLayout.class)
public class MainView extends Div {

    public MainView() {
        setId("main-view");
        add(new Label("Main View"));
    }

}
