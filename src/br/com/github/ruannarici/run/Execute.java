package br.com.github.ruannarici.run;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

import br.com.github.ruannarici.model.Logic;

public class Execute {

	public static void main(String[] args) throws IOException {
		
//		FileOutputStream fos = new FileOutputStream("history.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		BufferedWriter bw = new BufferedWriter(osw);
		
		Logic base = new Logic();
		base.showBase();
		base.getNumbers();
		System.out.println("Result: " + base.executeOperation());
		
//		//Save
//		bw.write("Developed by @RuanNarici ");
//		bw.newLine();
//		bw.write("Result: " + base.executeOperation());
//		bw.close();
	}
	
}
