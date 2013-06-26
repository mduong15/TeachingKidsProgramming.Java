package org.teachingkidsprogramming.recipes;

import org.teachingextensions.simpleparser.Parser;
import org.teachingextensions.utils.Viewer;
import org.teachingextensions.windows.MessageBox;

public class AdLibs
{
  public static void main(String[] args)
  {
    words words = new words();
    words.adverb = MessageBox.askForTextInput("Please enter an adverb.");
    words.edVerb = MessageBox.askForTextInput("Please enter a verb ending in -ed.");
    words.bodyPart = MessageBox.askForTextInput("Please enter a body part.");
    String story = Parser.parseRtfFile("view.rtf", words);
    //MessageBox.showMessage(story);
    Viewer.displayRtfFile(story);
  }
}