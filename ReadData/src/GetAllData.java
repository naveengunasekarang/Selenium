import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetAllData {

	public static void main(String[] args) throws IOException {
		File src = new File("F:\\Training\\TestData.xlsx"); // Get the source file
		FileInputStream fis = new FileInputStream(src); // Input form the file
		XSSFWorkbook wb = new XSSFWorkbook(fis); // Apache POI XSSFWorkBook class
		XSSFSheet Sheet1 = wb.getSheetAt(0);// Read the Sheet from WB
		int row_count = Sheet1.getLastRowNum(); // Getting rows
		System.out.println(row_count);
		for (int i = 0; i <= row_count; i++) {
			String TD = Sheet1.getRow(i).getCell(0).getStringCellValue();
//			System.out.println("Test Data:" + TD);4
			System.out.println("Data from Row"+i+"is"+TD);
		}

		wb.close();

	}

}
