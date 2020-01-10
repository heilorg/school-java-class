package test.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileTest {
	public static void main(String[] args) {
		String fileName = "FileTest.txt";
		
		File f;
		try {
			f = new File(fileName);
			FileWriter fileWriter = new FileWriter(f);
			BufferedWriter writer = new BufferedWriter(fileWriter);
			writer.write("수원");
			writer.append("\n");
			writer.append("정보");
			writer.newLine();
			writer.write("과학고");
			writer.close();
			fileWriter.close();
			
			FileReader fileReader = new FileReader(f);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
