package basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PmCounterNameModify {

	
	public static void readWriteFile(){
		File inputFile = new File("C:/Users/achaura/Desktop/PM_COUNTERS.txt");
		File opFile = new File("C:/Users/achaura/Desktop/OP3.txt");
		try {
			opFile.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			FileReader fileRd = new FileReader(inputFile);
			BufferedReader br = new BufferedReader(fileRd);
			FileWriter fw=null;
			BufferedWriter bw=null;
			try {
				fw = new FileWriter(opFile);
			    bw = new BufferedWriter(fw);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			String line1,line2,finalLine;
			try {
				
				while((line1=br.readLine())!= null){
/*				String counterName = line1.split(",")[0].trim();
				String midline = line1.split(",")[0].replaceAll("COUNTER_TYPE_", "").trim();
				String finalLine1 = "counterTypeMap.register("+counterName+", "+midline+");"	;
*/					
					
				String midline = line1.split(",")[0].replaceAll("COUNTER_TYPE_", "");
				line2 = midline.toLowerCase().replace("_", "-").trim();	
				finalLine = midline+"    "+"("+"\""+line2+"\""+"),";
				bw.write(finalLine);
				 bw.append(finalLine+"\n");
				System.out.println(finalLine);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		readWriteFile();
	}
	
}
