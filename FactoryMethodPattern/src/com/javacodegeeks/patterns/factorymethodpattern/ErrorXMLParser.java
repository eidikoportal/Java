package com.javacodegeeks.patterns.factorymethodpattern;

public class ErrorXMLParser implements XMLParser{

	public ErrorXMLParser() {
		System.out.println("ErrorXMLParser");
	}
	@Override
	public String parse() {
		System.out.println("Parsing error XML...");
		return "Error XML Message";
	}

}
