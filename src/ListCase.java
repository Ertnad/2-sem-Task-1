import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class ListCase<T> {

	private final ArrayList<T> firstList;
	private final ArrayList<T> secondList;

	public ListCase (ArrayList<T> firstList,ArrayList<T> secondList) {
		this.firstList = firstList;
		this.secondList = secondList;
	}

	public ListCase () {
		this(new ArrayList<>(), new ArrayList<>());
	}

	public ArrayList<T> getFirstList () {
		return firstList;
	}

	public ArrayList<T> getSecondList () {
		return secondList;
	}

	public <t extends Comparable<t>> ArrayList<t> checkTheListForSimilarElements (ArrayList<t> firstList,ArrayList<t> secondList) {

		if(firstList == null && secondList == null) {
			return null;
		}
		else if(firstList == null || secondList == null) {
			return null;
		}
		if (firstList.size() != secondList.size()) {
			return null;
		}

		ArrayList<t> listWithSimilarElements = new ArrayList<>(firstList);
		listWithSimilarElements.retainAll(secondList);
		Collections.sort(listWithSimilarElements);

		return (ArrayList<t>) listWithSimilarElements.stream().distinct().collect(Collectors.toList());
	}

}