package org.teachingkidsprogramming.recipes.quizzes;

import org.teachingextensions.logo.Tortoise;
import org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuizGrader;

public class HousesQuiz extends org.teachingkidsprogramming.recipes.quizzes.graders.HousesQuiz
{
  public void question1()
  {
    length = 7;
  }
  //
  @Override
  public void medium()
  {
    // TODO Auto-generated method stub
    length = 21;
    super.medium();
  }
  //
  //
  @Override
  public void large()
  {
    // TODO Auto-generated method stub
    length = 63;
    super.large();
  }
  //
  //
  @Override
  public void moveTheLength()
  {
    // TODO Auto-generated method stub
    Tortoise.move(length);
    super.moveTheLength();
  }
  //
  //
  @Override
  public void turnTheCorner()
  {
    // TODO Auto-generated method stub
    Tortoise.turn(-360 / 3);
    super.turnTheCorner();
  }
  //
  //
  //      Question6
  //      Create a method called drawASide
  @Override
  public void drawASide()
  {
    // TODO Auto-generated method stub
    moveTheLength();
    turnTheCorner();
    super.drawASide();
  }
  //       that calls moveTheLength and turnTheCorner 
  //
  public static void main(String[] args)
  {
    new HousesQuizGrader().grade(new HousesQuiz());
  }
}
