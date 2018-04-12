package com.ge.parser;

public class PunchListImageReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args == null || args.length == 0) {
			System.out.println("Please enter valid image name.");
			return;
		}
		System.out.println(ImageReader.crackImage(args[0]));
	}

}
