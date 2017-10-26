package org.apache.solomax;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class DetailPage extends WebPage {
	private static final long serialVersionUID = 1L;

	public DetailPage(final PageParameters parameters) {
		super(parameters);

		String htmlWithImgTag = "some DETAIL text at the beginning <img src=\"../../images/icon/add.png\">   something text at the end";
		add(new Label("message", htmlWithImgTag).setEscapeModelStrings(false));
	}
}
