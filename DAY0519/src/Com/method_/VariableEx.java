package Com.method_;
/* 메소드 정의 시 통일된 인자의 자료형에 '...'라고 명시함으로 이를 통해
 * 메소드를 수행하는데 필요한 인자의 수를 유연(내부적으로 배열화 작업을 자동으로 해줌)하게 구현 할 수 있다.
 * 
 */
public class VariableEx {
	public void argsTest(String...n) { // 변수의 값에 따라 
		for (int i=0;i<n.length;i++) {
			System.out.println("a["+i+"] :" +n[i]);
		}
	}
	public static void main(String[] args) {
		VariableEx ve= new VariableEx();
		ve.argsTest("a","b","c");
		ve.argsTest("100","1000","600","10000");
	}

}
