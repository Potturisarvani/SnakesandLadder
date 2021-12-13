class Main{
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter board size");
        int boardsize=sc.nextInt();
        sc.nextLine();

        HashMap<Integer,Integer> Snakepostions = new HashMap<>();
        System.out.println("Enter no of Snakes");
        int noofsnakes = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noofsnakes;i++){
            String [] d=sc.nextLine().split(" ");
            Snakepostions.put(Integer.parseInt(d[0]),Integer.parseInt(d[1]));
            //sc.nextLine();
        }
        System.out.println(Snakepostions);

        HashMap<Integer,Integer> Ladderpostions = new HashMap<>();
        System.out.println("Enter no of Ladders");
        int noofladders = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<noofladders;i++){
            String [] d1=sc.nextLine().split(" ");
            Ladderpostions.put(Integer.parseInt(d1[0]),Integer.parseInt(d1[1]));
            //sc.nextLine();
        }

        System.out.println("Enter No of Players");
        int Noofplayers=sc.nextInt();
        sc.nextLine();
        Queue<Player> playerturns=new LinkedList<>();
        for(int i=0;i<Noofplayers;i++){
            String name=sc.nextLine();
            Player p1=new Player(0,name);
            playerturns.add(p1);
        }

        Dice dice=new Dice();

         Board b=new Board(1,boardsize,dice,Snakepostions,Ladderpostions,playerturns);
         b.Startgame();
    }

}
