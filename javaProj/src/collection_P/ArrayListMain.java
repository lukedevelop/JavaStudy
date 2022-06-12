package collection_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List arr1 = new ArrayList();

		//Object [] arr1 = {};  <== 요놈이랑 비슷함
		
		arr1.add(10);
		arr1.add(20);
		arr1.add("아기상어");
		arr1.add(123.456);
		arr1.add(true);
		arr1.add(new int[] {11,22,33});
		arr1.add(null);
		arr1.add(10);
		arr1.add(30);
		arr1.add(40);
		arr1.add(20);
		arr1.add(10);
		arr1.add(20);
		arr1.add(70);
		
		System.out.println(arr1);
		System.out.println(arr1.size());     //사이즈 봄.(총7)
		System.out.println(arr1.get(2));     // 2번쨰인 아기상어가 나옴.
        arr1.set(4, "엄마상어");               // 4번째 true 가 엄마상어로 바뀜.
        System.out.println(arr1);     
        arr1.add(3,"장수풍뎅이");              // 밀고나감 3번째 앞으로 들어가므로 "장수풍뎅이" 가 3번째가 되는.
        System.out.println(arr1);
        arr1.remove(6);                    // 6번째를 지움
        System.out.println(arr1);
        arr1.remove("아기상어");             //원소 자체를 지울수도 있음 "아기상어" 가 사라짐.
        System.out.println(arr1);
        arr1.remove((Object)20);              //remove 는 index 와 object 만 인식 20을 지우고싶으면 ((Object)20) 으로 써야함
        System.out.println(arr1);   
        
        System.out.println(arr1.contains(30));    // contains(30) : 30이 있나 찾아줌 있을경우 "true" 없다면"false"
        System.out.println(arr1.contains(100));
        System.out.println(arr1.indexOf(20));       // indexOf(20) : 20 이 몇번쨰에 있는지 8번째
        System.out.println(arr1.indexOf(100)); 	    // 숫자가 없다면 -1 로 나옴
        System.out.println(arr1.lastIndexOf(20)); 	 //lastIndexOf: 20중 마지막 순서를 알수있음 20 의 마지막은 10번째 (첫번째20은(8번쩨))
	
        Object [] arr2 = arr1.toArray();
        
        System.out.println((arr2));                  // Array List 임 (?)
        System.out.println(Arrays.toString(arr2));   // 위 배열 (?)
        
        //ArrayList 는 일부 추출이 가능

        List arr3 = arr1.subList(2, 7);  // shallow copy (주소형태로 복사가 됨)
        List arr4 = new ArrayList(arr1.subList(2, 7));   //deep copy 
        List arr5 = new ArrayList();
        arr5.addAll(arr3);  //deep copy
        List arr6 = new ArrayList();
        arr6.add(12);
        arr6.add(34);
        arr6.add(56);
        
        List arr7 = new ArrayList();
        arr7.add(10);
        arr7.add(90);
        arr7.add(100);
        
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        System.out.println(arr6);
        
        arr1.set(3,"아빠상어");
        arr3.set(4, 1357);
        System.out.println(arr1);
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        arr5.addAll(2,arr6);       //하나씩하나씩 추가됨
        System.out.println(arr5);
        
        System.out.println(arr5.containsAll(arr6));   //containsAll: arr5 에 arr6 가 포함되어있는가 포함되어있어 true
        System.out.println(arr5.containsAll(arr7));   // arr5 에 arr7 이 포함되어있는가 포함되어있지않아(100이 포함되어있지않음) false
       
        
        List arr8 = new ArrayList(arr1);
        arr1.removeAll(arr7);                         //remove: arr7과 arr1 중복되는 숫자들이 사라짐 (10 이 다사라짐)
        arr1.add(34);
        arr1.add(78);
        arr1.add(12);
        
        
        System.out.println(arr1);
        arr1.retainAll(arr6);                        //retainAll: arr6이랑 arr1 교집합 (겹치는거만 남겨둠) 
        System.out.println(arr1);
        System.out.println(arr8);
        
        Collections.replaceAll(arr8, 10, "열");       //replaceAll: arr8로 지정한후 10을 "열"로 바꿈 ex) (arr1,5,20) arr1 에 5를 20으로 바꿈
        System.out.println(arr8);
        
        Collections.reverse(arr8);                   //reverse: 순서가 뒤바뀜 
        System.out.println(arr8);
        
        Collections.swap(arr8,4,7);                  //swap: 4번째와 7번째의 자리가 바뀜
        System.out.println(arr8);
        
        Collections.shuffle(arr8);                   //shuffle: 실행을 할때마다 뒤죽박죽 바뀜
        System.out.println(arr8);
        
//        Collections.sort(arr8);                     //sort: 정렬하는거
//        System.out.println(arr8);
	    List arr9 = new ArrayList();
	    arr9.add(4);
	    arr9.add(10);
	    arr9.add(78);
	    arr9.add(23);
	    arr9.add(56);
	    arr9.add(13);
	    arr9.add(41);
	    System.out.println(arr9);               // sort: 정렬전
	    Collections.sort(arr9);
	    System.out.println(arr9);              //sort: 정렬후
	
	    
	    List arr10 = new ArrayList();
	    arr10.add("파랑");
	    arr10.add("노랑");
	    arr10.add("빨강");
	    arr10.add("보라");
	    arr10.add("녹색");
	    arr10.add("검정");
	    arr10.add("하양");
	    System.out.println(arr10);           // sort 전           
	    Collections.sort(arr10);
	    System.out.println(arr10);          //sort 후   (문자열도 정리가 가능)
	    
	     
	}

}
