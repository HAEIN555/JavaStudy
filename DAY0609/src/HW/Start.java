package HW;

import java.util.*;
public class Start {
   static Scanner sc= new Scanner(System.in);
   public static void main(String[] args) {
      System.out.println("������ ĭ ũ�⸦ �������ּ���!");
      System.out.print("�� : ");
      int x =sc.nextInt();
      System.out.print("�� : ");
      int y =sc.nextInt();
      String [][] gamemold =new String [x][y];
      Ready game = new Ready();
      game.gametool(x,y,gamemold);
      game.manipulate(x,y,gamemold);
   }

}