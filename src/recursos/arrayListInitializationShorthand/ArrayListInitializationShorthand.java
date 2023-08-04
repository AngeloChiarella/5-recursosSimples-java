package recursos.arrayListInitializationShorthand;

import java.util.ArrayList;

public class ArrayListInitializationShorthand {
	
	public static void main(String[] args) {
		ArrayList<String> languages = new ArrayList<String>() {{
			add("JS");
			add("Python");
			add("Java");
			add("C++");
		} };
		
		System.out.println(languages);
	}
}
