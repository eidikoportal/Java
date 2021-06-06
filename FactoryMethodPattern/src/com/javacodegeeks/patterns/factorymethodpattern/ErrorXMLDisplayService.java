package com.javacodegeeks.patterns.factorymethodpattern;

public class ErrorXMLDisplayService extends DisplayService{

	public ErrorXMLDisplayService() {
		System.out.println("ErrorXMLDisplayService");
	}
	@Override
	public XMLParser getParser() {
		return new ErrorXMLParser();
	}

}
