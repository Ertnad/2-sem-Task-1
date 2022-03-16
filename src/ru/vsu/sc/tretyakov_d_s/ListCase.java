package ru.vsu.sc.tretyakov_d_s;

import java.util.ArrayList;

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

	public ArrayList<T> getRepetitiveElements() {

		if(firstList == null && secondList == null) {
			return null;
		}
		else if(firstList == null || secondList == null) {
			return null;
		}

		ArrayList<T> list1 = new ArrayList<>(getFirstList());
		ArrayList<T> list2 = new ArrayList<>(getSecondList());
		ArrayList<T> listRepetitiveElements = new ArrayList<>();



		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				for (int k = 0; k < listRepetitiveElements.size(); k++) {
					if (listRepetitiveElements.get(k) == list2.get(j)) {
						list2.remove(j);
						j--;
					}
				}

				if (list1.get(i) == list2.get(j)) {
					listRepetitiveElements.add(list1.get(i));
					list2.remove(j);
					if (j != 0) j--;
				}
			}
		}

		return listRepetitiveElements;
	}

	public ArrayList<T> createAListOfElementsFromTheFirstListOnly () {

		ArrayList<T> list1 = new ArrayList<>(getFirstList());
		ArrayList<T> list2 = new ArrayList<>(getRepetitiveElements());

		for (int i = 0; i < list2.size(); i++) {
			for (int j = 0; j < list1.size(); j++) {
				if (list1.get(j) == list2.get(i)) {
					list1.remove(j);
					if (j != 0) j--;
				}
			}
		}


		return new ArrayList<>(list1);
	}

	public ArrayList<T> createAListOfElementsFromTheSecondListOnly () {

		ArrayList<T> list1 = new ArrayList<>(getRepetitiveElements());
		ArrayList<T> list2 = new ArrayList<>(getSecondList());

		for (int i = 0; i < list1.size(); i++) {
			for (int j = 0; j < list2.size(); j++) {
				if (list2.get(j) == list1.get(i)) {
					list2.remove(j);
					if (j != 0) j--;
				}
			}
		}


		return new ArrayList<>(list2);
	}

}