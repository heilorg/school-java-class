package test.String;

public class StringTest {
	public static void main(String[] args) {
		String str1 = "hello"; // "hello" �� ��� ���ڿ��� ��������� �������� �ʱ� ������ "hello"�� ����Ű�� ������ �����͸� ������ �ִ� 
		String str2 = "hello";
		
		if(str1.equals(str2)) {
			System.out.println("equals");
		}
		
		if(str1 == str2) {
			System.out.println("==");
		}
		
		String str3 = new String("hello");
		if(str1.equals(str3)) {
			System.out.println("equals");
		}
		
		if(str1 == str3) {
			System.out.println("==");
		}
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
		
		str1 = str2 + " World!";
		str3 = str3 + " World!";
		
		System.out.println("str1 : " + str1);
		System.out.println("str2 : " + str2);
		System.out.println("str3 : " + str3);
	}
}