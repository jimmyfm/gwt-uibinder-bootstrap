package io.github.jimmyfm.gwt.uibinder.client;

import static io.github.jimmyfm.gwt.uibinder.client.EntryPoint.log;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Main extends Composite {
	interface MainUiBinder extends UiBinder<HTMLPanel, Main> {
	}

	@UiField
	Button bottone;

	private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

	public Main() {
		initWidget(ourUiBinder.createAndBindUi(this));
		log(bottone);
	}

}