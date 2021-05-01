package mentorpackage;

public class LoopMentorPractice {

    public static void main(String[] args) {
        //System.out.println("I love NYC ");
        //java print me i love nyc 10 times
        // start counting from 0
        //keep counting till 9
        // increment the numbers everytime--> i++ decrement i--
        //print NYC 10 times
        // for each times of NYC, print NJ 2 times.

        //count till 10, if the number is 6, print NY,
        //if the number is 7 print NJ
        //for the rest, print USA

        for(int i=0;i<10;i++){
            if(i==6){
                System.out.println("NY");
            }else if(i==7){
                System.out.println("NJ");

            }else{
                System.out.println("USA");
            }
        }




    }
}