public class GameLogic {
    private int wins = 0;
    private int losses = 0;
    private int ties = 0;

    public String play(String playerChoice){
        String[] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice = choices[(int) (Math.random()*3)];
        String result;

        if (playerChoice.equals(computerChoice)){
            result = "Its a Tie!";
            ties ++;
        } else if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                 (playerChoice.equals("Scissors") && computerChoice.equals("Paper")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock"))) {
            result = "YOU WIN!";
            wins ++;
        } else {
            result = "You Loose!";
            losses ++;
        }
        return "You chose " + playerChoice + " Computer chose " + computerChoice + "\n" + result;

    }
    public int getWins(){
        return wins;
    }
    public int getLosses(){
        return losses;
    }
    public int getTies(){
        return ties;
    }

}
