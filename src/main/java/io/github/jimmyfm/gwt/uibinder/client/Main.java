package io.github.jimmyfm.gwt.uibinder.client;

import static io.github.jimmyfm.gwt.uibinder.client.EntryPoint.log;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.TextBox;

public class Main extends Composite
{
	interface MainUiBinder extends UiBinder<HTMLPanel, Main>
	{
	}

	@UiField
	Button bottone;

	@UiField
	TextBox username;

	private static MainUiBinder ourUiBinder = GWT.create(MainUiBinder.class);

	public Main()
	{
		initWidget(ourUiBinder.createAndBindUi(this));
		log(bottone);
	}

	@UiHandler("bottone")
	public void item1Clicked(ClickEvent event)
	{
		log(event);
	}

	@UiHandler("username")
	public void doStuff(ChangeEvent event)
	{
		log("change event", event);
	}

	@UiHandler("username")
	public void doStuffxx(KeyPressEvent event)
	{
		log("keypress event", event);
	}

}