package DataDrivenTest;

import com.readerUtility.Xls_Reader;

public class CostList {

	public static void main(String[] args) {
	Xls_Reader reader = new Xls_Reader("/Users/moamin/eclipse-workspace/DataDriven/src/test/java/com/testData/costList.xlsx");
		String companyName2 = reader.getCellData("CostList", "company", 2);
		String companyName3 = reader.getCellData("CostList", "company", 3);
		String companyName4 = reader.getCellData("CostList", "company", 4);
		String companyName5 = reader.getCellData("CostList", "company", 5);
		String companyName6 = reader.getCellData("CostList", "company", 6);
		String companyName7 = reader.getCellData("CostList", "company", 7);
		String companyName8 = reader.getCellData("CostList", "company", 8);
		String companyName9 = reader.getCellData("CostList", "company", 9);


	System.out.println(companyName2 +", " +companyName3+", " + companyName4+ ", " + companyName5+ ", "  + companyName6+" ,"+ companyName7+", "+ companyName8 + ", "+ companyName9 );

	}
}
