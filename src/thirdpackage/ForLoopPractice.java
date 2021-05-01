package thirdpackage;

public class ForLoopPractice {

    //psvm
    public static void main(String[] args) {
        //sout
        //java print me i love java 10 times
        //start counting from 0
        //keep counting till 9
        // increment the numbers everytime --> i++ decrement --> i--
        //for everytime print i love java

        //for loop
      for(int i=0;i<10;i++) {
            System.out.println("I love java" +i);
        }
        //keyword(startingPoint;endingPoint;increment){--> body starts
        // body
        //}-->body ends

        //for loop --> decrement
        for(int i=10;i>0;i--) {
            System.out.println("I love python" +i);
        }
        for(int i=0;i>-5;i--) {
           System.out.println("I love selenium" +i);
       }

        //print java 10 times
        //for each times of java, print selenium 2 times

        //inner for loop
       for(int i=0;i<10;i++){
            //System.out.println("java" +i);
            for(int j=0;j<2;j++) {
                System.out.println("selenium");


                //conditional for loop
                //count till 10, if the number is 5, print java, if the number is 6 print selenium
                //for the rest, print python

                for (int x = 0; x < 10; x++) {

                    if (x == 5) {
                        System.out.println("java");
                    } else if (x == 6) {
                        System.out.println("selenium");
                    } else {
                        System.out.println("python");
                            }
                        }

                    }
                }
            }


        }








