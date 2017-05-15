package com.fpa.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

public class AddProcess {

	public JFrame frame;
	public JTextField BoxProcessName;
	private JTextField BoxFTRs;
	private JTextField BoxDETs;
	private JComboBox comboBoxProcessType;
	public JComboBox comboBoxProcessGroups;
	private JComboBox comboBoxComplexity;
	DefaultTableModel tableModel;

	public AddProcess(){
		initialize();
	}
	
	/**
	 * Create the application.
	 */
	public AddProcess(DefaultTableModel tableModel) {
		this.tableModel=tableModel;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 572, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JButton ButtonDetails = new JButton("Details");
		ButtonDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton ButtonCommentsDescription = new JButton("Comments/Description");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Process", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnNewButton_2 = new JButton("Apply");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			//	 addDataToParentWindow();
			}
		});
		
		JButton btnOk = new JButton("Ok");
		btnOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				addDataToParentWindow();
				frame.dispose();
			}
		});
		
		JButton btnCalcel = new JButton("Cancel");
		btnCalcel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(172)
							.addComponent(ButtonDetails)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ButtonCommentsDescription))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(37)
							.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnOk, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnCalcel, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 475, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(44, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(27)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(ButtonDetails)
						.addComponent(ButtonCommentsDescription))
					.addGap(18)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 229, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCalcel)
						.addComponent(btnOk)
						.addComponent(btnNewButton_2))
					.addContainerGap(29, Short.MAX_VALUE))
		);
		
		JLabel lblProcessName = new JLabel("Process Name:");
		
		BoxProcessName = new JTextField();
		BoxProcessName.setColumns(10);
		
		JLabel lblProcessGroups = new JLabel("Process Groups:");
		
		comboBoxProcessGroups = new JComboBox();
		comboBoxProcessGroups.setModel(new DefaultComboBoxModel(new String[] {"", "App Startup/Shutdown"}));
		
		JLabel lblProcessType = new JLabel("Process Type:");
		
	    comboBoxProcessType = new JComboBox();
		comboBoxProcessType.setModel(new DefaultComboBoxModel(new String[] {"", "EI", "EQ"}));
		
		JLabel lblNewLabel = new JLabel("No. FTRs:");
		
		BoxFTRs = new JTextField();
		BoxFTRs.setColumns(10);
				BoxDETs = new JTextField();
		BoxDETs.setColumns(10);
		
		JButton ButtonFTRs = new JButton("FTRs ...");
		
		JButton ButtonDETs = new JButton("DETs ...");
		
		JLabel lblNewLabel_1 = new JLabel("Complexity:");
		
        comboBoxComplexity = new JComboBox();
		comboBoxComplexity.setModel(new DefaultComboBoxModel(new String[] {"", "LOW", "AVERAGE", "HIGH"}));
		
		JLabel lblNoDets = new JLabel("No. DETs:");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblProcessName)
						.addComponent(lblProcessGroups)
						.addComponent(lblNewLabel)
						.addComponent(lblProcessType)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNoDets))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(BoxProcessName, GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(BoxFTRs, Alignment.LEADING)
								.addComponent(comboBoxProcessType, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(comboBoxProcessGroups, Alignment.LEADING, 0, 172, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ButtonFTRs))
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING, false)
								.addComponent(comboBoxComplexity, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(BoxDETs, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(ButtonDETs)))
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(20)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblProcessName)
						.addComponent(BoxProcessName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxProcessGroups, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProcessGroups))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBoxProcessType, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblProcessType))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BoxFTRs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonFTRs)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(BoxDETs, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(ButtonDETs)
						.addComponent(lblNoDets))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(comboBoxComplexity, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(47, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void addDataToParentWindow() {
		
		String noOfFTR=BoxFTRs.getText();
		String processName=BoxProcessName.getText();
		String noOfDETs=BoxDETs.getText();
	 	String processGrp=(String)comboBoxProcessGroups.getSelectedItem();
		String processType=(String)comboBoxProcessType.getSelectedItem();
		String complexity=(String)comboBoxComplexity.getSelectedItem();
		
		
		String[] data = new String[6];

		data[0] = processName; 
		data[1] = processType;	
		data[2] = noOfFTR;    
		data[3] = noOfDETs;   
		data[4] = complexity; 
		data[5] = processGrp;

		tableModel.addRow(data);
		tableModel.fireTableDataChanged();
	}
}
