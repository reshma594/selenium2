package generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel implements FrameworkConstants{
	
	//public static File f=new File("excelpath");
	
	//public static void main(String[] args) throws IOException {
	//	getmultipledata("sheet1");
//	}
	public static Object[][] getmultipledata(String sheetname) throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\reshm\\eclipse-workspace\\selenium1\\src\\test\\resources\\Exceldata\\data1.xlsx");
        Workbook wb= WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet s = wb.getSheet(sheetname);
		int rowsize=s.getPhysicalNumberOfRows();
		int columnsize=s.getRow(0).getPhysicalNumberOfCells();
		Object[][] data=new Object[rowsize][columnsize];
		for(int i=0;i<rowsize;i++)
		{
			  for(int j=0;j<columnsize;j++)
	            {
				  data[i][j]=wb.getSheet(sheetname).getRow(i).getCell(j).toString();
	         
		}
		
		
	}
		return data;
	}


}

