public class Game {
    String name;
    int space;
    int sLeft;

    Game (String n, int s){
        name = n;
        space = s;
    }
} 

class Desktop{
    static int userCount = 0;
    static int storage = 512;
    static int gameCount = 0;
    static Game[] games = new Game[3];
    static int maxGames = 3;
    String name;
    int id;

    static void resize(int newSize) {
        Game [] games2 = new Game[newSize];
        for(int i = 0; i < gameCount; i++)
        {
            games2[i] = games[i];
        }
        maxGames = newSize;
    }


    Desktop(String n){
        name = n;
        userCount++;
        id = userCount;
        System.out.println(name + "(ID: "+id+") logged in!");
        
    }
    public void installGame(Game g){
        if (storage < g.space)
            System.out.println("Not enough storage!");
        else if (gameCount >= maxGames){
            System.out.println("Cannot install more than 3 games!");
        else{

            games[gameCount] = g;
            gameCount++;
            System.out.println("Cannot install more than 3 games!");
        }


        }

        }

    }
    public static void displayInfo(){

    }
}