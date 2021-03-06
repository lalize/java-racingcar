package tdd.racingcar.domain;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Records implements Iterable<Record> {
	private List<Record> records;

	public Records() {
		records = new LinkedList<>();
	}

	public void add(final Record record) {
		records.add(record);
	}

	@Override
	public Iterator<Record> iterator() {
		return records.iterator();
	}
}
