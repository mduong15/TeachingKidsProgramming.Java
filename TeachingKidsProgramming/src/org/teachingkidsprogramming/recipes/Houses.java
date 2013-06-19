package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class Houses
{
  public static void main(String[] args)
  {
    Tortoise.setSpeed(10);
    Tortoise.setX(200);
    int height = 40;
    drawHouse(height);
    drawHouse(120);
    drawHouse(90);
    drawHouse(20);
  }
  private static void drawHouse(int height)
  {
    Tortoise.setPenColor(Colors.Grays.LightGray);
    Tortoise.move(height);
    // flatRoof();
    //amittaisRoof();
    //MavericksRoof
    //turn left 90
    Tortoise.turn(-90);
    Tortoise.move(10);
    Tortoise.turn(90 + 45);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.move(50);
    Tortoise.turn(90 + 45);
    Tortoise.move(10);
    Tortoise.turn(-90);
    //move 10
    // turn right 90+45 degrees
    // move 50
    // turn 90
    // move 50
    // turn 90 + 45
    // move 10
    //turn 90 left
    Tortoise.move(height);
    Tortoise.turn(-90);
    Tortoise.move(20);
    Tortoise.turn(-90);
  }
  private static void amittaisRoof()
  {
    Tortoise.turn(45);
    Tortoise.move(10);
    Tortoise.turn(90);
    Tortoise.move(10);
    Tortoise.turn(45);
  }
  private static void flatRoof()
  {
    Tortoise.turn(90);
    Tortoise.move(30);
    Tortoise.turn(90);
  }
}
