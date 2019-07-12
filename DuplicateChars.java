import java.util.HashMap;

public class DuplicateChars {

	public static void main(String[] args) {

		String str="ssksudheereerkummmaraar";
		int count=1;
		char[] ch=str.toCharArray();
		
		
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = i+1; j < ch.length; j++) {
				if(ch[i]==ch[j]){
				count++;
				System.out.println(ch[j]);
				ch[j]=0;
				}
				   
			}
			if(count>=1&&ch[i]!=0){
				System.out.println(ch[i]+" "+count);
				count=0;
			}
		}
		

	}

}