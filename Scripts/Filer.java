package Scripts;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Filer {
	public static void writeToFile(String filename, String data) {
		File file = new File(filename);
		
		try {
			if (!file.exists())
				file.createNewFile();
			
			FileWriter fWriter = new FileWriter(file, true);
			BufferedWriter buffer = new BufferedWriter(fWriter);
			
			buffer.write(data + "\n");
			
			buffer.close();
			fWriter.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static List<String> readFile(String filename) {
		File file = new File(filename);
		List<String> dataLines = new ArrayList<String>();
		
		try {
			if (!file.exists()) return null;
			
			FileReader fReader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(fReader);
			
			String line;
			while ((line = buffer.readLine()) != null) {
				dataLines.add(line);
			}
			
			buffer.close();
			fReader.close();
			
			return dataLines;
		}
		catch(IOException e) {
			e.printStackTrace();
			return null;
		}
	}
}