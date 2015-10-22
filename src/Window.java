import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Window extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtSelectTheTest;
	private Component btnNewButton_1;
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewTest;
	private JMenuItem mntmStopTest;
	private JMenuItem mntmProperties;
	private JMenuItem mntmSave;
	private JMenuItem mntmOpenFile;
	private JMenu mnNewMenu_1;
	private JMenuItem menuItem;
	private JMenu mnHelp;
	private AbstractButton mntmDeveloper;
	private JMenuItem mntmDeveloper_1;

	public Window(int w, int h) {

		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(w, h);
		setResizable(true);
		// pack();//чтобы все влезло
		setLocationRelativeTo(null);

		menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		setJMenuBar(menuBar);

		mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		mntmNewTest = new JMenuItem("New test");
		mnNewMenu.add(mntmNewTest);

		mntmStopTest = new JMenuItem("Close");
		mntmStopTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "!!!");
			}
		});
		mnNewMenu.add(mntmStopTest);

		mntmProperties = new JMenuItem("Properties");
		mntmProperties.setForeground(Color.BLACK);
		mnNewMenu.add(mntmProperties);

		mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);

		mntmOpenFile = new JMenuItem("Open File");
		mnNewMenu.add(mntmOpenFile);

		mnNewMenu_1 = new JMenu("Options");
		menuBar.add(mnNewMenu_1);

		menuItem = new JMenuItem(
				" \u043D\u0435\u0442 \u043E\u043F\u0446\u0438\u0439");
		mnNewMenu_1.add(menuItem);

		mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		mntmDeveloper = new JMenuItem("Version");
		mntmDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						" Version 1.01. date : 13/10/2015  update : null ");
			}
		});
		mnHelp.add(mntmDeveloper);

		mntmDeveloper_1 = new JMenuItem("Developer");
		mntmDeveloper_1.setBackground(Color.WHITE);
		mntmDeveloper_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane
						.showMessageDialog(
								null,
								" Developer : Зенович А.Н. contacts : tel.8(953)920-20-07 , mail : pleyada@sibmail.com");
			}
		});
		mnHelp.add(mntmDeveloper_1);
		getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("Test A/B");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new WindowTwo();

			}
		});
		btnNewButton.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnNewButton.setBounds(375, 276, 175, 96);
		getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Test C/D");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new WindowTwo();

			}
		});
		btnNewButton_1.setFont(new Font("Stencil", Font.PLAIN, 16));
		btnNewButton_1.setBounds(733, 276, 175, 96);
		getContentPane().add(btnNewButton_1);

		txtSelectTheTest = new JTextField();
		txtSelectTheTest.setEditable(false);
		txtSelectTheTest.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelectTheTest.setFont(new Font("Rockwell", Font.PLAIN, 16));
		txtSelectTheTest.setText("Select the test ");
		txtSelectTheTest.setBounds(560, 302, 163, 41);
		getContentPane().add(txtSelectTheTest);
		txtSelectTheTest.setColumns(10);

		setVisible(true);
	}

}
