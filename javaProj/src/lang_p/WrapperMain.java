package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
        int i = new Integer(1234);    //��� ���� ���� (�� ������ٴ� ��)
        
        System.out.println(i);
		
        Integer i2 = 5678;
        
        System.out.println(i2);
        
      // i = null; �⺻�ڷ����� null �� ����������
        i2 = null; //null �� ����
//        i = "12357";
//        i2 = "13570";
        i2 = new Integer("1357");  // "Integer" ���ڷε� ���ڸ� ������ �ٲ�
        System.out.println(i2);
        
//        i2 = new Integer("õ������ĥ"); ġȯ�Ҽ� ���� ���ڿ� �����߻� 
        i = Integer.parseInt("2468");   //���ڸ� 
        System.out.println(i);
        		
//        i = Integer.parseInt("��õ���������") ����Ҽ�����
        byte b = Byte.parseByte("127");
        System.out.println(b);
        
        short sh = Short.parseShort("127");
        System.out.println(sh);
        
        Long lo = Long.parseLong("45678");
        System.out.println(lo);
        
        double d = Double.parseDouble("123.456");
        System.out.println(d);
        
        float f = Float.parseFloat("321.123");
        System.out.println(f);
        
        boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        
        System.out.println("2����:"+Integer.toBinaryString(10));
        System.out.println("8����:"+Integer.toOctalString(10));
        System.out.println("16����:"+Integer.toHexString(10));
        
        //���� ������ Ȯ���ϼ��� ex)����_ȫ����_20220208.jpg
        
        //�μ���, �̸� ���, �Ի���
        
        String nm = "����_ȫ�浿_20220208.jpg";
        
        
//        System.out.println("�μ���: "+ nm.substring(0,2));
//        System.out.println("�̸����: "+ nm.substring(3,6));
//        System.out.println("�Ի���: "+ nm.substring(7,15));

        String [] arr = nm.split("_");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        int [] reg = {
        		Integer.parseInt(arr[2].substring(0,4)),
        		Integer.parseInt(arr[2].substring(4,6)),
	            Integer.parseInt(arr[2].substring(6,8)),
};
        
        
	}

}
