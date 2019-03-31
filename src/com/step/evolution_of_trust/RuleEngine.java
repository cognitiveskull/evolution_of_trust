package com.step.evolution_of_trust;

class RuleEngine {

    Record getResult(int round, Playable player1, Playable player2) {
        Moves move1 = player1.getMove();
        Moves move2 = player2.getMove();
        int player1Score = -1;
        int player2Score = 3;

        if (move1 == Moves.CHEAT && move1 == move2) {
            player1Score = 0;
            player2Score = 0;
        }
        if (move1 == Moves.COOPERATE && move1 == move2) {
            player1Score = 2;
            player2Score = 2;
        }
        if (move1 == Moves.CHEAT) {
            player1Score = 3;
            player2Score = -1;
        }
        player1.updateScore(player1Score);
        player2.updateScore(player2Score);

        return new Record(round, player1.getScore(), player2.getScore());
    }
}
