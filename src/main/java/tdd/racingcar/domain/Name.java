package tdd.racingcar.domain;

public class Name {
	private static final int MAX_LENGTH = 5;

	private final String name;

	public Name(final String name) {
		validate(name);
		this.name = name;
	}

	private void validate(final String name) {
		if (name.length() > MAX_LENGTH) {
			throw new IllegalArgumentException("이름은 최대 5자까지 가능합니다.");
		}
	}

	public String getValue() {
		return name;
	}
}
