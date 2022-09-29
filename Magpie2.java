public class Magpie2
{
      /**
   * Get a default greeting
       * @return a greeting
       */

       /*/**
        * @author  Anurag Dasari // 
        * ITSC1212 - 001, Mazumder
        * @version 1.0 // add .1 for each update
        * @since   2021-02-22 // date last update */
      public String getGreeting()
      {
              return "Hello, let's talk.";
      }

      /**
       * Gives a response to a user statement
       *
       * @param statement
       *            the user statement
       * @return a response based on the rules given
       */
      public String getResponse(String statement)
      {
              String response = "";
              if (statement.indexOf("no") >= 0)
              {
                      response = "Why so negative?";
              }
              else if (statement.indexOf("Sayeda Fatema Mazumder") >= 0
                              || statement.indexOf("Sayeda") >= 0
                              || statement.indexOf("Fatema") >= 0
                              || statement.indexOf("Mazumder") >= 0)
              
              {

                      response = "She sounds like a good teacher.";
              }
              else if (statement.indexOf("dog") >=0
                      || statement.indexOf("cat") >=0)
              {

                      response = "Tell me more about your pets.";
              }
              else if (statement.indexOf("") >=0)
      {

              response = "Say something, please.";
      }
              else if (statement.indexOf("mother") >= 0
                              || statement.indexOf("father") >= 0
                              || statement.indexOf("sister") >= 0
                              || statement.indexOf("brother") >= 0)
              {
                      response = "Tell me more about your family.";
              }
              
              else
              {
                      response = getRandomResponse();
              }
              return response;
      }

      /**
       * Pick a default response to use if nothing else fits.
       * @return a non-committal string
       */
      private String getRandomResponse()
      {
              final int NUMBER_OF_RESPONSES = 6;
              double r = Math.random();
              int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
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
                      response = "Haha!";
              }
              else if (whichResponse == 5)
              {
                      response = "Whatever you say";
              }
              else if (whichResponse == 6)
              {
                      response = "Not cool!";
              }
              return response;
       }
 }
