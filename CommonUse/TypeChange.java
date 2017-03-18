public class TypeChange
{
	public static void main(String[] args)
	{
		String intStr="123";
		//Converts a specific string into a int variable
		int it1=Integer.parseInt(intStr);
		int it2=new Integer(intStr);
		//Output the result
		System.out.println("it1"+"="+it1+","+"it2"+"="+it2);
		String floatStr="4.56";
		//Converts a specific string into a float variable
		float ft1=Float.parseFloat(floatStr);
		float ft2=new Float(floatStr);
		//Output the ft
		System.out.println("ft1"+"="+ft1+","+"ft2"+"="+ft2);
		//Converts a float variable into a String variable
		String ftStr=String.valueOf(2.345f);
		//Output the ftStr
		System.out.println("ftStr="+ftStr);
		//Converts a double variable into a String variable
		String dbStr=String.valueOf(3.344);
		//Output the dbStr
		System.out.println("dbStr="+dbStr);
		//Converts a boolean variable into a String variable
		String boolStr=String.valueOf(true);
		//Output boolStr
		System.out.println("boolStr="+boolStr.toUpperCase()+"str.toLowerCase()="+boolStr.toLowerCase());
		
	}
}