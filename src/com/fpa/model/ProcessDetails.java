package com.fpa.model;

import java.util.ArrayList;

/**
 *    Model Class for Function Point Analyzer
 */

public class ProcessDetails {

	String processName;
	String processType;
	String processGroup;
	String complexity;
	String noOfFTRs;
	String noOfDETs;
	
	public ProcessDetails(){}
	public ProcessDetails(String processName, String processType,
			String processGroup, String noOfFTRs, String noOfDETs, String complexity) {
		super();
		this.processName = processName;
		this.processType = processType;
		this.processGroup = processGroup;
		this.complexity = complexity;
		this.noOfFTRs = noOfFTRs;
		this.noOfDETs = noOfDETs;
	}
	public String getProcessName() {
		return processName;
	}
	public void setProcessName(String processName) {
		this.processName = processName;
	}
	public String getProcessType() {
		return processType;
	}
	public void setProcessType(String processType) {
		this.processType = processType;
	}
	public String getProcessGroup() {
		return processGroup;
	}
	public void setProcessGroup(String processGroup) {
		this.processGroup = processGroup;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public String getNoOfFTRs() {
		return noOfFTRs;
	}
	public void setNoOfFTRs(String noOfFTRs) {
		this.noOfFTRs = noOfFTRs;
	}
	public String getNoOfDETs() {
		return noOfDETs;
	}
	public void setNoOfDETs(String noOfDETs) {
		this.noOfDETs = noOfDETs;
	}
	
	public ArrayList<ProcessDetails>   getData(){
      
		ArrayList<ProcessDetails> array=new ArrayList<ProcessDetails>();
        array.add(new ProcessDetails("User - Add", "EI",null, "3", "6", "HIGH"));
		array.add(new ProcessDetails("User - Delete", "EI",null, "2", "7", "AVERAGE"));
		array.add(new ProcessDetails("User - Edit", "EI",null, "2", "8", "AVERAGE"));
		array.add(new ProcessDetails("User - List", "EQ",null,"2", "8", "AVERAGE"));
		array.add(new ProcessDetails("User - Reactive", "EI",null, "2", "8", "AVERAGE"));
		array.add(new ProcessDetails("Group - Add", "EI", null,"2", "4", "LOW"));
		array.add(new ProcessDetails("Group - Delete", "EI",null, "2", "4", "LOW"));
		array.add(new ProcessDetails("Group - Edit", "EI",null, "2", "4", "LOW"));
		array.add(new ProcessDetails("Group - List", "EQ", null,"2", "3", "LOW"));
		array.add(new ProcessDetails("Become Administrator", "EQ",null, "1", "2", "LOW"));
		array.add(new ProcessDetails("Disable Security", "EI", null,"1", "1", "LOW"));
		array.add(new ProcessDetails("Enable Security", "EI", null,"1", "1", "LOW"));
		array.add(new ProcessDetails("Job - Clear Lock", "EI",null, "2", "9", "AVERAGE"));
		array.add(new ProcessDetails("Job - Clone", "EI",null, "3", "9", "HIGH"));
		array.add(new ProcessDetails("Job - Delete", "EI",null, "2", "9", "AVERAGE"));
		array.add(new ProcessDetails("Job - Edit", "EI",null, "2", "9", "AVERAGE"));
		array.add(new ProcessDetails("Job - List", "EQ",null, "2", "9", "AVERAGE"));
		return array;
	}
}
