package romans;



public class ConvertNum {
	private static final int[] Values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1} ;	
	private static final String[] Symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	public static String arabicToRom(int arabic)
	{
		StringBuilder res = new StringBuilder();
		int remaining = arabic;
		for (int i=0; i < Values.length; i++)
		{
			remaining = makeRoman(remaining, Values[i], Symbols[i], res);
		}
//      found duplication here, make a loop! (old tdd code):
//		remaining = makeRoman(remaining, 9, "IX", res);
//		  remaining = makeRoman(remaining, 5, "V", res);
//		  remaining = makeRoman(remaining, 4, "IV", res);
//		for (int i=0; i<remaining;i++)
//		{
//			res.append("I");
//		}
//		
			return res.toString();

	}


	private static int makeRoman(int arabic, int value, String romDigits, StringBuilder res) {
		int result = arabic;
		while (result >= value) {
		    res.append(romDigits);
		    result -= value;
		  }
		  return result;
		}
	}
	

