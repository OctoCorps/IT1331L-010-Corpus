// Neil Corpus
package com.it1311l.uap.simplespringbootapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.ArrayList;

@RestController
public class sortInteger {

	@GetMapping("/sort")
	public List<Integer> sort_Integer() {
		int[] arr = {3, 10, 8, 9, 2, 2, 8, 10, 2, 3};

		  for (int i = 0; i < arr.length - 1; i++) {
		    for (int j = 0; j < arr.length - i - 1; j++) {
		      if (arr[j] < arr[j + 1]) {
		        int temp = arr[j];
		        arr[j] = arr[j + 1];
		        arr[j + 1] = temp;
		      }
		    }
		  }

		 
		  List<Integer> sortedList = new ArrayList<>();
		  for (int i = 0; i < arr.length; i++) {
		    sortedList.add(arr[i]);
		  }
		  return sortedList;
	}
	
}
	
