package lotto;

import java.util.Arrays;

public enum Reward {
    FIRST(6,2000000000),
    SECOND(5,30000000),
    THIRD(5,1500000),
    FOURTH(4,50000),
    FIFTH(3,5000),
    MISS(0,0);

    private final long score;
    private final long amount;

    Reward(int score, int amount) {
        this.score = score;
        this.amount = amount;
    }

    public static long amountOfReward(Reward reward) {
        return reward.amount ;
    }

    public static long scoreOfReward(Reward reward) {
        return reward.score;
    }

    public static Reward rewardOfScore(long score, boolean isMatchingBonusNumber) {

        return Arrays.stream(Reward.values())
                .filter(reward -> (reward.score == score && isMatchingBonusNumber)
                        || (!reward.equals(SECOND) && reward.score == score))
                .findFirst()
                .orElse(Reward.MISS);

    }


}
