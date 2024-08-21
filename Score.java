public class Score {
    public static void main(String[] args){
        byte score = 86;
        if (score >= 90){
            System.out.println("Congrats! You got an A!");
        }else if(score >= 80){
            System.out.println("Yeah! You got a B!");
        }else if(score >= 70){
            System.out.println("Ok! You got a C!");
        }else if(score >= 60){
            System.out.println("You got a D. Better luck next time.!");
        }else{
            System.out.println("You got a F. It's summer school for you!");
        }
        
    }
}
