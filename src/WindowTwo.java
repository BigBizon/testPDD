import java.awt.Color;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.JRadioButton;

public class WindowTwo extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtSelectTheTest;

	JPanel panel;
	String a;

	public WindowTwo() {
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200, 700);
		setResizable(false);
		setLocationRelativeTo(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.RED);
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewTest = new JMenuItem("New test");
		mnNewMenu.add(mntmNewTest);

		JMenuItem mntmStopTest = new JMenuItem("Close");
		mnNewMenu.add(mntmStopTest);

		JMenuItem mntmProperties = new JMenuItem("Properties");
		mntmProperties.setForeground(Color.BLACK);
		mnNewMenu.add(mntmProperties);

		JMenuItem mntmSave = new JMenuItem("Save");
		mnNewMenu.add(mntmSave);

		JMenuItem mntmOpenFile = new JMenuItem("Open File");
		mnNewMenu.add(mntmOpenFile);

		JMenu mnNewMenu_1 = new JMenu("Options");
		menuBar.add(mnNewMenu_1);

		JMenuItem menuItem = new JMenuItem(
				" \u043D\u0435\u0442 \u043E\u043F\u0446\u0438\u0439");
		mnNewMenu_1.add(menuItem);

		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);

		JMenuItem mntmDeveloper = new JMenuItem("Version");
		mntmDeveloper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,
						" Version 1.01. date : 13/10/2015  update : null ");
			}
		});
		mnHelp.add(mntmDeveloper);

		JMenuItem mntmDeveloper_1 = new JMenuItem("Developer");
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

		update();// вызываем панель

		JButton button = new JButton("1");
		button.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					System.out.println(e.equals("res/7.jpg") + " "
							+ e.equals("res/8.jpg"));
					if (e.equals("res/7.jpg")==true) {

						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update2();// меняем панель с другим листом
						button.setBackground(Color.GREEN);
						button.setEnabled(false);
					} else if (e.equals("res/8.jpg")==true) {
						
					}else {JOptionPane.showMessageDialog(null, "not 1");}
					break;
				case KeyEvent.VK_2:
					if (e.equals("res/9.jpg")==true) {

						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update2();// меняем панель с другим листом
						button.setBackground(Color.GREEN);
						button.setEnabled(false);
					} else {
						JOptionPane.showMessageDialog(null, " not 2");
					}
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button.setBackground(Color.RED);
					panel.setVisible(false);
					update2();
					button.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button.setBackground(Color.RED);
					panel.setVisible(false);
					update2();
					button.setEnabled(false);
					break;

				default:
				}
			}
		});
		button.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button.setBounds(10, 617, 50, 23);
		getContentPane().add(button);

		JButton button_1 = new JButton("2");
		button_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update3();
						button_1.setBackground(Color.GREEN);
						button_1.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_1.setBackground(Color.RED);
					panel.setVisible(false);
					update3();
					button_1.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_1.setBackground(Color.RED);
					panel.setVisible(false);
					update3();
					button_1.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_1.setBackground(Color.RED);
					panel.setVisible(false);
					update3();
					button_1.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_1.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_1.setBounds(70, 617, 50, 23);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("3");
		button_2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/10.jpg"
							|| new ImageVol1().vol2() == "res/10.jpg"
							|| new ImageVol1().vol2() == "res/11.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update4();
						button_2.setBackground(Color.GREEN);
						button_2.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_2.setBackground(Color.RED);
					panel.setVisible(false);
					update4();
					button_2.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_2.setBackground(Color.RED);
					panel.setVisible(false);
					update4();
					button_2.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_2.setBackground(Color.RED);
					panel.setVisible(false);
					update4();
					button_2.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_2.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_2.setBounds(130, 617, 50, 23);
		getContentPane().add(button_2);

		JButton btnNewButton = new JButton("4");
		btnNewButton.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update5();
						btnNewButton.setBackground(Color.GREEN);
						btnNewButton.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					btnNewButton.setBackground(Color.RED);
					panel.setVisible(false);
					update5();
					btnNewButton.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					btnNewButton.setBackground(Color.RED);
					panel.setVisible(false);
					update5();
					btnNewButton.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					btnNewButton.setBackground(Color.RED);
					panel.setVisible(false);
					update5();
					btnNewButton.setEnabled(false);
					break;

				default:
				}

			}

		});
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		btnNewButton.setBounds(190, 617, 50, 23);
		getContentPane().add(btnNewButton);

		JButton button_3 = new JButton("5");
		button_3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update6();
						button_3.setBackground(Color.GREEN);
						button_3.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_3.setBackground(Color.RED);
					panel.setVisible(false);
					update6();
					button_3.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_3.setBackground(Color.RED);
					panel.setVisible(false);
					update6();
					button_3.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_3.setBackground(Color.RED);
					panel.setVisible(false);
					update6();
					button_3.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_3.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_3.setBounds(250, 617, 50, 23);
		getContentPane().add(button_3);

		JButton button_4 = new JButton("6");
		button_4.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update7();
						button_4.setBackground(Color.GREEN);
						button_4.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_4.setBackground(Color.RED);
					panel.setVisible(false);
					update7();
					button_4.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_4.setBackground(Color.RED);
					panel.setVisible(false);
					update7();
					button_4.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_4.setBackground(Color.RED);
					panel.setVisible(false);
					update7();
					button_4.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_4.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_4.setBounds(310, 617, 50, 23);
		getContentPane().add(button_4);

		JButton button_5 = new JButton("7");
		button_5.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update8();
						button_5.setBackground(Color.GREEN);
						button_5.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_5.setBackground(Color.RED);
					panel.setVisible(false);
					update8();
					button_5.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_5.setBackground(Color.RED);
					panel.setVisible(false);
					update8();
					button_5.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_5.setBackground(Color.RED);
					panel.setVisible(false);
					update8();
					button_5.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_5.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_5.setBounds(370, 617, 50, 23);
		getContentPane().add(button_5);

		JButton button_6 = new JButton("8");
		button_6.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update9();
						button_6.setBackground(Color.GREEN);
						button_6.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_6.setBackground(Color.RED);
					panel.setVisible(false);
					update9();
					button_6.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_6.setBackground(Color.RED);
					panel.setVisible(false);
					update9();
					button_6.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_6.setBackground(Color.RED);
					panel.setVisible(false);
					update9();
					button_6.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_6.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_6.setBounds(430, 617, 50, 23);
		getContentPane().add(button_6);

		JButton button_7 = new JButton("9");
		button_7.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update10();
						button_7.setBackground(Color.GREEN);
						button_7.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_7.setBackground(Color.RED);
					panel.setVisible(false);
					update10();
					button_7.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_7.setBackground(Color.RED);
					panel.setVisible(false);
					update10();
					button_7.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_7.setBackground(Color.RED);
					panel.setVisible(false);
					update10();
					button_7.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_7.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_7.setBounds(490, 617, 50, 23);
		getContentPane().add(button_7);

		JButton button_8 = new JButton("10");
		button_8.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update11();
						button_8.setBackground(Color.GREEN);
						button_8.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_8.setBackground(Color.RED);
					panel.setVisible(false);
					update11();
					button_8.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_8.setBackground(Color.RED);
					panel.setVisible(false);
					update11();
					button_8.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_8.setBackground(Color.RED);
					panel.setVisible(false);
					update11();
					button_8.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_8.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_8.setBounds(550, 617, 50, 23);
		getContentPane().add(button_8);

		JButton button_9 = new JButton("11");
		button_9.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update12();
						button_9.setBackground(Color.GREEN);
						button_9.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_9.setBackground(Color.RED);
					panel.setVisible(false);
					update12();
					button_9.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_9.setBackground(Color.RED);
					panel.setVisible(false);
					update12();
					button_9.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_9.setBackground(Color.RED);
					panel.setVisible(false);
					update12();
					button_9.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_9.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_9.setBounds(610, 617, 50, 23);
		getContentPane().add(button_9);

		JButton button_10 = new JButton("12");
		button_10.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update13();
						button_10.setBackground(Color.GREEN);
						button_10.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_10.setBackground(Color.RED);
					panel.setVisible(false);
					update13();
					button_10.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_10.setBackground(Color.RED);
					panel.setVisible(false);
					update13();
					button_10.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_10.setBackground(Color.RED);
					panel.setVisible(false);
					update13();
					button_10.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_10.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_10.setBounds(670, 617, 50, 23);
		getContentPane().add(button_10);

		JButton button_11 = new JButton("13");
		button_11.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update14();
						button_11.setBackground(Color.GREEN);
						button_11.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_11.setBackground(Color.RED);
					panel.setVisible(false);
					update14();
					button_11.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_11.setBackground(Color.RED);
					panel.setVisible(false);
					update14();
					button_11.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_11.setBackground(Color.RED);
					panel.setVisible(false);
					update14();
					button_11.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_11.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_11.setBounds(730, 617, 50, 23);
		getContentPane().add(button_11);

		JButton button_12 = new JButton("14");
		button_12.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update15();
						button_12.setBackground(Color.GREEN);
						button_12.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_12.setBackground(Color.RED);
					panel.setVisible(false);
					update15();
					button_12.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_12.setBackground(Color.RED);
					panel.setVisible(false);
					update15();
					button_12.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_12.setBackground(Color.RED);
					panel.setVisible(false);
					update15();
					button_12.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_12.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_12.setBounds(790, 617, 50, 23);
		getContentPane().add(button_12);

		JButton button_13 = new JButton("15");
		button_13.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update16();
						button_13.setBackground(Color.GREEN);
						button_13.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_13.setBackground(Color.RED);
					panel.setVisible(false);
					update16();
					button_13.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_13.setBackground(Color.RED);
					panel.setVisible(false);
					update16();
					button_13.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_13.setBackground(Color.RED);
					panel.setVisible(false);
					update16();
					button_13.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_13.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));

		button_13.setBounds(850, 617, 50, 23);
		getContentPane().add(button_13);

		JButton button_14 = new JButton("16");
		button_14.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update17();
						button_14.setBackground(Color.GREEN);
						button_14.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_14.setBackground(Color.RED);
					panel.setVisible(false);
					update17();
					button_14.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_14.setBackground(Color.RED);
					panel.setVisible(false);
					update17();
					button_14.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_14.setBackground(Color.RED);
					panel.setVisible(false);
					update17();
					button_14.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_14.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_14.setBounds(910, 617, 50, 23);
		getContentPane().add(button_14);

		JButton button_15 = new JButton("17");
		button_15.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update18();
						button_15.setBackground(Color.GREEN);
						button_15.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_15.setBackground(Color.RED);
					panel.setVisible(false);
					update18();
					button_15.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_15.setBackground(Color.RED);
					panel.setVisible(false);
					update18();
					button_15.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_15.setBackground(Color.RED);
					panel.setVisible(false);
					update18();
					button_15.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_15.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_15.setBounds(970, 617, 50, 23);
		getContentPane().add(button_15);

		JButton button_16 = new JButton("18");
		button_16.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update19();
						button_16.setBackground(Color.GREEN);
						button_16.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_16.setBackground(Color.RED);
					panel.setVisible(false);
					update19();
					button_16.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_16.setBackground(Color.RED);
					panel.setVisible(false);
					update19();
					button_16.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_16.setBackground(Color.RED);
					panel.setVisible(false);
					update19();
					button_16.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_16.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		button_16.setBounds(1030, 617, 44, 23);
		getContentPane().add(button_16);

		JButton button_17 = new JButton("19");
		button_17.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update20();
						button_17.setBackground(Color.GREEN);
						button_17.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_17.setBackground(Color.RED);
					panel.setVisible(false);
					update20();
					button_17.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_17.setBackground(Color.RED);
					panel.setVisible(false);
					update20();
					button_17.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_17.setBackground(Color.RED);
					panel.setVisible(false);
					update20();
					button_17.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_17.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 11));
		button_17.setBounds(1079, 617, 50, 23);
		getContentPane().add(button_17);

		JButton button_18 = new JButton("20");
		button_18.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				switch (e.getKeyCode()) {
				case KeyEvent.VK_1:
					if (new ImageVol1().vol2() == "res/17.jpg"
							|| new ImageVol1().vol2() == "res/16.jpg"
							|| new ImageVol1().vol2() == "res/15.jpg") {
						JOptionPane.showMessageDialog(null, "ok");
						panel.setVisible(false);
						update21();
						button_18.setBackground(Color.GREEN);
						button_18.setEnabled(false);

					}
					break;
				case KeyEvent.VK_2:
					JOptionPane.showMessageDialog(null, "no");
					button_18.setBackground(Color.RED);
					panel.setVisible(false);
					update21();
					button_18.setEnabled(false);
					break;
				case KeyEvent.VK_3:
					JOptionPane.showMessageDialog(null, "no");
					button_18.setBackground(Color.RED);
					panel.setVisible(false);
					update21();
					button_18.setEnabled(false);
					break;
				case KeyEvent.VK_4:
					JOptionPane.showMessageDialog(null, "no");
					button_18.setBackground(Color.RED);
					panel.setVisible(false);
					update21();
					button_18.setEnabled(false);
					break;

				default:
				}

			}

		});
		button_18.setFont(new Font("Tempus Sans ITC", Font.PLAIN, 10));
		button_18.setBounds(1134, 617, 50, 23);
		getContentPane().add(button_18);

		JButton[] bt = new JButton[4];
		bt[0] = button;
		bt[1] = button_1;
		bt[2] = button_2;
		bt[3] = button_3;

	}

	public void update() {
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol1()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	public void update2() {
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol2()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update3() {
		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol3()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);

	}

	private void update4() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update5() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update6() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update7() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update8() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update9() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update10() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update11() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update12() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update13() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update14() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update15() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update16() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update17() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update18() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update19() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update20() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}

	private void update21() {

		panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(10, 45, 1174, 511);
		getContentPane().add(panel);

		JLabel imagelabel = new JLabel(new ImageIcon(new ImageVol1().vol4()));// передаем
		// JLabel imagelabel2 = new JLabel(new ImageIcon(new
		// ImageVol1().vol2())); // рандомную
		// картинку
		panel.add(imagelabel);

		setVisible(true);
	}
}
