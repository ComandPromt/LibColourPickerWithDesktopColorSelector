package com.colourpicker;

import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseListener;

public class MouseLogger implements NativeMouseListener {

	@Override
	public void nativeMouseClicked(NativeMouseEvent arg0) {

	}

	@Override
	public void nativeMousePressed(NativeMouseEvent arg0) {

		ScreenColor.picar = false;

		ColourPicker.cerrar();

	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent arg0) {

	}

}
