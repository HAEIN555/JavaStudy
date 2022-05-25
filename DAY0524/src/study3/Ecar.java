package study3;
/*전기 자동차를 클래스로 작성해보자 자동차는 100% 완전 배터리로 시작한다. 
 * 자동차를 운전할때마다 1km를 주행하고 배터리의 10%를 소모한다. 전지 자동차에는
 * 2가지 정보를 보여주는 디스플레이가 있다. 주행한 총거리는 주행거리 ..:km ,남은 배터리 충전량은 배터리 
 *  몇 %으로 표시된다. 
 *  Ecar.getInstance() : 새로운 자동차를 생성하는 정적 메소드 새로운 전기 자동차 인스턴스를 반환한다.
 * 		Ecar car =Ecar.getInstance();
 * dispDistance(); ---> 주행거리를 표시한다.
 * dispBattery();  ----> 남은 배터리를 표시한다. 
 * drive(); ---> 한번 호출 될때마다 1km을 운행한다. 
 *  */


public class Ecar {

	private int batteryPercentage =100;
	private int distance =0;//변경되면 안되니까 private으로 한다 고정값으로 하려고 
	
	
	
	public static Ecar getInstance() {
		// 객체 반환
		return new Ecar();// car를 return 해도 됨 
	}
	public void dispDistance () {
		System.out.println(distance+"킬로미터 주행..");
	}
	public void dispBattery () {
		if(this.batteryPercentage==0) {
			System.out.println("배터리가 동이 났습니다. 충전하세요");
			return;
		}
		System.out.println("Battery :"+batteryPercentage);
	}
	public void drive () {
		if(this.batteryPercentage!=0) {
			this.distance +=1;
			this.batteryPercentage -=10;
		}
	}
	
	
	public static void main(String[] args) {
		
		//Ecar car = new Ecar();
		Ecar car =Ecar.getInstance();
		car.drive();
		car.drive();
		car.drive();
		
		car.dispDistance();
		car.dispBattery();
	}

}
