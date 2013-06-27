package org.teachingkidsprogramming.recipes.finalExam;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.windows.MessageBox;

public class ExamTriangleShellTwo
{
  private static int length;
  public static void main(String[] args)
  {
    Tortoise.show();
    Tortoise.setSpeed(10);
    int shellSize = MessageBox.askForNumericalInput("Please give a number for the size of the shell.");
    if (shellSize < 300)
    {
      MessageBox.showMessage("The size of the shell is too small to be seen.");
      MessageBox.askForNumericalInput("Please enter a new number for the size of the shell.");
    }
    //    Otherwise, Do the following the "shell size" number of times
    else
    {
      for (int i = 1; i <= shellSize; i++)
      {
        Tortoise.setPenColor(Colors.getRandomColor());
        int largeLength = shellSize / 150;
        //          Subtract the value of the large length from the current length
        largeLength -= length;
        //      If the value of the large length is less than zero
        if (largeLength < 0)
        {
          length = length + 3;
        }
        //         Otherwise, Call the drawTriangle method (recipe below)      
        else
        {
          drawTriangle();
          int numberOfRotations = 6;
          Tortoise.turn(360 * numberOfRotations / shellSize);
        }
        //    Repeat 
      }
    }
  }
  private static void drawTriangle()
  {
    //      Do the following 2 times 
    for (int i = 1; i <= 2; i++)
    {
      //          Move the tortoise the current length 
      Tortoise.move(length);
      Tortoise.turn(360 / 3);
    }
  }
}
