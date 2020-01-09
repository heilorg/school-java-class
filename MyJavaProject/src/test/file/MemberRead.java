package test.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MemberRead {
	public static void main(String[] args) throws IOException {
		File file = new File("member.txt");
		ObjectInputStream ois= new ObjectInputStream(new FileInputStream(file));
		try {
			Member member = (Member)ois.readObject();
			System.out.println(member.getId());
			System.out.println(member.getName());
			System.out.println(member.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
		ois.close();
	}
}
