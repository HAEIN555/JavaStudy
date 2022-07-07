package com.awtex;
import java.awt.*;
public class FrameEx02 extends Frame{

	  public FrameEx02() {
	      
	      super("«¡∑π¿”");
	      Winevent we = new Winevent();
	      addWindowListener(we);
	      setSize(300, 200);
	      setVisible(true);
	   }

	   public static void main(String[] args) {
	      new FrameEx02();
	      

	   }

	}