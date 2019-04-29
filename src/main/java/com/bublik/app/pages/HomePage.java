package com.bublik.app.pages;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;

public class HomePage extends BasePage {

    public HomePage() {
        add(new Label("title", "this is the homepage"));
        add(new BookmarkablePageLink<String>("link", MountedPage.class));
    }
}
