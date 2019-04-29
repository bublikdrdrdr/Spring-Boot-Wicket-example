package com.bublik.app.pages;

import com.bublik.app.services.GreetingService;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.spring.injection.annot.SpringBean;

public class MountedPage extends BasePage {

    @SpringBean
    private GreetingService greetingService;

    public MountedPage() {
        add(new Label("title", "this is a mounted page"));
        add(new BookmarkablePageLink<String>("link", HomePage.class));
        add(new Label("message", greetingService.getMessage()));
    }
}
