package com.step.evolution_of_trust;

import java.util.ArrayList;
import java.util.List;

class CoolPlayer implements Playable {
    private int lastScore = 0;
    private List<Moves> moves;

    CoolPlayer() {
        this.moves = new ArrayList<>();
    }

    @Override
    public Moves getMove(Playable player) {
        Moves move = Moves.COOPERATE;
        moves.add(move);
        return move;
    }

    @Override
    public void updateScore(int score) {
        this.lastScore += score;
    }

    @Override
    public int getScore() {
        return this.lastScore;
    }

    @Override
    public List<Moves> getMoves() {
        return this.moves;
    }
}
