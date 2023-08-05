package com.colourpicker;

import java.util.TimerTask;

class MyTask extends TimerTask {

	@Override

	public void run() {

		try {

			new ColourPicker();

		}

		catch (Exception e) {

			e.printStackTrace();

		}

	}

}