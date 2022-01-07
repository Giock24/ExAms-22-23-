package ex2016.a01.t2.e1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class VectorBuilderImpl<X> implements VectorBuilder<X> {

	private List<X> list;
	private boolean built = false;
	
	/* Constructor Builder without args on entry */
	public VectorBuilderImpl() {
		list = new ArrayList<>();
	}
	
	@Override
	public void addElement(X x) {
		list.add(x);
	}

	@Override
	public void removeElement(int position) {
		list.remove(position);
	}

	@Override
	public void reverse() {
		Collections.reverse(list);
	}

	@Override
	public void clear() {
		list = new ArrayList<>();
	}
	
	/*
	public List<X> getList() {
		return list;
	}
	*/

	@Override
	public Optional<Vector<X>> build() {
		if (!this.built) {
			this.built = true;
			// i passed on input a copy of this.list 
			return Optional.of(new VectorImpl<X>(this.list.stream().collect(Collectors.toList())));
		} else {
			return Optional.empty();
		}
	}

	@Override
	public Optional<Vector<X>> buildWithFilter(Filter<X> filter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <Y> VectorBuilder<Y> mapToNewBuilder(Mapper<X, Y> mapper) {
		// TODO Auto-generated method stub
		return null;
	}

}
