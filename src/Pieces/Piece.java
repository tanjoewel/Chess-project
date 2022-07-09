package Pieces;

import Game.Player;

/**
 * Abstract class for which all other pieces inherit from.
 */
public abstract class Piece {

    //coordinates for piece
    public int x;
    public int y;

    //which player the piece belongs to
    public Player player;
}
