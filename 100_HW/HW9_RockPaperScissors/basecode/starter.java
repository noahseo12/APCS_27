/*
 *	Author:Noah Seo
 *  Date:10/25/26
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("Would you like to play? (yes/no/done)");
        String choice = sc.nextLine();
        if(choice.equalsIgnoreCase("yes")){
            System.out.println("Please enter rock/paper/scissors:");
            String p1role = sc.nextLine();
            String compRole = getObject();
            int result = compare2(compRole, p1role);

            if(result ==2){
                System.out.println("You won");

            }
            else if(result==1){
                System.out.println("You lost");
            }
            else{
                System.out.println("It was a tie");
            }
        }
    else if(choice.equalsIgnoreCase("no")){
        System.out.println("How many times would you like the computer to play against itself?");
        int playAgain = sc.nextInt();
        sc.nextLine();
        int count=1;
        int winCount=0;
        int tieCount=0;
        int loseCount=0;
        while(count<=playAgain){


            if(player1().equals(player2())){
                tieCount ++;
                count ++;
            }
            else if(((player1().equals("scissor")&&player2().equals("paper"))||(player1().equals("rock")&&player2().equals("scissor"))||(player1().equals("paper")&&player2().equals("rock")))){
                winCount ++;
                count++;
            }
            else{
                loseCount++;
                count++;
            }

            
        }
        System.out.println("The computer won "+winCount+" times");
        System.out.println("The computer lost "+loseCount+" times");
        System.out.println("The computer tied "+tieCount+" times");
    }
    else{
        break;
    }
    }

     
    }
       public static int compare2(String role, String choice){
            if(role.equalsIgnoreCase("scissor")&&choice.equalsIgnoreCase("paper")){
                return 1;
            }
            if(role.equalsIgnoreCase("rock")&&choice.equalsIgnoreCase("paper")){
                return 2;
            }
            if(role.equalsIgnoreCase("paper")&&choice.equalsIgnoreCase("paper")){
                return 0;
            }
            if(role.equalsIgnoreCase("scissor")&&choice.equalsIgnoreCase("rock")){
                return 2;
            }
            if(role.equalsIgnoreCase("rock")&&choice.equalsIgnoreCase("rock")){
                return 0;
            }
            if(role.equalsIgnoreCase("scissor")&&choice.equalsIgnoreCase("scissor")){
                return 0;
            }
            return 0;
       }
            
        
    public static String getObject(){
            int number = (int)(Math.random()*3+1);
               if(number == 1){
                return "rock";
               }

                else if(number == 2){
                return "paper";
               }
               else{
               return "scissor";
               }
               

        }
        public static String player1(){
            int rps = (int)(Math.random()*3)+1;
            String newChoice ="";
            if(rps == 1){
                newChoice ="scissor";
                
            }
            else if(rps == 2){
                newChoice = "paper";
            }
            else if(rps == 3){
                newChoice = "rock";
            }
            
            return newChoice;    

        }
        public static String player2(){
             int rps = (int)(Math.random()*3)+1;
            String newChoice ="";
            if(rps == 1){
                newChoice ="scissor";
                
            }
            else if(rps == 2){
                newChoice = "paper";
            }
            else if(rps == 3){
                newChoice = "rock";
            }
            
            return newChoice;    

          
}
        
}
