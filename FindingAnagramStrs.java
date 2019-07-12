
public class FindingAnagramStrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "silent";
		String s2 = "listen";

		int s1Len = s1.length();
		int s2Len = s2.length();

		String hLenStr = null;
		String lLenStr = null;
		
		boolean status=true;
		
		if(s1.length()!=s2.length())
		{
			status=false;
		}

		boolean notAvailableChar = true;


		for (int i = 0; i < hLenStr.length(); i++) {
			for (int j = 0; j < lLenStr.length(); j++) {

				if (s1.charAt(i) == s2.charAt(j))

				{
					break;
				}
								
			}
		}
		
		

	}

}
