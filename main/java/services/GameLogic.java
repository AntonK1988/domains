package services;

import domains.Board;

import java.util.HashMap;
import java.util.Scanner;

public class GameLogic {
    private Board board;

    GameLogic() {
        board = new Board();
    }

    private int charToInt(char c) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        return map.get(c);
    }

    private char intToChar(int i) {
        char[] literals = {'a','b','c','d','e','f','g','h'};
        return literals[i];
    }

    private boolean isMove(int preX, int preY, int x, int y) {

        return false;
    }

    private void move() {
        Scanner sc = new Scanner(System.in);
        // "a1 a4"
        String playerMove = sc.nextLine();
        int preX = charToInt(playerMove.charAt(0));
        int preY = Integer.parseInt(playerMove.substring(1,2)) - 1;

        int postX = charToInt(playerMove.charAt(3));
        int postY = Integer.parseInt(playerMove.substring(4,5)) - 1;
        // System.out.printf("pre x=%d y=%d\npost x=%d y=%d", preX, preY, postX, postY);

    }

    public static void main(String[] args) {
        GameLogic gl = new GameLogic();
        System.out.println(gl.board);
        gl.move();
    }
}
