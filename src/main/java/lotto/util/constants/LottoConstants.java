package lotto.util.constants;


public final class LottoConstants {
    public static final int LOTTO_TICKET_PRICE = 1000;

    public static final int LOTTO_NUMBER_MIN = 1;
    public static final int LOTTO_NUMBER_MAX = 45;

    public static final int LOTTO_TICKET_SIZE = 6;

    public static final String ERROR_IS_NOT_SAME_LOTTO_SIZE = "[ERROR] 로또 번호의 개수는 " + LOTTO_TICKET_SIZE + "개여야 합니다.";
    public static final String ERROR_IS_NOT_SAME_RANGE_LOTTO_NUMBER =
            "[ERROR] 로또 번호의 범위는 " + LOTTO_NUMBER_MIN + " ~ " + LOTTO_NUMBER_MAX + " 사이여야 합니다.";
    public static final String ERROR_IS_NOT_UNIQUE_LOTTO_NUMBER = "[ERROR] 로또 번호는 중복되지 않는 유일한 숫자여야 합니다.";

    private LottoConstants() {

    }
}
