package io_p;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class DataMemOutMain {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos = new FileOutputStream("fff/vfr.tbg");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeUTF("n_123.456");
		dos.writeUTF("b_true");
		dos.writeUTF("msg_�Ʊ���");
		dos.writeUTF("arr_10,20,30,40");

		dos.close();
		fos.close();
	}

}
