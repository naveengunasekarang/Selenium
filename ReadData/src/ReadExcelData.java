import Lib.ExcelDataConfig;

public class ReadExcelData {

	public static void main(String[] args) {
		ExcelDataConfig excel = new ExcelDataConfig("F:\\Training\\TestData.xlsx");
		String data_user=excel.getData(0,1,0);
		String data_pwd=excel.getData(1,1,1);
	}

}
