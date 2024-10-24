package racingcar.util;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {

    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 9;

    public int generateNumber() {
        return Randoms.pickNumberInRange(MIN_RANGE, MAX_RANGE);
    }

}