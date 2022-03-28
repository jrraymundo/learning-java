package hackerRank;

import java.util.*;

class Checker implements Comparator<Player> {

    /*
        Compare works by checking if 1st param is greater than 2nd param.
        if (a - b == 0) then they're equal, no swap
        if (a - b == 1 or greater) then a is greater than b, do swap
        if (a - b == -1 or less) then a is less than b, don't swap

        In this way, it will sort in ascending order
        Switch a and b at the return line to make it descending
     */
    public int compare(Player a, Player b) {
        int scoreComparison = b.score - a.score;

        if (scoreComparison == 0) {
            return a.name.compareTo(b.name);
        } else {
            return scoreComparison;
        }
    }
}

class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class ComparatorCheck {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

/*
5
amy 100
david 100
heraldo 50
aakansha 75
aleksa 150
 */