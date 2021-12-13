import java.util.*;
class Board{
    private Dice dice;
    private int startpoint;
    private int boardsize;
    private Map<Integer,Integer> Snakepostions;
    private Map<Integer,Integer> Ladderpostions;
    private Queue<Player> playerturns;
    public Board(int startpoint,int boardsize,Dice dice,HashMap<Integer,Integer> Snakepostions,HashMap<Integer,Integer> Ladderpostions,Queue<Player> playerturns){
        this.startpoint=startpoint;
        this.boardsize=boardsize;
        this.dice=dice;
        this.Snakepostions=Snakepostions;
        this.Ladderpostions=Ladderpostions;
        this.playerturns=playerturns;
    }

    public void Startgame(){
        int i=0;
        while(i==0){
            Player p1 = playerturns.poll();
            int previouspostion = p1.getPlayerpostion();
            int newpostion=previouspostion+dice.throwdice();
            if(newpostion==boardsize){
                System.out.println(p1.getPlayername()+"won the game");
                break;
            }
            else if(Snakepostions.containsKey(newpostion)){
                newpostion=newpostion-Snakepostions.get(newpostion);
                System.out.println(p1.getPlayername()+" moved from"+previouspostion+" to "+newpostion);
                p1.setPlayerpostion(newpostion);
            }
            else if (Ladderpostions.containsKey(newpostion)){
                newpostion=newpostion+Ladderpostions.get(newpostion);
                System.out.println(p1.getPlayername()+" moved from"+previouspostion+" to "+newpostion);
                p1.setPlayerpostion(newpostion);
            }
            else if(newpostion>boardsize){
                //newpostion=previouspostion;
                System.out.println(p1.getPlayername()+"Next time better of luck");
               // p1.setPlayerpostion(newpostion);
            }
            else{
                System.out.println(p1.getPlayername()+" moved from"+previouspostion+" to "+newpostion);
                p1.setPlayerpostion(newpostion);
            }
            playerturns.add(p1);
        }


    }

}