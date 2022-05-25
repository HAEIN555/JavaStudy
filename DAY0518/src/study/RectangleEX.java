package study;
import java.util.*;
public class RectangleEX {

	public static void main(String[] args) {
		Scanner  sc= new Scanner(System.in);
		Rectangle rect =new Rectangle();
		System.out.print("가로 :");
		rect.width=sc.nextInt();
		System.out.print("세로 :");
		rect.height=sc.nextInt();
		System.out.println("사각형의 넓이는"+rect.getArea()+"입니다");

	}

}
