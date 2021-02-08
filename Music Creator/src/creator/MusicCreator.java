package creator;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class MusicCreator extends JFrame{
	private static ArrayList<File> song = new ArrayList<File>();
	private static ArrayList<File> chord = new ArrayList<File>();
	private static ArrayList<String> printOut = new ArrayList<String>();
	private static ArrayList<String> printOut2 = new ArrayList<String>();
	
	private final String lowA = "./sounds/lowA.wav";
	private final String B = "./sounds/B.wav";
	private final String C = "./sounds/C.wav";
	private final String D = "./sounds/D.wav";
	private final String E = "./sounds/E.wav";
	private final String F = "./sounds/F.wav";
	private final String G = "./sounds/G.wav";
	private final String highA = "./sounds/highA.wav";
	private final String silence = "./sounds/silence.wav";

	public void populateContentPane(Container contentPane) {
		Dimension size = new Dimension(10,50);
		Dimension buttonSize = new Dimension(200,100);
		Dimension addSize = new Dimension(100, 100);
		Dimension playSize = new Dimension(250, 150);
		Dimension windowSize = new Dimension(1280, 720);
		Dimension largeGap = new Dimension(500,0);
		
		Font font = new Font("Franklin Gothic Medium", Font.PLAIN, 22);
		Font titleFont = new Font("Franklin Gothic Medium", Font.BOLD, 52);
		Font noteFont = new Font("Franklin Gothic Medium", Font.PLAIN, 42);
		Font labelSize = new Font("Franklin Gothic Medium", Font.PLAIN, 42);
		
		JPanel outerPanel = new JPanel();
		JPanel titlePanel = new JPanel();
		JPanel labelPanel = new JPanel();
		JPanel mainPanel = new JPanel();
		
		JPanel buttonPanel = new JPanel();
		JPanel buttonPanel2 = new JPanel();
		JPanel buttonPanel3 = new JPanel();
		JPanel outputPanel = new JPanel();
		JPanel dispButtonPanel = new JPanel();
		
		JPanel dispButtonPanel2 = new JPanel();
		JPanel outputPanel2 = new JPanel();
		JPanel buttonPanel4 = new JPanel();
		JPanel buttonPanel5 = new JPanel();
		JPanel buttonPanel6 = new JPanel();
		
		
		outerPanel.setLayout(new BoxLayout(outerPanel, BoxLayout.Y_AXIS));
		titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.Y_AXIS));
		labelPanel.setLayout(new BoxLayout(labelPanel, BoxLayout.X_AXIS));
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.X_AXIS));
		
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		buttonPanel2.setLayout(new BoxLayout(buttonPanel2, BoxLayout.Y_AXIS));
		buttonPanel3.setLayout(new BoxLayout(buttonPanel3, BoxLayout.Y_AXIS));
		outputPanel.setLayout(new BoxLayout(outputPanel, BoxLayout.Y_AXIS));
		dispButtonPanel.setLayout(new BoxLayout(dispButtonPanel, BoxLayout.Y_AXIS));
		
		dispButtonPanel2.setLayout(new BoxLayout(dispButtonPanel2, BoxLayout.Y_AXIS));
		outputPanel2.setLayout(new BoxLayout(outputPanel2, BoxLayout.Y_AXIS));
		buttonPanel4.setLayout(new BoxLayout(buttonPanel4, BoxLayout.Y_AXIS));
		buttonPanel5.setLayout(new BoxLayout(buttonPanel5, BoxLayout.Y_AXIS));
		buttonPanel6.setLayout(new BoxLayout(buttonPanel6, BoxLayout.Y_AXIS));
		
		
		JButton button, button1, button2, button3, button4, button5, button6, button7,
		button8, add, add1, add2, add3, add4, add5, add6, add7, add8, play, deletePrevious, reset;
		
		JButton button9, button10, button11, button12, button13, button14, button15, button16,
		add9, add10, add11, add12, add13, add14, add15, add16, play2, deletePrevious2, reset2;
		
		JTextArea outputText, outputText2;
		
		JLabel titleLabel, nameLabel, songLabel, chordLabel;
		
		titleLabel = new JLabel("Music Creator");
		titleLabel.setFont(titleFont);
		titleLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		nameLabel = new JLabel("Created by Keegan Dwyer");
		nameLabel.setFont(font);
		nameLabel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		titlePanel.add(titleLabel);
		titlePanel.add(nameLabel);
		
		songLabel = new JLabel("Song Creator", SwingConstants.LEFT);
		chordLabel = new JLabel("Chord Creator", SwingConstants.RIGHT);
		
		songLabel.setFont(labelSize);
		chordLabel.setFont(labelSize);
		
		labelPanel.add(songLabel);
		labelPanel.add(Box.createRigidArea(largeGap));
		labelPanel.add(chordLabel);
		
		button = new JButton("A");	// Creates and labels buttons for listening to each note
		button1 = new JButton("B");
		button2 = new JButton("C#");
		button3 = new JButton("D");
		button4 = new JButton("E");
		button5 = new JButton("F#");
		button6 = new JButton("G#");
		button7 = new JButton("A");
		button8 = new JButton("Rest");
		
		button9 = new JButton("A");
		button10 = new JButton("B");
		button11 = new JButton("C#");
		button12 = new JButton("D");
		button13 = new JButton("E");
		button14 = new JButton("F#");
		button15 = new JButton("G#");
		button16 = new JButton("A");
		
		button.setMaximumSize(buttonSize);	// Sets listening buttons to the correct size
		button1.setMaximumSize(buttonSize);
		button2.setMaximumSize(buttonSize);
		button3.setMaximumSize(buttonSize);
		button4.setMaximumSize(buttonSize);
		button5.setMaximumSize(buttonSize);
		button6.setMaximumSize(buttonSize);
		button7.setMaximumSize(buttonSize);
		button8.setMaximumSize(buttonSize);
		
		button9.setMaximumSize(buttonSize);
		button10.setMaximumSize(buttonSize);
		button11.setMaximumSize(buttonSize);
		button12.setMaximumSize(buttonSize);
		button13.setMaximumSize(buttonSize);
		button14.setMaximumSize(buttonSize);
		button15.setMaximumSize(buttonSize);
		button16.setMaximumSize(buttonSize);
		
		button.setFont(font);	// Sets inner button text to the correct font and size
		button1.setFont(font);
		button2.setFont(font);
		button3.setFont(font);
		button4.setFont(font);
		button5.setFont(font);
		button6.setFont(font);
		button7.setFont(font);
		button8.setFont(font);
		
		button9.setFont(font);
		button10.setFont(font);
		button11.setFont(font);
		button12.setFont(font);
		button13.setFont(font);
		button14.setFont(font);
		button15.setFont(font);
		button16.setFont(font);
		
		buttonPanel.add(button);	// Puts listening buttons onto the first button panel
		buttonPanel.add(button1);
		buttonPanel.add(button2);
		buttonPanel.add(button3);
		buttonPanel.add(button4);
		buttonPanel.add(button5);
		buttonPanel.add(button6);
		buttonPanel.add(button7);
		buttonPanel.add(button8);
		
		buttonPanel6.add(button9);	// Puts listening buttons onto the final button panel
		buttonPanel6.add(button10);
		buttonPanel6.add(button11);
		buttonPanel6.add(button12);
		buttonPanel6.add(button13);
		buttonPanel6.add(button14);
		buttonPanel6.add(button15);
		buttonPanel6.add(button16);
		
		add = new JButton("+");	// Creates adding buttons for first button panel
		add1 = new JButton("+");
		add2 = new JButton("+");
		add3 = new JButton("+");
		add4 = new JButton("+");
		add5 = new JButton("+");
		add6 = new JButton("+");
		add7 = new JButton("+");
		add8 = new JButton("+");
		
		add9 = new JButton("+");	// Creates adding buttons for final button panel
		add10 = new JButton("+");
		add11 = new JButton("+");
		add12 = new JButton("+");
		add13 = new JButton("+");
		add14 = new JButton("+");
		add15 = new JButton("+");
		add16 = new JButton("+");
		
		add.setMaximumSize(addSize);	// Sets buttons to the correct size
		add1.setMaximumSize(addSize);
		add2.setMaximumSize(addSize);
		add3.setMaximumSize(addSize);
		add4.setMaximumSize(addSize);
		add5.setMaximumSize(addSize);
		add6.setMaximumSize(addSize);
		add7.setMaximumSize(addSize);
		add8.setMaximumSize(addSize);
		
		add9.setMaximumSize(addSize);
		add10.setMaximumSize(addSize);
		add11.setMaximumSize(addSize);
		add12.setMaximumSize(addSize);
		add13.setMaximumSize(addSize);
		add14.setMaximumSize(addSize);
		add15.setMaximumSize(addSize);
		add16.setMaximumSize(addSize);
		
		add.setFont(font);	// Sets text inside button to correct font/size
		add1.setFont(font);
		add2.setFont(font);
		add3.setFont(font);
		add4.setFont(font);
		add5.setFont(font);
		add6.setFont(font);
		add7.setFont(font);
		add8.setFont(font);
		
		add9.setFont(font);
		add10.setFont(font);
		add11.setFont(font);
		add12.setFont(font);
		add13.setFont(font);
		add14.setFont(font);
		add15.setFont(font);
		add16.setFont(font);
		
		buttonPanel2.add(add);	// Puts note adding buttons onto the first button panel
		buttonPanel2.add(add1);
		buttonPanel2.add(add2);
		buttonPanel2.add(add3);
		buttonPanel2.add(add4);
		buttonPanel2.add(add5);
		buttonPanel2.add(add6);
		buttonPanel2.add(add7);
		buttonPanel2.add(add8);
		
		buttonPanel5.add(add9);	// Puts note adding buttons onto the final button panel
		buttonPanel5.add(add10);
		buttonPanel5.add(add11);
		buttonPanel5.add(add12);
		buttonPanel5.add(add13);
		buttonPanel5.add(add14);
		buttonPanel5.add(add15);
		buttonPanel5.add(add16);

		play = new JButton("Play Song");	// Creates a play, undo, and erase function for both songs and chords
		play.setMaximumSize(playSize);
		play.setFont(font);
		buttonPanel3.add(play);
		
		play2 = new JButton("Play Chord");
		play2.setMaximumSize(playSize);
		play2.setFont(font);
		buttonPanel4.add(play2);
				
		deletePrevious = new JButton("Delete Previous");
		deletePrevious.setMaximumSize(buttonSize);
		deletePrevious.setFont(font);
		buttonPanel3.add(deletePrevious);
		
		deletePrevious2 = new JButton("Delete Previous");
		deletePrevious2.setMaximumSize(buttonSize);
		deletePrevious2.setFont(font);
		buttonPanel4.add(deletePrevious2);
		
		reset = new JButton("Erase Song");
		reset.setMaximumSize(buttonSize);
		reset.setFont(font);
		buttonPanel3.add(reset);
		
		reset2 = new JButton("Erase Chord");
		reset2.setMaximumSize(buttonSize);
		reset2.setFont(font);
		buttonPanel4.add(reset2);
		
		outputText = new JTextArea();	// Creates visual note output area for songs and chords
		outputText.setFont(noteFont);
		outputText.setEditable(false);
		outputText.setLineWrap(true);
		outputPanel.add(outputText);
		
		outputText2 = new JTextArea();
		outputText2.setFont(noteFont);
		outputText2.setEditable(false);
		outputText2.setLineWrap(true);
		outputPanel2.add(outputText2);
		
		outputPanel.setAlignmentX(Component.TOP_ALIGNMENT);
		mainPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		dispButtonPanel.add(outputPanel);	// Groups together all appropriate panel into a parent panel
		dispButtonPanel.add(buttonPanel3);
		
		dispButtonPanel2.add(outputPanel2);
		dispButtonPanel2.add(buttonPanel4);
		
		mainPanel.add(buttonPanel);	// Adds all of these onto another parent panel
		mainPanel.add(Box.createRigidArea(size));
		mainPanel.add(buttonPanel2);
		mainPanel.add(Box.createRigidArea(size));
		mainPanel.add(dispButtonPanel);
		mainPanel.add(Box.createRigidArea(size));
		mainPanel.add(dispButtonPanel2);
		mainPanel.add(Box.createRigidArea(size));
		mainPanel.add(buttonPanel5);
		mainPanel.add(Box.createRigidArea(size));
		mainPanel.add(buttonPanel6);
		
		outerPanel.add(titlePanel);	// Adds them to a final parent panel
		outerPanel.add(labelPanel);
		outerPanel.add(mainPanel);
		
		contentPane.add(outerPanel);	// Adds all the content to the contentPane
		contentPane.setPreferredSize(windowSize);	// Ensures window is sized correctly on launch
		
		
		// The following event listeners correspond to each button. Buttons "button"-"button8" and "add"-"add8" are for the song creator.
		// Buttons "button9"-"button16" and "add9"-"add16" are for the chord creator.
		// "play", "deletePrevious", and "reset" correspond to the song creator
		// "play2", "deletePrevious2", and "reset2" correspond to the chord creator
		
		// Each category of function calls one or more of the following methods:
		// playSound(), playChordSound(), addSound(), addChordSound(), removeSound(), removeChordSound(),
		// eraseSond(), eraseChord(), removeOutput(), removeChordOutput()
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(lowA);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(B);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(C);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(D);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(E);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(F);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(G);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(highA);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playSound(silence);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(lowA);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(B);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(C);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(D);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(E);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(F);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(G);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		button16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					playChordSound(highA);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		add.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(lowA, "  A  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(B, "  B  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(C, "  C#  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		add3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(D, "  D  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		add4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(E, "  E  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		add5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(F, "  F#  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		add6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(G, "  G#  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		add7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(highA, "  A  ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addSound(silence, " -- ", outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(lowA, "  A  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(B, "  B  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(C, "  C#  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(D, "  D  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(E, "  E  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(F, "  F#  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(G, "  G#  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		add16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					addChordSound(highA, "  A  ", outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		play.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					for (int j = 0; j < song.size(); j++) {
						playSound(song.get(j).toString());
						TimeUnit.MILLISECONDS.sleep(500);
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		play2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					for (int f = 0; f < chord.size(); f++) {
						playChordSound(chord.get(f).toString());
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		deletePrevious.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					removeSound();
					removeOutput(outputText);
					outputPanel.revalidate();
				} catch (Exception e) {
					System.out.println("User attemped to delete previous when song was empty!");
				}
			}
		});
		
		deletePrevious2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					removeChordSound();
					removeChordOutput(outputText2);
					outputPanel2.revalidate();
				} catch (Exception e) {
					System.out.println("User attemped to delete previous when chord was empty!");
				}
			}
		});
		
		reset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					eraseSong(outputText);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		reset2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				try {
					eraseChord(outputText2);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

		
	}
	
	private static void createAndShowGui() {	// Creates the JFrame for all the components
		JFrame frame = new JFrame("Music Creator");
		MusicCreator init = new MusicCreator();
		
		init.populateContentPane(frame.getContentPane());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public void playSound(String string) throws Exception {	   // Takes in string containing file location for clip play back
		AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(string).getAbsoluteFile());
		Clip clip = AudioSystem.getClip();
		clip.open(audioInputStream);
		clip.start();
		
	}
	
	public void playChordSound(String string) throws Exception {	// Takes in string containing file location for clip play back
		AudioInputStream audioInputStream2 = AudioSystem.getAudioInputStream(new File(string).getAbsoluteFile());
		Clip clip2 = AudioSystem.getClip();
		clip2.open(audioInputStream2);
		clip2.start();
		
	}
	
	public void addSound(String string, String name, JTextArea output) throws Exception{	// Adds actual sound file location to the ArrayList "song"
		File note = new File(string);														// and adds visual component to ArrayList "printOut"
		playSound(string);
		printOut.add(name);
		output.append(name);
		output.revalidate();
		song.add(note);
	}
	
	public void addChordSound(String string, String name, JTextArea output) throws Exception {	// Adds actual sound file location to the ArrayList "chord"
		File note = new File(string);														// and adds visual component to ArrayList "printOut2"
		playSound(string);
		printOut2.add(name);
		output.append(name);
		output.revalidate();
		chord.add(note);
	}
	
	public void removeSound() {	// Removes most recent sound file location from the ArrayList "song"
		song.remove(song.size() - 1);
	}
	
	public void removeChordSound() {	// Removes most recent sound file location from the ArrayList "chord"
		chord.remove(chord.size() -1);
	}
	
	public void eraseSong(JTextArea output) {	// Clears all entries in "song" and wipes visual output
		song.clear();
		printOut.clear();
		output.setText("");
		output.revalidate();
		
	}
	
	public void eraseChord(JTextArea output) {	// Clears all entries in "chord" and wipes visual output
		chord.clear();
		printOut2.clear();
		output.setText("");
		output.revalidate();
	}
	
	public void removeOutput(JTextArea output) {	// Removes the previous element from "printOut" to update visual output
		printOut.remove(printOut.size() -1);
		output.setText("");
		for (int h = 0; h < printOut.size(); h++) {
			output.append(printOut.get(h));
		}
		output.revalidate();
	}
	
	public void removeChordOutput(JTextArea output) {	// Removes the previous element from "printOut2" to update visual output
		printOut2.remove(printOut2.size() -1);
		output.setText("");
			for (int p = 0; p < printOut2.size(); p++) {
				output.append(printOut2.get(p));
		}
		output.revalidate();
	}

	public static void main(String[] args) {	// Main method that starts the GUI by calling the createAndShowGui() method
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGui();
            }
        });
    }
}


