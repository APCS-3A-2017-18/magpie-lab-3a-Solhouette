
public class Magpie3
{

 public String getGreeting()
 {
  return "Hello, let's talk.";
 }

 public String getResponse(String statement)
 {
  String response = "";
  if (statement.length() == 0)
  {
   response = "Say something, please.";
  }
  else if (findKeyword(statement, "no") >= 0)
  {
   response = "Why so negative?";
  }
  else if (findKeyword(statement, "hi") >= 0)
  {
   response = "hello there"; 
  }
  else if (findKeyword(statement, "what") >= 0)
  {
   response = "what?"; 
  }
    else if (findKeyword(statement, "not cool") >= 0)
  {
   response = "huh?"; 
  }
      else if (findKeyword(statement, "general kenobi") >= 0)
  {
   response = "hello there"; 
  }
        else if (findKeyword(statement, "goku") >= 0)
  {
   response = "hi Harrison"; 
  }
        
  else if (findKeyword(statement, "mother") >= 0
    || findKeyword(statement, "father") >= 0
    || findKeyword(statement, "sister") >= 0
    || findKeyword(statement, "brother") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if(findKeyword(statement, "cool") >= 0)
    response = "you cool";
  else
  {
   response = getRandomResponse();
  }
  return response;
 }

 public int findKeyword(String statement, String goal,
   int startPos)
 {
  String phrase = statement.trim();
  int psn = phrase.toLowerCase().indexOf(
    goal.toLowerCase(), startPos);

  while (psn >= 0)
  {

   String before = " ", after = " ";
   if (psn > 0)
   {
    before = phrase.substring(psn - 1, psn)
      .toLowerCase();
   }
   if (psn + goal.length() < phrase.length())
   {
    after = phrase.substring(
      psn + goal.length(),
      psn + goal.length() + 1)
      .toLowerCase();
   }

   // If before and after aren't letters, we've
   // found the word
   if (((before.compareTo("a") < 0) || (before
     .compareTo("z") > 0)) // before is not a
           // letter
     && ((after.compareTo("a") < 0) || (after
       .compareTo("z") > 0)))
   {
    return psn;
   }

   psn = phrase.indexOf(goal.toLowerCase(),
     psn + 1);

  }

  return -1;
 }

 private int findKeyword(String statement, String goal)
 {
  return findKeyword(statement, goal, 0);
 }
 private String getRandomResponse()
 {
  final int NUMBER_OF_RESPONSES = 4;
  double r = Math.random();
  int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
  String response = "";

  if (whichResponse == 0)
  {
   response = "Interesting, tell me more.";
  }
  else if (whichResponse == 1)
  {
   response = "Hmmm.";
  }
  else if (whichResponse == 2)
  {
   response = "Do you really think so?";
  }
  else if (whichResponse == 3)
  {
   response = "You don't say.";
  }
  else if (whichResponse == 4)
      {
    response = "Can you repeat that?";
  }
    else if (whichResponse == 5)
  {
    response = "I didn't know that";
  }
    else if (whichResponse == 6)
  {
    response = "What?";
  }
    else if (whichResponse == 7)
    {
      response = "Huh?";
    }
    else if (whichResponse == 8)
    {
      response = "Well then";
    }
  return response;
 }

}
