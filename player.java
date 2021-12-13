class Player{
    private int playerposition;
    private String playerName;
    public Player(int playerposition,String playerName){
        this.playerposition=playerposition;
        this.playerName=playerName;
    }

    public int getPlayerpostion(){
        return playerposition;
    }

    public String getPlayername(){
        return playerName;
    }

    public void setPlayerpostion(int newpostion){
        playerposition=newpostion;
    }

}
}