package io_p;

import java.io.Serializable;  // 직렬화 시키는 인터페이스

	class ObjData implements Serializable{
		private static final long serialVersionUID = 8522;

		String tag, src, dst;
		Object data;
		public ObjData(String tag, String src, String dst, Object data) {
			super();
			this.tag = tag;
			this.src = src;
			this.dst = dst;
			this.data = data;
		}
		@Override
		public String toString() {
			return "ObjData [tag=" + tag + ", src=" + src + ", dst=" + dst + ", data=" + data + "]";
		}
		
//////////////////////////////////////////////////////////////////////////////////////////////////////////
		
//		String name;
//		int kor, eng, math, tot;
//		double avg;
//		
//		public ObjData(String name, int kor, int eng, int math, int tot, double avg ) {
//			super();
//			this.name = name;
//			this.kor = kor;
//			this.eng = eng;
//			this.math = math;
//			this.tot = tot;
//			this.avg = avg;
//			
//		}
//
//		@Override
//		public String toString() {
//			return "ObjData [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", tot=" + tot
//					+ ", avg=" + avg + "]";
//		}
		
		
		
	}
