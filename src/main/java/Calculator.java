
public class Calculator {

	public static int add(String num) {
		int add = 0;
		if(num != null && num.length()==0)
			return 0;
		else if(num.length()>0) {
			String[] arrayNums	= num.split("\\n|,");
			for(int i=0;i<arrayNums.length;i++) {
				add = add+Integer.parseInt(arrayNums[i]);
			}
			
		}
		return add;
			
	}

}
