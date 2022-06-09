package HW;

import java.util.*;
public class Start {
   static Scanner sc= new Scanner(System.in);
   public static void main(String[] args) {
      System.out.println("게임의 칸 크기를 지정해주세요!");
      System.out.print("행 : ");
      int x =sc.nextInt();
      System.out.print("열 : ");
      int y =sc.nextInt();
      String [][] gamemold =new String [x][y];
      Ready game = new Ready();
      game.gametool(x,y,gamemold);
      game.manipulate(x,y,gamemold);
   }

}