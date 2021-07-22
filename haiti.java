// actual class of game
import  java.util.*;
public class haiti {
  public static void main(String[] args) {



    System.out.println("    *---------------------------------------------------------------------*   " +
                     "\n                    CONTROLS/INSTRUCTIONS" +
                     "\n   *This is a typing game so use your keyboards(whether on phone or laptop*" +
                     "\n   *When answering questions, only chose whats inside (), so choose either a,b,c, or d*" +
                     "\n  *With the exception of your name, type the answer of your choice in lower case*" +
                     "\n    *-------------------------------------------------------------------*");
System.out.println();

    System.out.println("----------------------" +
            "\nHow Haitian Are You?\uD83C\uDDED\uD83C\uDDF9 " +
            "\n---------------------");


    Scanner scan = new Scanner(System.in);
    System.out.println("What is your name?:");
    String nom = scan.nextLine();
    System.out.println("Hello " + nom);
    // actual examenHaitien(Question); prompts/questions(consisted of arrays)
    // question 1
    String[] q1 = {"Question 1:" +
            "\nif you are ever told the phrase,(W'ap Kon Jeorge), have you ever asked yourself,(who is jeorge)?:" +
            "\n(a)who is jeorge?" +
            "\n(b)no sirrr"};
    // question 2
    String[] q2 = {"Question 2:" +
            "\nWhat do you think will happen if you point your finger at a rainbow?:" +
            "\n(a)finger will be chopped off" +
            "\n(b)nothing"};
    // question 3
    String[] q3 = {"Question 3:" +
            "\nif you're sick, which would you most likely take:" +
            "\n(a)tea,lwil maskerti, prayers, vaporub" +
            "\n(b)Tylenol,  cough syrup, and other medicine from cvs and rite aid" +
            "\n(c)the doctor "};
    // question 4
    String[] q4 = {"Question 4:" +
            "\n What are the 3 L's(Lakay,L'ecole,Leglize), mean in english:" +
            "\n(a)House,School,Church" +
            "\n(b)Love,Live, Learn" +
            "\n(c)Liked,Learn,Lacked" +
            "\n(d)House,Job, Family"};
    // question 5
    String[] q5 = {"Question 5:" +
            "\nHave you evered gone to a sleepover?:" +
            "\n(a)yes or (b)no"};
    // question 6
    String[] q6 = {"Question 6:" +
            "\nHow do you say (cereal) in creole/french:" +
            "\n(a)Cèrèale\n" +
            "(b)Cornflakes\n" +
            "(c)Captain Crunch\n" +
            "(d)Cheerios \n"};
    // question 7
    String[] q7 = {"Question 7:" +
            "\nHow do you say \"tattoo\" in creole/french:" +
            "\n(a)vagabond\n" +
            "(b)tatouage\n" +
            "(c)mwen pas konnen\n"};
    // question 8
    String[] q8 = {"Question 8:" +
            "\nLets say you have a flight to either haiti or florida(particularly Orlando,Miami, or West Palm Beach): " +
            "\nand you have a 1pm flight.  What time will you actually get to the airport?" +
            "\n(a)11-12PM:As long as the lines and security aren't that bad, i dont see it as a big deal\n" +
            "\n" +
            "(b)9-10AM: Not to early, but not to bad either\n" +
            "\n" +
            "(c)Anytime before 8am even though my flight is at 1pm, and the terminal i am currently at is pretty much empty\n"};
    // question 9
    String[] q9 = {"Question 9:" +
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
    String[] q10 = {"Question 10:" +
            "\nYou're at a haitian dinner/party, and you take your food(some diri john djon ak lambi, et bannann peze \uD83E\uDD24 \uD83D\uDE0B ), " +
            "\nand than your grandma or your mom tells you to take more food." +
            "\nDo you........." +
            "\n(a)take more and accept her demand\n" +
            "\n" +
            "(b)deny and have to realize the story of how your grandmother/mother talk to you about how they ended up in the US or Canada"};
    // question 11
    String[] q11 = {"Question 11:Final Question:" +
            "\nIf you were offered to choose between a BMW, Lexus, or a toyota, which would you pick?:" +
            "\n(a)BMW\n" +
            "\n" +
            "(b)Lexus\n" +
            "\n" +
            "(c)Toyota\n"};

    // questions and their answers
    //   This array consist of the questions(the prompts from questions.java) and their answers based on the questions
    questions[] Question = {
            new questions(q1, "a"),
            new questions(q2, "a"),
            new questions(q3, "a"),
            new questions(q4, "a"),
            new questions(q5, "b"),
            new questions(q6, "b"),
            new questions(q7, "a"),
            new questions(q8, "c"),
            new questions(q9, "c"),
            new questions(q10, "a"),
            new questions(q11, "c")};
    /* based off the pubic examen haitien method down below. Displays the actual quiz/test
    also allows the for loop, and allows the player's score to increase.*/
    examenHaitien(Question);
  }

  public static void  examenHaitien(questions [] Question){

// counts score(starts at 0), if player gets question correct, their score will increase by 1
    int score = 0;
    Scanner scan = new Scanner(System.in);
// for integer i which equals 0, i which is the question, which will increase by 1(i++)
    for(int i = 0; i < Question.length;i++){
      // Displays the prompt(aka the questions)
     System.out.println(Arrays.toString(Question[i].prompt));
      String correctanswer = scan.nextLine();
/* if player gets the question right, their score will increase by 1. If they dont get it correct,
Than they will see "incorrect"
 */
      if(correctanswer.equals(Question[i].answer)){
        score++;
      }else {
        System.out.println("Incorrect");
      }



    }
    System.out.println("You got,"+ score+ " out of 11");
/*  Integer variable score equals the score
the player has received.  If the player has a score greater than or equal to 8, they are considered haitian
. if the player gets a score lower than 8, they aren't.
 */
    int overall = score;
    if(overall >= 8 ){
      System.out.println("Vous Etes  Haïtien\uD83C\uDDED\uD83C\uDDF9 \uD83C\uDDED\uD83C\uDDF9\uD83D\uDCAF\uD83D\uDE24\uD83D\uDE24  ");
    }else if(overall < 8){
        System.out.println("Ou pas haitien\uD83D\uDE10\uD83D\uDE11\uD83D\uDE11\uD83D\uDE10\uD83D\uDE11\uD83D\uDE11");
    }
    }
}




