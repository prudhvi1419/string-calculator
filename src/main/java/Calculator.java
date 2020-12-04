
public class Calculator {

	public static int add(String num) {
		if(num != null && num.length()==0)
			return 0;
		else if(num.length()>0) {
			String[] arrayNums	= num.split(",");
			return Integer.parseInt(arrayNums[0])+Integer.parseInt(arrayNums[1]);
		}
		return 0;
			
	}

}
