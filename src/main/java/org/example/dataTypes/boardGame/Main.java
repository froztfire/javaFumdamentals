package org.example.dataTypes.boardGame;

import java.util.Arrays;

public class Main {
    public static BoardGame[] collection = new BoardGame[5];
    public static void main(String[] args) {
    BoardGame chess = new BoardGame();
    chess.name = "Chess";
    collection[0] = chess;

    BoardGame snakeAndLadders = new BoardGame();
    snakeAndLadders.name = "Snakes and Ladders";
    collection[1] = snakeAndLadders;

    BoardGame scythe = new BoardGame();
    scythe.name = "Scythe";
    collection[2] = scythe;

    BoardGame smallWorld = new BoardGame();
    smallWorld.name = "Small World";
    collection[3] = smallWorld;

    BoardGame waveLength = new BoardGame();
    waveLength.name = "Wave Length";
    collection[4] = waveLength;

    System.out.println(Arrays.toString(collection) + "\n");
    }
}
