package ru.vsu.sc.tretyakov_d_s;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ListCase<T> {

	private final ArrayList<T> firstList;
	private final ArrayList<T> secondList;

	public ListCase (ArrayList<T> firstList,ArrayList<T> secondList) {
		this.firstList = firstList;
		this.secondList = secondList;
	}

	public ArrayList<T> getFirstList () {
		return firstList;
	}

	public ArrayList<T> getSecondList () {
		return secondList;
	}

	public ArrayList<T> createAListOfRepeatingElementsInTwoLists () {

		if(firstList == null && secondList == null) {
			return null;
		}
		else if(firstList == null || secondList == null) {
			return null;
		}
		if (firstList.size() != secondList.size()) {
			return null;
		}

		ArrayList<T> listWithSimilarElements = new ArrayList<>(getFirstList());
		listWithSimilarElements.retainAll(getSecondList());

		return (ArrayList<T>) listWithSimilarElements.stream().distinct().collect(Collectors.toList());
	}

	public ArrayList<T> createAListOfElementsFromTheFirstListOnly () {
		ArrayList<T> listWithElenentsThatOccerOnlyInTheFirstList = new ArrayList<>(getFirstList());
		ArrayList<T> list2 = new ArrayList<>(getSecondList());

		list2.retainAll(listWithElenentsThatOccerOnlyInTheFirstList);
		listWithElenentsThatOccerOnlyInTheFirstList.removeAll(list2);

		return listWithElenentsThatOccerOnlyInTheFirstList;
	}

	public ArrayList<T> createAListOfElementsFromTheSecondListOnly () {
		ArrayList<T> listWithElenentsThatOccerOnlyInTheSecondList = new ArrayList<>(getSecondList());
		ArrayList<T> list1 = new ArrayList<>(getFirstList());

		list1.retainAll(listWithElenentsThatOccerOnlyInTheSecondList);
		listWithElenentsThatOccerOnlyInTheSecondList.removeAll(list1);

		return listWithElenentsThatOccerOnlyInTheSecondList;
	}

}