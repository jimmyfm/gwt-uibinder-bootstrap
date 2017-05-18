package io.github.jimmyfm.gwt.uibinder.client;

import com.google.gwt.user.client.ui.RootPanel;

public class EntryPoint implements com.google.gwt.core.client.EntryPoint {

	@Override
	public void onModuleLoad() {
		RootPanel.get().add(new Main());
	}

	public native static final void log(Object... o)/*-{
		console.log(o);
	}-*/;
}