import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.*;
import java.lang.Math;

   public class Clicker {
   
      private static Robot mainBot;
      private int mouseClicks = 0;
      private long OldTime = System.currentTimeMillis();   
      private static int MAX = 2100;
      private static int MIN = 1700;
      
      private int clickTimer = 1900;
      
      public void clickMouse() {
         mainBot.mousePress(InputEvent.BUTTON1_MASK);
         mainBot.mouseRelease(InputEvent.BUTTON1_MASK);
      }

      public Clicker() {

          System.out.println("Clicking every " + clickTimer+ " milliseconds.");      
          
          while(true) {
              if(System.currentTimeMillis() - OldTime > clickTimer) {   
              	clickTimer = MIN + (int)(Math.random() * (MAX - MIN) + 1);
                 OldTime = System.currentTimeMillis();
                 clickMouse();
                 mouseClicks++;
                 System.out.println("Mouse Clicked #" + mouseClicks + " every " + clickTimer + " milliseconds.");
              }        
           }
      }
      
      public static void main(String args[]) {
      
         try {
            mainBot = new Robot();
         } catch(Exception e) {
            System.out.println("Error: Autoclicker failed to start!");
         }
         
         new Clicker();
      }
   
   }