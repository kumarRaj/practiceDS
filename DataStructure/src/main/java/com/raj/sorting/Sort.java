package com.raj.sorting;

import java.util.*;
class Sort {
    public void bubble(List<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = 0; j < list.size()-i-1; j++) {
                if (list.get(j) > list.get(j+1)){
                    swap(list, j+1, j);
                }
            }
        }
    }

    public void insertion(LinkedList<Integer> list) {
        // Run loop from 1 to n
        for(int i=1; i < list.size(); i++){
            // Run loop from 0 to i - 1
            for(int j=0;j<=i-1;j++){
                // if selected element is less than any element in the inside loop
                if(list.get(i) < list.get(j)){
                    //insert at index of the element that is greater
                    list.add(j, list.get(i));
                    // remove element from original position
                    list.remove(i+1);
                    break;
                }
            }
        }
    }



    private List<Integer> merge(List<Integer> list_1, List<Integer> list_2) {
		int c1 = 0, c2 = 0;
	    List<Integer> mergedList = new ArrayList<Integer>();
	    while(c1 < list_1.size() || c2 < list_2.size()) {
	    	if(c2 < list_2.size())
	        	insertElementInArray(mergedList,list_2.get(c2++));
	    	if(c1 < list_1.size())
	        	insertElementInArray(mergedList,list_1.get(c1++));
	    }
	    return mergedList;
	}
    
    private void insertElementInArray(List<Integer> list, Integer value_to_insert){
        if(list.isEmpty()){
            list.add(value_to_insert);
            return;
        }
        if(list.get(0)>value_to_insert){
                list.add(0,value_to_insert);
                return;
        }
        for(int i=list.size()-1;i>=0;i--){
            if(list.get(i)<value_to_insert){
                list.add(i+1,value_to_insert);
                return;
            }
        }
    }

    private void swap(List<Integer> list, int i,  int j){
        int temp;
        temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    private static Queue<Integer> sortQueue(Queue<Integer> unsortedQueue){
        return null;
    } 

    public static void main(String[] args) {
        Sort sorter = new Sort();
        List list = Arrays.asList(12, 2,1,3, 12);
        sorter.bubble(list);
        System.out.println("Bubble Sort Result : "+list);
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.addAll(Arrays.asList(12,2,1,3));
        sorter.insertion(list1);
        System.out.println("Insertion Sort Result : "+list1);
        List list3 = Arrays.asList(12, 2,1,3, 9);
        List list4 = Arrays.asList(13, 4,5,39, 11);
        //sorter.merge(list3,list4);
        System.out.println("Merge Sort Result : "+sorter.merge(list3,list4));

        Queue<Integer> unsortedQueue = new LinkedList<>(Arrays.asList(12, 2,1,3, 12));
        sortQueue(unsortedQueue);

    }
}
