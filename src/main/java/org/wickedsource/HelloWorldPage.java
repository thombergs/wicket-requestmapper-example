package org.wickedsource;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;

public class HelloWorldPage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HelloWorldPage(final PageParameters parameters) {
		super(parameters);

		add(new Label("name", parameters.get("name").toString()));
		add(new Label("age", parameters.get("age").toString()));

	}
}
