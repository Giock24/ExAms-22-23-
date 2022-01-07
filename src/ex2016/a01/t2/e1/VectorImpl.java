package ex2016.a01.t2.e1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VectorImpl<X> implements Vector<X> {
	
	private List<X> list;
	
	protected VectorImpl(List<X> list) {
		this.list = new ArrayList<>(list);
	}

	@Override
	public Optional<X> getAtPosition(int position) {
		if (position > this.list.size() - 1 || position < 0) {
			return Optional.empty();
		} else {
			return Optional.of(this.list.get(position));
		}
	}

	@Override
	public int size() {
		return this.list.size();
	}

	@Override
	public List<X> asList() {
		return this.list.stream().collect(Collectors.toList());
	}

	@Override
	public void executeOnAllElements(Executor<X> executor) {
		this.list = this.list.stream().peek(t -> executor.execute(t)).collect(Collectors.toList());
	}

}
