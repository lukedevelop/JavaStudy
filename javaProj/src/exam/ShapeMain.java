package exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

class Shape{
	String name;
	double area, border;

	 public String toString() {
		 return name +" : "+ area + " , " + border;
	 }
}

class Rectangle extends Shape{
	public Rectangle(int i, int j) {
		name = "직사각형";
		area = i*j;
		border = (i+j)*2;
	}
	
}

class Circle extends Shape{
	public Circle(int r) {
		name = "원";
		area = Math.PI*r*r;
		border = Math.PI*r*2;
	}
	 
}

class Shapecom implements Comparator<Shape>{
	
	@Override
	public int compare(Shape o1, Shape o2) {
	int res = (int)(o2.area - o1.area);
	if(res==0) {
		res = (int) (o2.border - o1.border);
	}
	return res;
	}
}
    
	
    
    
    
public class ShapeMain {

	public static void main(String[] args) {
		 /* 
	    도형별로 나누어 정렬하여 출력하세요
	    
	    구문 : 도형이름
	    정렬순서 : 넓이 > 둘레  내림차순 기준
	    
	    */
		ArrayList<Shape> arr = new ArrayList<Shape>();
		arr.add(new Rectangle(8,5));
		arr.add(new Rectangle(9,5));
		arr.add(new Circle(8));
		arr.add(new Rectangle(6,5));
		arr.add(new Circle(11));
		
		//TreeMap<String, TreeSet<Shape>> arr2 = new TreeMap<String,TreeSet<Shape>>();
		
		Collections.sort(arr,new Shapecom());
		Iterator<Shape>it = arr.iterator();
		
//		Set<Rectangle> rt = new TreeSet<Rectangle>();

		
		for(Shape sp : arr) {
			
			System.out.println(sp.name+"(넓이) : "+ sp.area+"(둘레) : "+sp.border);
			//System.out.println(sp.name+"(둘레) : "+sp.border);
		}
		
		
		
		


		

	}




}
