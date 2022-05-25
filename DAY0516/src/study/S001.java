package study;
/*  배열을 복사
 * 배열은 한번 생성된 후 배열의 크기를 변경할 없습니다.
 * 크기를 더 늘리고 싶을 경우 같은 자료형 배열을 원하는 크기로 준비하고 
 * 기존 배열을 복사하면 작업을 완료할 수 있음
 * 	System.arraycopy() 메소드 이용
 * 객체를 사용하지 않아도 바로 사용 가능하다 
 * Public static void arraycopy(Object scr.int scrPos,Object dest,ind destPos,int length){
 * ..... 내용을 채워준다. }Pos = position의 약자 복사할 위치 
 *	src : 소스배열
 *	srcPos : 소스배열의 복사 시작 위치
 *	dest : 복사 배열 
 *	desPos : 복사 시작위치 (인덱스의 위치로 표시) 
 *	length : 복사되는 배열의 요소의 수 
 *  배열의 크기를 더 키우고 싶을때에는 array.copy를 사용해서 복사를 해주거나 예전보다 더 큰 배열을 만든다. 
 *  for문을 이용한 복사는 크기를 더 크게 만들어주어서 값을 넣어주는 것
 *  System.arraycopy는 값을 한꺼번에 바꾸어주는 것 
 *  다시 말해서 for문은 배열의 요소 하나하나에 접근해서 복사하지만 arrarycopy()는 지정된 범위의 값들을
 *  한번에 통째로 복사한다.
 *  for문은 하나씩 바꾸어주는 것 
 *  
 */
public class S001 {

	public static void main(String[] args) {
		// 배열을 복사
		String[] scr = {"Java","DataBase","JSP","Spring"};// 먼저 4개의 배열을 만들었다.
		String[] dest = new String [6]; // 배열의 복사를 위해서 6개의 배열을 만들어주었다.
		dest[0]="OS";
		dest[1]="Network";
		// 인덱스 0과 1값에 값을 넣어주었다. 
		System.arraycopy(scr, 0, dest, 2, 4);
	
		for(String str : dest) {
			System.out.println("dest value"+str);
			System.out.println();
			System.out.println();
			
		// for문을 이용한 복사 
			int [] arr = new int [5];
			for(int i=0;i<arr.length;i++) {
				arr[i]=i+1;
				System.out.println(arr[i]+"\t");
			}
			System.out.println("변경전 arr.length"+arr.length);
			
			int [] temp = new int [arr.length*2];
			System.out.println("temp.length"+temp.length);
			
			//for문을 이용해서 arr배열에  저장된 값을 temp 배열에 복사 
			for(int i =0;i<arr.length;i++) {
				temp[i]=arr[i];
				System.out.println(temp[i]+"\t");	
			
			}arr = temp;// 변수로 저장되는거라서 통째로 복사해준다. 
			System.out.println();
			System.out.println("변경후 arr.length"+arr.length);
			System.out.println();
			for(int i =0;i<arr.length;i++) {
				System.out.println(arr[i]+"\t");
			}
		}
		
	}

}
