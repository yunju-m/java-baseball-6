package baseball.controller;

public class NumberValidator {
    public static final int BASEBALL_NUMBER_LENGTH = 3;
    private static final String WRONG_LEGNTH_NUMBER_MESSAGE = "세 자리 숫자가 아닙니다."; 
    private static final String WRONG_RANGE_NUMBER_MESSAGE = "1~9 사이의 숫자만 입력해주세요.";

    public void toValidateNumber(String inputNumber) {
        if (!isSameLength(inputNumber)) {
            throw new IllegalArgumentException(WRONG_LEGNTH_NUMBER_MESSAGE);
        } else if (!isSameRange(inputNumber)) {
            throw new IllegalArgumentException(WRONG_RANGE_NUMBER_MESSAGE);
        }
    }

    public boolean isSameLength(String inputNumber) {
        return inputNumber.length() == BASEBALL_NUMBER_LENGTH;
    }

    public boolean isSameRange(String inputNumber) {
        return inputNumber.chars().allMatch(Character::isDigit);
    }
}