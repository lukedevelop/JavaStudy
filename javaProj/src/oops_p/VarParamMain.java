package oops_p;

import java.util.Arrays;

class VarParam{
	
	//�����Ű������� ������ �����ε��� �޼ҵ��� ������ ���� ��ø�� ���
	// �Ű������� ������ ������� �޼ҵ带 ȣ��
	void meth_1(int a, int ...b) {
		System.out.println("meth_1 �����ε�():"+a+","+Arrays.toString(b));
	}
		
	void meth_1(int a, int b) {
		System.out.println("meth_1():"+a+","+b);
	}

	void meth_2(int a,int [] arr) {
		System.out.println("meth_2():"+a+","+Arrays.toString(arr));
	}
	
	void meth_3(int a,int ...arr) {
		// int ...arr : ���� �Ű����� (�迭�� ó��)
		// int [] arr
		// ���� �Ű����� : 1. �迭�� �迭��
		//             2. ���� ��ġ ������ ������ ��� �Ű������� �迭��
		//             3. �����Ű������� �Ű����� �� ���� �� �ڿ� ��ġ �ؾ� �Ѵ�.
		
		System.out.println("meth_3():"+a+","+Arrays.toString(arr));
	}
	
	void meth_4(int a,int [] arr, int b) {
		System.out.println("meth_3():"+a+","+b+","+Arrays.toString(arr));
	}
	
	/*  �����Ű������� �Ű����� �� ���� �� �ڿ� ��ġ �ؾ� �Ѵ�.
	void meth_5(int a,int ...arr, int b) {

		System.out.println("meth_5():"+a+","+b+","+Arrays.toString(arr));
	}*/
	void meth_6(int a, int b,int ...arr) {

		System.out.println("meth_6():"+a+","+b+","+Arrays.toString(arr));
	}
}

public class VarParamMain {

	public static void main(String[] args) {
		VarParam vp = new VarParam();
		vp.meth_1(10,20);
		vp.meth_1(10,20,30,40);
		vp.meth_1(10,20,30);
		vp.meth_1(10);
		//vp.meth_2(10,20);
		vp.meth_3(10,20);
		
		int [] nums = {111,222,333,444,555};
		int [] nums2 = {666,777,888};
		vp.meth_2(20,nums);
		vp.meth_3(20,nums);
		
		//vp.meth_2(30,123,234,345,456,678,789);
		vp.meth_3(30,123,234,345,456,678,789);
		// a= 30,   arr = {123,234,345,456,678,789}
		
		//vp.meth_3(30,nums, nums2);
		
		vp.meth_3(30,123,234);
		vp.meth_3(30,123);
		vp.meth_3(30);
		//vp.meth_3();
	}

}


