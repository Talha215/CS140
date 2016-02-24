package assignment04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class TownList implements List<Town>{
	private ArrayList<Town> list = new ArrayList<>();

	public boolean add(Town e){
		if(e == null || list.contains(e))
			return false;
		list.add(e);
		return true;
	}
	public void add(int index, Town element) {
		if(element != null && (!list.contains(element) && index <= list.size()))
			list.add(index, element);
	}
	public boolean addAll(Collection<? extends Town> c) {
		int oldSize = list.size();
		for(Town t: c)
			if(t != null)
				add(t);
		return list.size() > oldSize;
	}
	
	public boolean addAll(int index, Collection<? extends Town> c) {
		int oldSize = list.size();
		
		int size1 = oldSize;
		for(Town t: c)
		{		
			if(t != null)
				add(index, t);
			if(list.size() > size1)
			{
				index++;
				size1 = list.size();
			}
		}
		return list.size() > oldSize;
	}
	public void clear() {
		list.clear();
	}
	public Object clone() {
		return list.clone();
	}
	public boolean contains(Object o) {
		return list.contains(o);
	}
	public boolean containsAll(Collection<?> c) {
		return list.containsAll(c);
	}
	public void ensureCapacity(int minCapacity) {
		list.ensureCapacity(minCapacity);
	}
	public boolean equals(Object o) {
		return list.equals(o);
	}
	public void forEach(Consumer<? super Town> action) {
		list.forEach(action);
	}
	public Town get(int index) {
		return list.get(index);
	}
	public int hashCode() {
		return list.hashCode();
	}
	public int indexOf(Object o) {
		return list.indexOf(o);
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public Iterator<Town> iterator() {
		return list.iterator();
	}
	public int lastIndexOf(Object o) {
		return list.lastIndexOf(o);
	}
	public ListIterator<Town> listIterator() {
		return list.listIterator();
	}
	public ListIterator<Town> listIterator(int index) {
		return list.listIterator(index);
	}
	public Town remove(int index) {
		return list.remove(index);
	}
	public boolean remove(Object o) {
		return list.remove(o);
	}
	public boolean removeAll(Collection<?> c) {
		return list.removeAll(c);
	}
	public boolean removeIf(Predicate<? super Town> filter) {
		return list.removeIf(filter);
	}
	public void replaceAll(UnaryOperator<Town> operator) {
		list.replaceAll(operator);
	}
	public boolean retainAll(Collection<?> c) {
		return list.retainAll(c);
	}
	public Town set(int index, Town element) {
		return list.set(index, element);
	}
	public int size() {
		return list.size();
	}
	public void sort(Comparator<? super Town> c) {
		list.sort(c);
	}
	public Spliterator<Town> spliterator() {
		return list.spliterator();
	}
	public List<Town> subList(int fromIndex, int toIndex) {
		return list.subList(fromIndex, toIndex);
	}
	public Object[] toArray() {
		return list.toArray();
	}
	public <T> T[] toArray(T[] a) {
		return list.toArray(a);
	}
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		
		for(int i = 0; i < list.size() - 1; i++){
			sb.append(list.get(i).toString());
			sb.append("; ");
		}
		sb.append(list.get(list.size() - 1).toString());
		sb.append(']');
		
		return sb.toString();
	}
	public void trimToSize() {
		list.trimToSize();
	}
}