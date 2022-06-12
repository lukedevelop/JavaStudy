package lang_p;

abstract class CCShape {
	String kind;
	int area, border;

	abstract void execute(int... line);

	@Override
	public String toString() {
		return kind + ", " + area + ", " + border;
	}
}

class CCRectangle extends CCShape {

	@Override

	public void execute(int... line) {
		if (line.length != 2) {
			System.out.println("���簢���� ���� ������ 2�� �̾�� �մϴ�.");
			return;
		}
		kind = "���簢��";
		area = line[0] * line[1];
		border = (line[0] + line[1]) * 2;
	}
}

class CCCircle extends CCShape {

	@Override
	public void execute(int... line) {
		if (line.length != 1) {
			System.out.println("���� ���� ������ 1�� �̾�� �մϴ�.");
			return;
		}
		kind = "��";
		area = (int) (Math.PI * line[0] * line[0]);
		border = (int) (Math.PI * line[0] * 2);
	}
}

class CCTriangle extends CCShape {

	@Override
	public void execute(int... line) {
		if (line.length != 3) {
			System.out.println("�����ﰢ���� ���� ������ 3�� �̾�� �մϴ�.");
			return;
		}
		kind = "�����ﰢ��";
		area = line[0] * line[1] / 2;
		border = line[0] + line[1] + line[2];

	}
}

public class ClassShapeMain {

	public static void main(String[] args) {

		for (String str : "Rectangle,Circle,Triangle".split(",")) {
			try {
				CCShape sh = (CCShape) Class.forName("lang_p.CC" + str).newInstance();
				sh.execute(5);
				sh.execute(5, 6);
				sh.execute(5, 6, 8);
				System.out.println(sh);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
