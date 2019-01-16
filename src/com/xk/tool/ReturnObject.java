package com.xk.tool;

public class ReturnObject {
	private String strDesc;
	private int iErrorcode;
	public ReturnObject(String strDesc, int errorCod) {
		this.strDesc = strDesc;
		this.iErrorcode = errorCod;
		if(iErrorcode<0) System.err.println(this.toString()); 
	};
	public boolean toBoolean() {
		return iErrorcode>0;
	}
	@Override
	public String toString() {
		return "Desc:"+strDesc+"------------------------------------ ErrorCode"+iErrorcode+"\r\n";
	}
	//???
	@Override
	protected void finalize(){
		if(iErrorcode<0) System.err.println(this.toString()); 
	};
}
