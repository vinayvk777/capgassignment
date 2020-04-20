package com.example.labB;

import org.springframework.stereotype.Component;

@Component
public class SBU {
 private int sbuID;
 private String sbName;
 private String sbHead;
public int getSbuID() {
	return sbuID;
}
public void setSbuID(int sbuID) {
	this.sbuID = sbuID;
}
public String getSbName() {
	return sbName;
}
public void setSbName(String sbName) {
	this.sbName = sbName;
}
public String getSbHead() {
	return sbHead;
}
public void setSbHead(String sbHead) {
	this.sbHead = sbHead;
}
@Override
public String toString() {
	return "SBU [sbuID=" + sbuID + ", sbName=" + sbName + ", sbHead=" + sbHead + "]";
}


 public void compile()
 {
	 System.out.println("sbu Detail"+"="+"SBU"+"["+"sbuCode=PES-BU"+" "+"sbuHead"+"="+"Kiran Rao"+" "+"sbuName"+"="+"Product Engineering Services"+"]");
 }
}
