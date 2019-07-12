import java.util.HashMap;

public class NoOfOccurances{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ssksudheereerkummmaraarrxyx";
		int count = 1;
		char[] ch = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			if (i == 0) {
				hm.put(ch[i], count);

			} else {
				if (hm.containsKey(ch[i])) {
					int x = hm.get(ch[i]);

					x++;

					hm.put(ch[i], x);
				} else
					hm.put(ch[i], count);

			}

		}

		System.out.println(hm);

	}

}
