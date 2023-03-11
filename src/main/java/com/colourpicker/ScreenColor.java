package com.colourpicker;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

@SuppressWarnings("all")

public class ScreenColor extends javax.swing.JPanel {

	public static Timer t;

	public boolean transparency;

	Color colour;

	public static boolean picar;

	private static JPanel color;

	public ScreenColor(Color color) {

		setBorder(new LineBorder(new Color(0, 0, 0)));

		this.color = new JPanel();

		this.color.setBackground(color);

		this.color.setBorder(
				new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.GRAY));

		JButton btnNewButton = new JButton("");

		btnNewButton.setFocusPainted(false);

		btnNewButton.setBorder(null);

		btnNewButton.setContentAreaFilled(false);

		btnNewButton.setIcon(new ImageIcon(ScreenColor.class.getResource("/images/color_picker.png")));

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					picar = true;

					t = new Timer();

					MyTask mTask = new MyTask();

					t.scheduleAtFixedRate(mTask, 0, 999999999);

				}

				catch (Exception e1) {

				}

			}

		});

		setLayout(new GridLayout(0, 3, 0, 0));

		add(this.color);

		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");

		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);

		btnNewButton_1.setFocusPainted(false);

		btnNewButton_1.setBorder(null);

		btnNewButton_1.setContentAreaFilled(false);

		btnNewButton_1.setIcon(new ImageIcon(ScreenColor.class.getResource("/images/copy.png")));

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Clipboard clipboard = getSystemClipboard();

				clipboard.setContents(new StringSelection(getHtmlColor()), null);

			}

		});

		add(btnNewButton_1);

	}

	public ScreenColor() {

		setBorder(new LineBorder(new Color(0, 0, 0)));

		color = new JPanel();

		color.setBorder(
				new SoftBevelBorder(BevelBorder.LOWERED, Color.LIGHT_GRAY, Color.GRAY, Color.LIGHT_GRAY, Color.GRAY));

		JButton btnNewButton = new JButton("");

		btnNewButton.setFocusPainted(false);

		btnNewButton.setBorder(null);

		btnNewButton.setContentAreaFilled(false);

		btnNewButton.setIcon(new ImageIcon(ScreenColor.class.getResource("/images/color_picker.png")));

		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					picar = true;

					t = new Timer();

					MyTask mTask = new MyTask();

					t.scheduleAtFixedRate(mTask, 0, 999999999);

				}

				catch (Exception e1) {

				}

			}

		});

		setLayout(new GridLayout(0, 3, 0, 0));

		add(color);

		add(btnNewButton);

		JButton btnNewButton_1 = new JButton("");

		btnNewButton_1.setHorizontalAlignment(SwingConstants.CENTER);

		btnNewButton_1.setFocusPainted(false);

		btnNewButton_1.setBorder(null);

		btnNewButton_1.setContentAreaFilled(false);

		btnNewButton_1.setIcon(new ImageIcon(ScreenColor.class.getResource("/images/copy.png")));

		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Clipboard clipboard = getSystemClipboard();

				clipboard.setContents(new StringSelection(getHtmlColor()), null);

			}

		});

		add(btnNewButton_1);

	}

	private static Clipboard getSystemClipboard() {

		Toolkit defaultToolkit = Toolkit.getDefaultToolkit();

		Clipboard systemClipboard = defaultToolkit.getSystemClipboard();

		return systemClipboard;

	}

	public void setLineBorderColor(Color color) {

		setBorder(new LineBorder(color));

	}

	public void setColor(Color color) {

		this.colour = color;

	}

	public Color getColor() {

		return color.getBackground();

	}

	public String getHtmlColor() {

		return String.format("#%02x%02x%02x", color.getBackground().getRed(), color.getBackground().getGreen(),
				color.getBackground().getBlue());

	}

}
