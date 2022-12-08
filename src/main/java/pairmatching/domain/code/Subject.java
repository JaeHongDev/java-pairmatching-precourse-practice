package pairmatching.domain.code;

import java.util.Arrays;

public enum Subject {
    RACING("자동차경주"), LOTTO("로또"), BASEBALL("숫자야구게임"), SHOPPING("장바구니"), PAYMENT("결제"), IMPROVE_PERFORMANCE("지하철노선도"), DEPLOY("성능개선");

    private final String name;

    Subject(final String input) {
        this.name = input;
    }

    public static Subject from(final String input) {
        return Arrays.stream(values())
                .filter(subject -> subject.name.equals(input.trim()))
                .findAny()
                .orElseThrow(IllegalArgumentException::new);
    }
}