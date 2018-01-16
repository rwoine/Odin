package be.woine.odin.example;

import lombok.Getter;

/**
 * Simple example Thread that exposes a member variable that change every second.
 */
public class ExampleThread extends Thread
{
   @Getter
   private int number = 0;

   @Override
   public void run()
   {
      while(true)
      {
         try
         {
            number++;
            Thread.sleep(1000);
         }
         catch (InterruptedException pE)
         {
            pE.printStackTrace();
         }
      }
   }
}
