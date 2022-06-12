package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputMain {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("fff/wsx.cde");
		DataInputStream dis = new DataInputStream(fis);
		
		
		/*
		dos.writeBoolean(true);
		dos.writeChar('a');
		dos.writeByte(123);
		dos.writeShort(321456);
		dos.writeInt(789456);
		dos.writeLong(741258963L);
		dos.writeFloat(123.456F);
		dos.writeDouble(789.456);
		dos.writeUTF("송지은이 static 강의한다 홍홍홍");
		
		 * */
		
		// 위 주석에 있는 읽어 들여야 하는 순서가 같아야함  (만약 순서가 다를경우 이상하게 작동하고 순서가 같은곳에서 부터 오류없이 읽음)

		System.out.println(dis.readBoolean()); 
		System.out.println(dis.readChar());
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		dis.close();
		fis.close();
	}

}
