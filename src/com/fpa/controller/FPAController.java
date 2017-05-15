package com.fpa.controller;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

import com.fpa.model.ProcessDetails;
import com.fpa.view.ProcessPage;

/**
 *     Controller class for Function Point Analyzer
 */

public class FPAController {
	private ProcessPage view;

	public FPAController(ProcessDetails model, ProcessPage view){
		this.view = view;
		setRowsValue(view,model);
	}

	public void contol(){        
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
private void setRowsValue(ProcessPage view,ProcessDetails model){
		
		DefaultTableModel tableModel=(DefaultTableModel)view.MainTable.getModel();
		ArrayList<ProcessDetails> dataList = model.getData();
		int size=dataList.size();
		for (int i = 0; i < size; i++) {
			String[] data = new String[6];

			data[0] = dataList.get(i).getProcessName();
			data[1] = dataList.get(i).getProcessType();
			data[2] = dataList.get(i).getNoOfFTRs();
			data[3] = dataList.get(i).getNoOfDETs();
			data[4] = dataList.get(i).getComplexity();

			tableModel.addRow(data);
			tableModel.fireTableDataChanged();
		}
		view.MainTable.setModel(tableModel);
	}
}
