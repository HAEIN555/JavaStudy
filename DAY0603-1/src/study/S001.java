package study;

public class S001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 제네릭 
		// collection
		// array list - 구현을 할 수 있는거 
		/* 제네릭 - 컬렉션(자료구조) 객체를 저장,수집하는 구조적인 성격을 보강하기 위해 제공되는 것
		 * 컬렉션은 클래스 그자체를 저장하는 것 
		 * Generic_class<적용할 _Generic_Type> 변수명 ; // 선언
		 * 변수명 = new Generic_class 생성자명<적용할 _Generic_Type>(); // 생성 
		 * collection 컬렉션 - 활용도가 높다!
		 * 자료구조 - 자료를 효율적으로 이용할 수 있도록 컴퓨터에 저장하는 방법
		 * 프레임 워크 - 기본적인 자료 구조외에 객체를 저장, 검색 하거나 객체를 매개변수로 넘겨주는 등
		 * 객체를 체계적으로 관리하는 구조 
		 * Collection 
		 * set - 중복이 없는 객체를 모아둘때 사용 - sortedSet
		 * list - 순서가 있는 객체를 모아둘때 사용 
		 * Map
		 * 사전과 구조가 비슷한 객체를 저장하는 클래스 
		 * sorted가 붙은 클래스  - 정렬이 자동으로 처리가 되는?
		 * 순서가 있는 데이터를 관리하는데 사용하는 클래스 
		 * 
		 * set interface - 원소의 중복이 없는 데이터를 관리할때 사용하는 인터페이스 / 순서 관련 없음 
		 * 						크기를 잡는다.  데이터를 추가할때는 add라는 걸  쓴다. clear는 set을 비운다.
		 * 						set은 구현체가 있어야 한다. 그래서 hash set을 자주 사용한다. 
		 *List interface - 순서가 있는 객체를 저장하는 자료구조를 지원하는 인터페이스
		 *						순차적으로 객체를 저장할 수 있을뿐 아니라 원하는 위치에 객체를 저장하거나 읽기가능
		 *						객체를 저장할때 인덱스를 이용해 저장하고 인덱스로 객체를 읽어옴
		 *-set과의 차이점 --- list인터페이스는 중복된 객체가 있다. 
		 *						Listinterface 다형성  push pop
		 *Map interface - 항상! 똑같이 변함 없이 key 와 쌍으로 이루어진다. 
		 *						key - k 항상 키와 객체 쌍으로 데이터를 저장하는 자료구조를 제공
		 *						키를 이용해 어디에 저장할지 결정후 키와 함께 객체를 map에 저장 
		 *						map 인터페이스를 구현하는 가장 대표적인 클래스 - hash table 
		 *						key값은 중복을 허용하지 않는다. 
		 *Iterator interface - 파일 처리할때 사용 , 앞서 설명한 컬렉션에 포함된 객체를 순차적으로 접근할때 
		 *							사용하는 인터페이스
		 *							모든 컬렉션에는 Iterator() 메소드가 있다.
		 *							
		 *
		 * 
		 */
	}

}
