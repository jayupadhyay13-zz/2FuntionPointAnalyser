package com.fpa.view;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *    View class for Function Point Analyzer
 */

public class ProcessPage extends AddProcess{

	public JFrame frame;
	public JTable MainTable;

	/**
	 * Create the application.
	 */
	public ProcessPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("FPA - Home Page");
		frame.setBounds(100, 100, 823, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(85, 89, 638, 297);
		frame.getContentPane().add(scrollPane);
		
		MainTable = new JTable();
//		MainTable.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				
//				
//				
//				
//
//				
//				try{
//					
//					int row = MainTable.getSelectedRow();
//					String data1 = (MainTable.getModel().getValueAt(row, 0).toString());
//					BoxProcessName.setText(data1);
//					String data2 = (MainTable.getModel().getValueAt(row, 0).toString());
//					comboBoxProcessGroups.setSelectedItem(data2);
//					
//					
//					
////					 String item = box.getEditor().getItem().toString();
////
////					   box.getEditor().setItem("Text Has Changed");
//					
//					
//					
//				}
//				catch(Exception ee){
//					JOptionPane.showMessageDialog(null,e);
//				}
//				
//				
//				
//				
//				
//			}
//		});

		MainTable.setModel(new DefaultTableModel(
			new Object[][] {			},
			new String[] {
				"Process Name", "Process Type", "# FTRs", "# DETs", "Complexity"
			}
		));
		MainTable.getColumnModel().getColumn(0).setPreferredWidth(145);
		MainTable.getColumnModel().getColumn(1).setPreferredWidth(130);
		MainTable.getColumnModel().getColumn(2).setPreferredWidth(86);
		scrollPane.setViewportView(MainTable);
		
		JButton AddProcessButton = new JButton("Add Process");
		AddProcessButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel tableModel=(DefaultTableModel)MainTable.getModel();
				AddProcess processModel=new AddProcess(tableModel);
				processModel.frame.setVisible(true);
			}
		});
		AddProcessButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		AddProcessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		AddProcessButton.setBounds(266, 397, 110, 23);
		frame.getContentPane().add(AddProcessButton);
		
		JButton CloneProcessButton = new JButton("Clone Process");
		CloneProcessButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to Clone Selected Process?");
				if(ret == JOptionPane.YES_OPTION){
					CopyDataToParentWindow();
				//	System.exit(0);
				}
			}

			private void CopyDataToParentWindow() {
				
				int selectedRow = MainTable.getSelectedRow();
				int noOfRows = MainTable.getRowCount();
				if(selectedRow != -1){
					DefaultTableModel model = ((DefaultTableModel)MainTable.getModel());
					model.addRow(new Object[]{
							model.getValueAt(selectedRow, 0),
							model.getValueAt(selectedRow, 1),
							model.getValueAt(selectedRow, 2),
							model.getValueAt(selectedRow, 3),
							model.getValueAt(selectedRow, 4),						
					});
				}
				
				
				
				
//				String noOfFTR=BoxFTRs.getText();
//				String processName=BoxProcessName.getText();
//				String noOfDETs=BoxDETs.getText();
//			 	String processGrp=(String)comboBoxProcessGroups.getSelectedItem();
//				String processType=(String)comboBoxProcessType.getSelectedItem();
//				String complexity=(String)comboBoxComplexity.getSelectedItem();
//				
//				
//				String[] data = new String[6];
//
//				data[0] = processName; 
//				data[1] = processType;	
//				data[2] = noOfFTR;    
//				data[3] = noOfDETs;   
//				data[4] = complexity; 
//				data[5] = processGrp;
//
//				tableModel.addRow(data);
//				tableModel.fireTableDataChanged();
			}
		});
	
		CloneProcessButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		CloneProcessButton.setBounds(386, 397, 131, 23);
		frame.getContentPane().add(CloneProcessButton);
		
		JButton EditHomeButton = new JButton("Edit");
		EditHomeButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EditProcess editprocess = new EditProcess();
				editprocess.frame.setVisible(true);
				
				try{
					int i = MainTable.getSelectedRow();
					TableModel tm= MainTable.getModel();
					BoxProcessName.setText(tm.getValueAt(i, 0).toString());
					comboBoxProcessGroups.setSelectedItem(tm.getValueAt(i, 1).toString());
					
					
					
					
					
				}
				catch(Exception eee){
					System.out.println("not working");
				}
				
			}
		});
		
		
		
		
		
