		package collection_P;

		import java.util.ArrayList;
		import java.util.Iterator;
		import java.util.Map;
		import java.util.TreeMap;
		import java.util.TreeSet;


		class GenShape implements Comparable<GenShape>{
			String name;
			double area, border;
			
			@Override
			public String toString() {
				return name + " : " + area + "," + border;
			}

			@Override
			public int compareTo(GenShape o) {
				int res = (int)(o.area - area);
				if(res==0) {
					res = (int)(o.border - border);
				}
				if(res==0) {
					res = 1;
				}
				return res;
			}
			
			
		}

		class GenRectangle extends GenShape{
			public GenRectangle(int w, int h) {
				name = "직사각형";
				area = w* h;
				border = (w+h)*2;
			}
		}

		class GenCircle extends GenShape{
			public GenCircle(int r) {
				name = "원";
				area = Math.PI*r*r;
				border = Math.PI*r*2;
			}
		}


		public class GenShapeMain {

			public static void main(String[] args) {
				ArrayList<GenShape> arr = new ArrayList<GenShape>();
				arr.add(new GenRectangle(5,6));
				arr.add(new GenCircle(5));
				arr.add(new GenRectangle(10,6));
				arr.add(new GenCircle(8));
				arr.add(new GenRectangle(4,5));
				arr.add(new GenCircle(10));
				arr.add(new GenRectangle(8,7));
				arr.add(new GenRectangle(10,2));
				
				Iterator<GenShape>it = arr.iterator();
				
				TreeMap<String, TreeSet<GenShape>>map = new TreeMap();
				
				while(it.hasNext()) {
					GenShape gs = it.next();
					//System.out.println(gs.name);
					if(!map.containsKey(gs.name)) {
						map.put(gs.name, new TreeSet<GenShape>());
					}
					
					map.get(gs.name).add(gs);
					
				}
				
				for (Map.Entry<String, TreeSet<GenShape>> me : map.entrySet()) {
					System.out.println(me.getKey()+" >>>>");
					for (GenShape gs: me.getValue()) {
						System.out.println(gs);
					}
				}
				
				
				/*
				for (GenShape gs : arr) {
					System.out.println(gs.name+"=>"+gs.area);
				}
				
				 도형별로 나누어 정렬하여 출력하세요
				 
				 구분 : 도형이름
				 정렬순서 : 넓이 > 둘레  내림차순 기준
				 
				 
				 * */
				
			}

		}