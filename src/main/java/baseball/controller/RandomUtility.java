package baseball.controller;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomUtility {
    private static final int BASEBALL_NUMBER_LENGTH = 3;
    private static final int BASEBALL_RANDOM_NUMBER_RANGE_START = 1;
    private static final int BASEBALL_RANDOM_NUMBER_RANGE_END = 9;

    public int[] generateRandomNumbers() {
        int[] randomNumbers = new int[BASEBALL_NUMBER_LENGTH];

        for (int i = 0; i < BASEBALL_NUMBER_LENGTH; i++) {
            randomNumbers[i] = generateRandomNumber(randomNumbers);
        }

        return randomNumbers;
    }

    private int generateRandomNumber(int[] randomNumbers) {
        while (true) {
            int randomNumber = Randoms.pickNumberInRange(BASEBALL_RANDOM_NUMBER_RANGE_START, BASEBALL_RANDOM_NUMBER_RANGE_END);
            
            if (isDiffNumber(randomNumbers, randomNumber)) {
                return randomNumber;
            }
        }
    }

    private boolean isDiffNumber(int[] randomNumbers, int randomNumber) {
        for (int num : randomNumbers) {
            if (num == randomNumber) {
                return false;
            }
        }
        return true;
    }
}