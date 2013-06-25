package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Turtle;

public class TurtleTree
{
  public static void main(String[] args)
  {
    Turtle turtle = new Turtle();
    turtle.setSpeed(10);
    turtle.getBackgroundWindow().setColor(Colors.Grays.Black);
    int branch = 60;
    drawBranch(turtle, branch);
  }
  private static void drawBranch(Turtle turtle, int branch)
  {
    if (0 < branch)
    {
      adjustColor(turtle, branch);
      turtle.move(branch);
      drawLowerBranches(turtle, branch);
      turtle.move(-branch);
    }
  }
  private static void adjustColor(Turtle turtle, int branch)
  {
    if (branch == 10)
    {
      turtle.setPenColor(Colors.Greens.Lime);
    }
    if (branch == 20)
    {
      turtle.setPenColor(Colors.Greens.ForestGreen);
    }
    if (branch == 30)
    {
      turtle.setPenColor(Colors.Greens.DarkGreen);
    }
    if (branch == 40)
    {
      turtle.setPenColor(Colors.Greens.Olive);
    }
    if (branch == 50)
    {
      turtle.setPenColor(Colors.Browns.Sienna);
    }
    if (branch == 60)
    {
      turtle.setPenColor(Colors.Browns.SaddleBrown);
    }
  }
  private static void drawShorterBranch(Turtle turtle, int branch)
  {
    drawBranch(turtle, branch - 10);
  }
  private static void drawLowerBranches(Turtle turtle, int branch)
  {
    turtle.turn(30);
    drawShorterBranch(turtle, branch);
    turtle.turn(-60);
    drawShorterBranch(turtle, branch);
    turtle.turn(30);
    adjustColor(turtle, branch);
  }
}