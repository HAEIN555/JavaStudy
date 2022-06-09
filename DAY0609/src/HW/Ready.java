package HW;

import java.util.*;
public class Ready {
	
   static Scanner sc = new Scanner(System.in);
   static int hero,hero1,mon,mon1,gold,gold1,x,y;
   
   void gametool(int x,int y,String gamemold[][]) {
      
   for(int i=0;i<x;i++) {
      for(int j=0;j<y;j++) {
         gamemold[i][j]="#";
         }
      }
   for(int i=1;i<x-1;i++) {
      for(int j=1;j<y-1;j++){
         gamemold[i][j]=" ";
         }
      }
   while(true) {
   hero =(int)(Math.random()*(x-2))+1;
   hero1 =(int)(Math.random()*(y-2))+1;
   mon =(int)(Math.random()*(x-2))+1;
   mon1 =(int)(Math.random()*(y-2))+1;
   gold =(int)(Math.random()*(x-2))+1;
   gold1 =(int)(Math.random()*(y-2))+1;
   
   if((hero==mon&&hero1==mon1)||
         (mon==gold&&mon1==gold1)||
         (hero==gold&&hero1==gold1))
   {continue;}
   else {break;}
   }
   
   gamemold[hero][hero1] ="@";
   gamemold[mon][mon1] ="M";
   gamemold[gold][gold1] ="G";
   
   for(int i=0;i<x;i++) {
      for(int j=0;j<y;j++) {
         System.out.print(gamemold[i][j]);
      }System.out.println();   
   }
   System.out.print("왼쪽(h),위쪽(j),아래쪽(k),오른쪽(l) : ");
   }
   void manipulate(int x,int y,String gamemold[][]) {
      do {
      String mani = sc.nextLine();
      switch (mani) {
      //왼쪽(h),위쪽(j),아래쪽(k),오른쪽(l) 
      case "j":hero=--hero;
             if(hero==0) {
                hero=++hero;
                System.out.println("벽에 닿았습니다 다시이동하세요");
                continue;
                }
             gamemold[hero][hero1]="@";
             gamemold[hero+1][hero1]=" ";
      break;   
      case "h":hero1=--hero1;   
             if(hero1==0) {
                hero1=++hero1;
                System.out.println("벽에 닿았습니다 다시이동하세요");
                continue;
                 }
             gamemold[hero][hero1]="@";
             gamemold[hero][hero1+1]=" ";
             
      break;
      case "k":hero=++hero;
            if(hero==x-1) {
               hero=--hero;
               System.out.println("벽에 닿았습니다 다시이동하세요");
               continue;
               }
             gamemold[hero][hero1]="@";
             gamemold[hero-1][hero1]=" ";
      break;
      case "l":hero1=++hero1;
            if(hero==y-1) {
               hero1=--hero1;
               System.out.println("벽에 닿았습니다.다시 이동하세요");
               continue;
               }
             gamemold[hero][hero1]="@";
             gamemold[hero][hero1-1]=" ";
      break;
      }
      do {
         int mm =(int)(Math.random()*4)+1;
         switch (mm) {
         case 1:
            mon=--mon;
            if(mon==0) {
               mon=++mon;
               continue;
            }
            gamemold[mon][mon1]="M";
            gamemold[mon+1][mon1]=" ";
            break;
         case 2:
            mon1=--mon1;
            if(mon1==0) {
               mon1=++mon1;
               continue;
            }
            gamemold[mon][mon1]="M";
            gamemold[mon][mon1+1]=" ";
            break;
         case 3:
            mon=++mon;
            if(mon==(x-1)) {
               mon=--mon;
               continue;
            }
            gamemold[mon][mon1]="M";
            gamemold[mon-1][mon1]=" ";
            break;
         case 4:
            mon1=++mon1;
            if(mon1==(y-1)) {
               mon1=--mon1;
               continue;
            }
            gamemold[mon][mon1]="M";
            gamemold[mon][mon1-1]=" ";
            break;
         }
      }while (mon==x&&mon1==y);
      
      for(int i=0;i<x;i++) {
         for(int j=0;j<y;j++) {
            System.out.print(gamemold[i][j]);   
         }System.out.println();
      }System.out.println("왼쪽(h),위쪽(j),아래쪽(k),오른쪽(l) :");

      if(hero==gold||hero==gold1) {
         System.out.println("우승했어요 축하합니다~!");
         break;
      }else if((hero==mon&&hero1==mon1)||(gold==mon&&gold1==mon1))
         {System.out.println("졌어요 ㅜㅜㅜㅜ ");
            break;}
         }while(!(gold==hero&&gold1==hero1));      
      }
   }

