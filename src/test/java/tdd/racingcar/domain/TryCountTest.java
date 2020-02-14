package tdd.racingcar.domain;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TryCountTest {
	private static final int ZERO_INPUT = 0;

	@Test
	@DisplayName("횟수가 0이하일 때 예외 발생 테스트")
	void testInvalidTryCount() {
		assertThatIllegalArgumentException().isThrownBy(() ->
				new TryCount(ZERO_INPUT))
				.withMessage("횟수는 1이상 이어야 합니다.");
	}

	@Test
	void next() {
		TryCount tryCount = new TryCount(2);
		tryCount.next();
		final int actual = tryCount.next();
		final int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void hasNext() {
		TryCount tryCount = new TryCount(2);
		assertTrue(tryCount.hasNext());
		tryCount.next();
		assertTrue(tryCount.hasNext());
		tryCount.next();
		assertFalse(tryCount.hasNext());
	}
}
