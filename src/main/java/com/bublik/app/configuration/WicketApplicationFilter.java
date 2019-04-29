package com.bublik.app.configuration;

import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.protocol.http.WicketFilter;
import org.springframework.stereotype.Component;

import javax.servlet.DispatcherType;
import javax.servlet.annotation.WebFilter;

@Component
@WebFilter(urlPatterns = "/*", dispatcherTypes = {DispatcherType.REQUEST, DispatcherType.ERROR})
public class WicketApplicationFilter extends WicketFilter {

    public WicketApplicationFilter(WebApplication application) {
        super(application);
    }
}