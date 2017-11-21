package com.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ItemsLib {
	 public <T> void forEach(List<T> list, Consumer<T> action) {
		 list.forEach(action);
	 }
	 
	 public <T> List<T> filter(List<T> list, Predicate <T> predicate) {
		 List<T> arr = new ArrayList<>();
		 arr.forEach(x -> {
			 if(predicate.test(x))
				 arr.add(x);
		 });

		 return arr;
	 }
	 
	 public <T, R> List <R> map(List<T> list, Function<T, R> func) {
		 List<R> list1 = new ArrayList<>();
		 list.forEach(x -> {
			 list1.add(func.apply(x));
		 });
		 
		 return list1;
	 }
}
