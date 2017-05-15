package com.fpa.main;

import javax.swing.UIManager;

import com.fpa.controller.FPAController;
import com.fpa.model.ProcessDetails;
import com.fpa.view.ProcessPage;

/**  
 *    Main Class for Function Point Analyzer
 */

public class FPAMainClass {
	 private static  ProcessDetails model;
	 private static ProcessPage view;
	 public static void main(String[] args) {  
		 try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Throwable e) {
				e.printStackTrace();
			}
		 model=new ProcessDetails();
		 view=new ProcessPage();
		 FPAController controller =new FPAController(model,view);
		 controller.contol();
	    }
}