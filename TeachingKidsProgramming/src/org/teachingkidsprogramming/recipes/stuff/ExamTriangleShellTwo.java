package org.teachingkidsprogramming.recipes.stuff;

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
    int shellSize = MessageBox.askForNumericalInput("Please enter the size of a shell.");
    if (shellSize < 300)
    {
      MessageBox.showMessage("The shell size is too small");
      shellSize = MessageBox.askForNumericalInput("Please enter a new shell size.");
    }
    //    Otherwise, Do the following the "shell size" number of times
    for (int i = 1; i <= shellSize; i++)
    {
      Tortoise.setPenColor(Colors.getRandomColor());
      //          Set the value of the large length to the size of the shell divided by 150
      int largeLength = shellSize / 150;
      //          Subtract the value of the large length from the current length
      length = length - largeLength;
      //      If the value of the large length is less than zero
      if (largeLength < 0)
      {
        length = length + 3;
      }
      else
      {
        drawTriangle();
        int numberOfRotations = 6;
        Tortoise.turn((360 * numberOfRotations) / shellSize);
      }
    }
  }
  private static void drawTriangle()
  {
    for (int i = 1; i <= 2; i++)
    {
      Tortoise.move(length);
      Tortoise.turn(360 / 3.25);
    }
  }
}