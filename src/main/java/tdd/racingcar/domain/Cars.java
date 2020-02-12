package tdd.racingcar.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Cars {
	private final List<Car> cars;

	public Cars(final List<Car> cars) {
		this.cars = cars;
	}

	public List<Car> getWinners() {
		final int maxPosition = getMaxPosition();
		return cars.stream()
			.filter(car -> car.isPosition(maxPosition))
			.collect(Collectors.toList());
	}

	private int getMaxPosition() {
		return cars.stream()
			.mapToInt(Car::getPosition)
			.max()
			.orElseThrow(() -> new IllegalArgumentException("차가 존재하지 않습니다."));
	}
}
