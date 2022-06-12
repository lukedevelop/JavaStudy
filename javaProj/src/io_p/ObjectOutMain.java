package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

class AAA implements Serializable{
	String name;
	int age;
	boolean marriage;

	public AAA(String name, int age, boolean marriage) {
		super();
		this.name = name;
		this.age = age;
		this.marriage = marriage;
	}

	@Override
	public String toString() {
		return "AAA [name=" + name + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
}

public class ObjectOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/obj.qaz");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		
		oos.writeBoolean(true);
		oos.write(123);
		oos.writeShort(321456);
		oos.writeInt(12365478);
		oos.writeLong(741258963L);
		oos.writeFloat(123.456F);
		oos.writeDouble(789.456);
		oos.writeUTF("�Ʊ���");
		
		String [] arr = {"������","������","������","����ȣ"};
		oos.writeObject(arr);
		ArrayList<Integer>arr2 = new ArrayList<Integer>();
		arr2.add(123);
		arr2.add(456);
		arr2.add(987456);
		oos.writeObject(arr2);
		
		oos.writeObject(new AAA("������", 28, false));
		
		oos.close();
		fos.close();

	}

}
