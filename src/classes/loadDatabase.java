package classes;

import java.io.File;

import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class loadDatabase {
	/*define file path*/
	private String inputFile = "database/database.xls";
	/*define file sheet struct*/
	private prescription AllData[] = new prescription[5];
	
	public class prescription{
		public String TimeMinute;
		public String TimeHours;

		public prescription() {
			TimeMinute="";
			TimeHours="";
		}
		
	};
		
	
	public loadDatabase() throws IOException {
		
		
		
		int i;
		for(i=0;i<5;i++) {
			AllData[i]= new prescription();
		}
		
		File inputWorkbook = new File(inputFile);
        Workbook w;
        try 
        {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet("Cassetto1");

            AllData[0].TimeHours=sheet.getCell(1, 0).getContents();
            AllData[0].TimeMinute=sheet.getCell(2, 0).getContents();
            
            sheet = w.getSheet("Cassetto2");

            AllData[1].TimeHours=sheet.getCell(1, 0).getContents();
            AllData[1].TimeMinute=sheet.getCell(2, 0).getContents();
            
            sheet = w.getSheet("Cassetto3");

            AllData[2].TimeHours=sheet.getCell(1, 0).getContents();
            AllData[2].TimeMinute=sheet.getCell(2, 0).getContents();
            
            
            sheet = w.getSheet("Cassetto4");

            AllData[3].TimeHours=sheet.getCell(1, 0).getContents();
            AllData[3].TimeMinute=sheet.getCell(2, 0).getContents();
            
            sheet = w.getSheet("Cassetto5");

            AllData[4].TimeHours=sheet.getCell(1, 0).getContents();
            AllData[4].TimeMinute=sheet.getCell(2, 0).getContents();
            
        } 
        catch (BiffException e) 
        {
            e.printStackTrace();
        }
	}
	
	public prescription getPrescription(int numCassetto) {
		return AllData[numCassetto-1];
		
	}

}
