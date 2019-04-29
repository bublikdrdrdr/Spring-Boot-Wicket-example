package com.bublik.app.pages;

import org.apache.wicket.Application;
import org.apache.wicket.markup.head.CssHeaderItem;
import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.resource.CssResourceReference;

public class BasePage extends WebPage {

    @Override
    public void renderHead(IHeaderResponse response) {
        super.renderHead(response);
        CssResourceReference cssResourceReference = new CssResourceReference(
                Application.class, "example.css");
        response.render(CssHeaderItem.forReference(cssResourceReference));
    }
}
