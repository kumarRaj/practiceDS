package com.sunandan.permutation;


import java.util.*;

class CoinChangeProblem {
	public List<List<Integer>> getDenomination(List<Integer> coinDenominations, int finalCoinAmount) {
		List<List<Integer>> resultList = new ArrayList<>();
		for (Integer coinValue : coinDenominations) {
		    List<Integer> combinations = new ArrayList<>();
		    if (coinValue > finalCoinAmount){
		        return resultList;
            }
		    if(coinValue == finalCoinAmount){
                resultList.addAll(new ArrayList<>(Collections.singletonList(new ArrayList<>(Collections.singletonList(coinValue)))));
                return resultList;
            }
		    combinations.add(coinValue);
            List<List<Integer>> intermediateCombinations = getDenomination(coinDenominations, finalCoinAmount - coinValue);
		    for (List<Integer> intermediate : intermediateCombinations){
		        intermediate.addAll(combinations);
            }
		    resultList.addAll(intermediateCombinations);

		}
		return resultList;
	}
}
