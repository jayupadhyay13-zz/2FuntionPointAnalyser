package com.fpa.view;

import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EditProcess {

	public JFrame frame;
	private JTextField BoxProcessName;
	private JTextField BoxNoFTRs;
	private JTextField BoxDETs;

	/**
	 * Create the application.
	 */
	public EditProcess() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("FPA - Edit Process");
		frame.setResizable(false);
		frame.setBounds(100, 100, 570, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton DetailsButton = new JButton("Details");
		
		JButton CommentDescription = new JButton("Comments/Description");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "  Edit Process", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JButton btnNewButton_2 = new JButton("Apply");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	addDataToParentWindow();
			}
		});
		
		JButton btnNewButton_3 = new JButton("Ok");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		
		JButton btnNewButton_4 = new JButton("Cancel");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(168)
							.addComponent(DetailsButton)
							.addGap(6)
							.addComponent(CommentDescription))
						.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
							.addGap(206)
							.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton_4, GroupLayout.PREFERRED_SIZE, 83, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(71, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(33, Short.MAX_VALUE)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 486, GroupLayout.PREFERRED_SIZE)
					.addGap(45))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(DetailsButton)
						.addComponent(CommentDescription))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 225, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_4)
						.addComponent(btnNewButton_3)
						.addComponent(btnNewButton_2))
					.addGap(32))
		);
		
		JLabel lblNewLabel = new JLabel("Process Name:");
		
		BoxProcessName = new JTextField();
		BoxProcessName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Process Groups:");
		
		JComboBox comboBoxProcessGroups = new JComboBox();
		comboBoxProcessGroups.setModel(new DefaultComboBoxModel(new String[] {"", "App Startup/Shoutdown"}));
		
		JLabel lblNewLabel_2 = new JLabel("Process Type:");
		
		JComboBox comboBoxProcessType = new JComboBox();
		comboBoxProcessType.setModel(new DefaultComboBoxModel(new String[] {"", "EI", "EQ"}));
		
		JLabel lblNewLabel_3 = new JLabel("No. FTRs:");
		
		BoxNoFTRs = new JTextField();
		BoxNoFTRs.setColumns(10);
		
		JButton FTRsButton = new JButton("FTRs ...");
		
		JLabel lblNewLabel_4 = new JLabel("No. DETs:");
		
		BoxDETs = new JTextField();
		BoxDETs.setColumns(10);
		
		JButton DETsButton = new JButton("DETs ...");
		
		JLabel lblNewLabel_5 = new JLabel("Complexity:");
		
		JComboBox comboBoxComplexity = new JComboBox();
		comboBoxComplexity.setModel(new DefaultComboBoxModel(new String[] {"","LOW","AVERAGE", "HIGH"}));
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup()
									.addGap(6)
									.addComponent(lblNewLabel))
								.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblNewLabel_1)
									.addComponent(lblNewLabel_2)
									.addComponent(lblNewLabel_3)
									.addComponent(lblNewLabel_4)))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addComponent(lblNewLabel_5))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
								.addComponent(comboBoxComplexity, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(BoxDETs)
								.addComponent(BoxNoFTRs)
								.addComponent(comboBoxProcessType, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(FTRsButton)
								.addComponent(DETsButton)))
						.addComponent(comboBoxProcessGroups, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE)
						.addComponent(BoxProcessName, GroupLayout.PREFERRED_SIZE, 355, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BoxProcessName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_1)
						.addComponent(comboBoxProcessGroups, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxProcessType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_2))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_3)
						.addComponent(BoxNoFTRs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(FTRsButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_4)
						.addComponent(BoxDETs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(DETsButton))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxComplexity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_5))
					.addContainerGap(35, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);	
	}
}
