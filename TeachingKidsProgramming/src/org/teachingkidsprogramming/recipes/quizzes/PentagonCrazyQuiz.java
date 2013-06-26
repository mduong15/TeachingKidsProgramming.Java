package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.ColorWheel;
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonCrazyQuizGrader;
import org.teachingkidsprogramming.recipes.quizzes.graders.PentagonQuiz;

public class PentagonCrazyQuiz extends PentagonQuiz
{
  //      Question1
  //      Create a method called thread
  //       that moves the tortoise 6 pixels
  public void thread()
  {
    // TODO Auto-generated method stub
    Tortoise.move(6);
  }
  public void question2()
  {
    //        Do the following 76 times
    for (int i = 1; i <= 76; i++)
    {
      //        Quiz.Stitch()
      stitch();
    }
  }
  public void question3()
  {
    ColorWheel.addColor(Colors.Greens.Lime);
  }
  public void question4()
  {
    ColorWheel.addColor(Colors.Reds.Red);
  }
  public static void main(String[] args)
  {
    new PentagonCrazyQuizGrader().grade(new PentagonCrazyQuiz());
  }
}
