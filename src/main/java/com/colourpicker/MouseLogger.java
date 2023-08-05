package com.colourpicker;

import com.github.kwhat.jnativehook.mouse.NativeMouseEvent;
import com.github.kwhat.jnativehook.mouse.NativeMouseListener;

class MouseLogger implements NativeMouseListener {

	@Override
	public void nativeMouseClicked(NativeMouseEvent arg0) {

	}

	@Override
	public void nativeMousePressed(NativeMouseEvent arg0) {

		try {

			ScreenColor.picar = false;

			ColourPicker.cerrar();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent arg0) {

	}

}
