package com.colourpicker;

import java.awt.Robot;

import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;

public class KeyLogger implements NativeKeyListener {

	Robot robot;

	boolean mover;

	public KeyLogger(Robot r) {

		this.robot = r;

	}

	int x = 0;

	int y = 0;

	@Override
	public void nativeKeyPressed(NativeKeyEvent nativeEvent) {

		try {

			ScreenColor.picar = true;

			mover = true;

			if (!(robot instanceof Robot)) {

				robot = new Robot();

			}

			x = ColourPicker.frame.getX();

			y = ColourPicker.frame.getY();

			x -= 10;

			switch (nativeEvent.getKeyCode()) {

			case 57421:

				x++;

				y += 9;

				break;

			case 57419:

				x--;

				y += 9;

				break;

			case 57416:

				y += 8;

				break;

			case 57424:

				y += 10;

				break;

			default:

				mover = false;

				ScreenColor.picar = false;

				ColourPicker.cerrar();

				break;

			}

			if (mover) {

				robot.mouseMove(x, ++y);

			}

		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		// TODO Auto-generated method stub

	}

}
