package week1.day3;

import java.util.Iterator;

public class LearnStringMethod {

	public static void main(String[] args) {
		String name = "Welcome to testLeaf";
		int length = name.length();
		System.out.println("total character present in the string:"+length);
		String value = "TeatLeaf";
		String data = new String("TestLeaf");
		if (value.equals(data)) {
			System.out.println("it equals()");
			
		}else {
			System.out.println("Its not equals");
		}
String a ="Selenium";
String b ="sElenium";
if (a.equalsIgnoreCase(b)) {
	System.out.println("value equal");
	
}else {
	System.out.println("Value is not equal");
}
boolean contains = a.contains("Se");
System.out.println(contains);
char charAt = a.charAt(4);
System.out.println(charAt);

String var = "WebDriver";

char[] ch = var.toCharArray();

for (int i = 0; i < var.length(); i++) {
	System.out.print(ch[i]);
}
}

}
