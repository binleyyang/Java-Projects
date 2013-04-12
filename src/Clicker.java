import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.*;

   public class Clicker {
   
      private static Robot mainBot;
      private int mouseClicks = 0;
      private long OldTime = System.currentTimeMillis();   
      
      private int clickTimer = 5000;
      
      public void clickMouse() {
         mainBot.mousePress(InputEvent.BUTTON1_MASK);
         mainBot.mouseRelease(InputEvent.BUTTON1_MASK);
      }
      
      public void startBot() {
         while(true) {
      
            if(System.currentTimeMillis() - OldTime > clickTimer) {   
               OldTime = System.currentTimeMillis();
               clickMouse();
               mouseClicks++;
               System.out.println("Mouse Clicked #" + mouseClicks);
            }
         
         }
      }
      
      public Clicker() {
      
         //System.out.println("Welcome to the Java AutoClicker V" + Constants.version + " created by " + Constants.dontLeech + ".");
         
         Scanner sc = new Scanner(System.in);
         System.out.print("(Seconds) AutoClicker timer:");
         clickTimer = Integer.parseInt(sc.nextLine()) * 1000;
         System.out.println("Clicking every " + clickTimer / 1000 + " seconds.");      
         
         startBot();
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