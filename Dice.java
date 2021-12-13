class Dice{
    public int throwdice(){
        int min=1;
        int max=6;
        int b = (int)(Math.random()*(max-min+1)+min);
        return b;  
    }
}