//		EditHomeButton.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//
//				try{
//					int i = MainTable.getSelectedRow();
//					TableModel tm= MainTable.getModel();
//					BoxProcessName.setText(tm.getValueAt(i, 0).toString());
//					comboBoxProcessGroups.setSelectedItem(tm.getValueAt(i, 1).toString());
//					
//					
//					
//					
//					
//				}
//				catch(Exception eee){
//					System.out.println("not working");
//				}
//				
//			
//				
//				
//				
//				
//				
//				//				EditProcess editPage=new EditProcess();
////				editPage.frame.setVisible(true);
////				
////				TableModel model = MainTable.getModel();
////				int[] indexs = MainTable.getSelectedRows();
////				Object[] row = new Object[5];
//
//			}
//		});
		EditHomeButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		EditHomeButton.setBounds(527, 397, 93, 23);
		frame.getContentPane().add(EditHomeButton);
		
		JButton DeleteButton = new JButton("Delete");
		DeleteButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				int[] rows = MainTable.getSelectedRows();
				TableModel tm= MainTable.getModel();

				while(rows.length>0)
				{
					((DefaultTableModel)tm).removeRow(MainTable.convertRowIndexToModel(rows[0]));

					rows = MainTable.getSelectedRows();
				}
				MainTable.clearSelection();
			}
		});
		DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		DeleteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		DeleteButton.setBounds(630, 397, 93, 23);
		frame.getContentPane().add(DeleteButton);
		
		JButton EntitiesButton = new JButton("Entities");
		EntitiesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Entities entities = new Entities();
				entities.frame.setVisible(true);
			}
		});
		EntitiesButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		EntitiesButton.setBounds(99, 32, 137, 44);
		frame.getContentPane().add(EntitiesButton);
		
		JButton ProcessGroupButton = new JButton("Process Groups");
		ProcessGroupButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ProcessGroups processGroups = new ProcessGroups();
				processGroups.frame.setVisible(true);
			}
		});
		ProcessGroupButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ProcessGroupButton.setBounds(257, 32, 145, 44);
		frame.getContentPane().add(ProcessGroupButton);
		
		JButton ProcessesButton = new JButton("Processes");
		ProcessesButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Processes processes = new Processes();
				processes.frame.setVisible(true);
				
			}
		});
		ProcessesButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ProcessesButton.setBounds(427, 32, 131, 44);
		frame.getContentPane().add(ProcessesButton);
		
		JButton ReportsButton = new JButton("Reports");
		ReportsButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Reports reports = new Reports();
				reports.frame.setVisible(true);
			}
		});

		ReportsButton.setFont(new Font("Tahoma", Font.BOLD, 13));
		ReportsButton.setBounds(579, 32, 125, 44);
		frame.getContentPane().add(ReportsButton);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu FileMenuBar = new JMenu("File");
		menuBar.add(FileMenuBar);
		
		JMenuItem ExitMenuItem = new JMenuItem("Exit");
		ExitMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ret = JOptionPane.showConfirmDialog(null, "Are you sure you want to Exit?");
				if(ret == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		FileMenuBar.add(ExitMenuItem);
		
		JMenu ToolsMenuBar = new JMenu("Tools");
		menuBar.add(ToolsMenuBar);
		
		JMenuItem OptionsMenuItem = new JMenuItem("Options");
		OptionsMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Options option = new Options();
				option.setVisible(true);
			}
		});
		ToolsMenuBar.add(OptionsMenuItem);
		
		JMenu HelpMenuBar = new JMenu("Help");
		menuBar.add(HelpMenuBar);
		
		JMenuItem HelpMenuItem = new JMenuItem("About");
		HelpMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About about = new About();
				about.setVisible(true);
			}
		});
		HelpMenuBar.add(HelpMenuItem);
		
	}
	public class table extends JFrame{
		JTable table;
		 private JTextField textFieldToHide;

		 public void hideTextField(){
		        textFieldToHide.setVisible(false);
		 }
		
		 public table(){
			setLayout(new FlowLayout());
			
			String[] columnNames = {};
		}
	}
}