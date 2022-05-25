package study;

public class UseDraw {

	public static void main(String[] args) {
		
		Diagram[] dd=new Diagram[3];
		dd[0]=new Triangle();
		dd[1]=new Circle();
		dd[2]=new Retangle();
		
		for(int i=0;i<dd.length;i++) 
			dd[i].draw();
	}

}
