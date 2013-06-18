package org.teachingkidsprogramming.recipes;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

public class SimpleSquare
{
  public static void main(String[] args) throws Exception
  {
    Tortoise.show();
    //  Make the tortoise move as fast as possible --#6
    //  Do the following 4 times --#5.1
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    Tortoise.setPenColor(Colors.Blues.Blue);
    Tortoise.move(50);
    Tortoise.turn(90);
    //  Repeat --#5.2
  }
}
