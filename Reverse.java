package Collection;

import java.util.Iterator;

public class Reverse {
	public static void main(String[] args) {
		String name = "hello", reversename = "";
		for (int i = name.length() - 1; i >= 0; i--) {
			char charAt = name.charAt(i);
			//reversename = reversename.concat(String.valueOf(charAt));
			//reversename = reversename.concat(charAt);
			//reversename = reversename+charAt;
		}
		System.out.println(reversename);
	}

}
