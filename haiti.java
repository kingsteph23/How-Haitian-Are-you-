// actual class of game
import  java.util.*;
public class haiti {
  public static void main(String[] args) {
  
  System.out.println("----------------------" +
                     "\nHow Haitian Are You?\uD83C\uDDED\uD83C\uDDF9 " +
                     "\n---------------------");


  // actual prompts/questions(consisted of arrays)

    // question 1
String[] q1 = {"1:" +
        "\nif you are ever told the phrase,(W'ap Kon Jeorge), have you ever asked yourself,(who is jeorge)?:" +
        "\n(a)who is jeorge?" +
        "\n(b)no sirrr"};
    // question 2
String[] q2 = {"2:" +
        "\nWhat do you think will happen if you point your finger at a rainbow?:" +
        "\n(a)finger will be chopped off" +
        "\n(b)nothing"};
    // question 3
String[] q3 = {"3:" +
        "\nif you're sick, which would you most likely take:" +
        "\n(a)tea,lwil maskerti, prayers, vaporub" +
        "\n(b)Tylenol,  cough syrup, and other medicine from cvs and rite aid" +
        "\n(c)the doctor "};
    // question 4
String[] q4 = {"4:" +
        "\n What are the 3 L's(Lakay,L'ecole,Leglize), mean in english:" +
        "\n(a)House,School,Church" +
        "\n(b)Love,Live, Learn" +
        "\n(c)Liked,Learn,Lacked" +
        "\n(d)House,Job, Family"};
    // question 5
String[] q5 = {"5:" +
        "\nHave you evered gone to a sleepover?:" +
        "\n(a)yes or (b)no"};
    // question 6
String[] q6 = {"6:" +
        "\nHow do you say (cereal) in creole/french:" +
        "\n(a)Cèrèale\n" +
        "(b)Cornflakes\n" +
        "(c)Captain Crunch\n" +
        "(d)Cheerios \n"};
    // question 7
String[] q7 = {"7:" +
        "\nHow do you say \"tattoo\" in creole/french:" +
        "\n(a)vagabond\n" +
        "(b)tatouage\n" +
        "(c)mwen pas konnen\n"};
    // question 8
String[] q8 = {"8:" +
        "\nLets say you have a flight to either haiti or florida(particularly Orlando,Miami, or West Palm Beach): " +
        "\nand you have a 1pm flight.  What time will you actually get to the airport?" +
        "\n(a)11-12PM:As long as the lines and security aren't that bad, i dont see it as a big deal\n" +
        "\n" +
        "(b)9-10AM: Not to early, but not to bad either\n" +
        "\n" +
        "(c)Anytime before 8am even though my flight is at 1pm, and the terminal i am currently at is pretty much empty\n"};
    // question 9
String[] q9 = {"9:" +
        "\nYou and your friends have decided to go on a trip to the waterpark, the movies, and brought up the discussion of going to Montreal for the weekend. " +
        "\n However, right as you're in the middle of packing, " +
        "\nyou're mother comes bursting into the room, and says the following:(I had the dream last night......)" +
        "\nIn this case, do you.......:" +
        "(a)Continue packing and listen to your mother's dream\n" +
        "\n" +
        "(b)Ask her about what happened in the dream\n" +
        "\n" +
        "(c)Realize what this means, and cancel all the plans for your day-WEEKEND- AND MONTH"};
//  // question 10
String[] q10 = {"You're at a haitian dinner/party, and you take your food(some diri john djon ak lambi, et bannann peze \uD83E\uDD24 \uD83D\uDE0B ), " +
        "\nand than your grandma or your mom tells you to take more food." +
        "\nDo you........." +
        "\n(a)take more and accept her demand\n" +
        "\n" +
        "(b)deny and have to realize the story of how your grandmother/mother talk to you about how they ended up in the US or Canada"};
    // question 11
String[] q11 = {"11:Final Question:" +
        "\nIf you were offered to choose between a BMW, Lexus, or a toyota, which would you pick?:" +
        "\n(a)BMW\n" +
        "\n" +
        "(b)Lexus\n" +
        "\n" +
        "(c)Toyota\n"};

  // questions and their answers
    //   This array consist of the questions(the prompts from questions.java) and their answers based on the questions
  questions [] Question = {
          new questions(q1,"a"),
          new questions(q2,"b"),
          new questions(q3,"a"),
          new questions(q4,"a"),
          new questions(q5,"b"),
          new questions(q6,"b"),
          new questions(q7,"a"),
          new questions(q8,"c"),
          new questions(q9,"c"),
          new questions(q10,"a"),
          new questions(q11,"c")};


    }
  
  }


