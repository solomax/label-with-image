package org.apache.solomax;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.Link;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

	public HomePage(final PageParameters parameters) {
		super(parameters);

		add(new Label("version", getApplication().getFrameworkSettings().getVersion()));

		String htmlWithImgTag = "some text at the beginning <img src=\"/images/icon/add.png\">   something text at the end";
		add(new Label("message", htmlWithImgTag).setEscapeModelStrings(false));

		add(new Link<Void>("goDetail") {
			private static final long serialVersionUID = 1L;

			@Override
			public void onClick() {
				setResponsePage(DetailPage.class);
			}
		});
	}
}
