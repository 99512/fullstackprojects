package com.example.demo.service.impl;

import java.io.*;

public class FileUploda {

	public static void tofile(byte[] data, File destination) {
		try (FileOutputStream fos = new FileOutputStream(destination)) {
			fos.write(data);
			fos.close();
		} catch (Exception e) {
			System.out.println("this is so importement");
		}
	}

	public static void main(String args[]) {
		String sometext = "this project is importent for me me";
		System.out.println(sometext);
		byte[] data = sometext.getBytes();
		File destination = new File("test.tex");
		tofile(data, destination);
	}

}
