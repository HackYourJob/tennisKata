public interface GameScore {
    GameScore nextScore(Player player);

    String getScore();
}
