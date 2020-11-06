package org.vaadin.cookie.views;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.server.PWA;
import org.vaadin.cookie.CookieConsent;
import org.vaadin.cookie.views.about.AboutView;
import org.vaadin.cookie.views.main.MainView;

@PWA(name = "Cookie consent", shortName = "Cookie consent", enableInstallPrompt = false)
public class MainLayout extends AppLayout {

    public MainLayout() {
        final DrawerToggle drawerToggle = new DrawerToggle();
        final RouterLink main = new RouterLink("Main", MainView.class);
        final RouterLink about = new RouterLink("About", AboutView.class);
        final VerticalLayout menuLayout = new VerticalLayout(about, main);
        addToDrawer(new CookieConsent());
        addToDrawer(menuLayout);
        addToNavbar(drawerToggle);
    }

}