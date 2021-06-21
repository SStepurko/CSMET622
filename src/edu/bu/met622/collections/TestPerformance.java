package edu.bu.met622.collections;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class TestPerformance {
	public static void main(String[] args) {
		int lim = 1000000;

		Instant startV = Instant.now();
		Vector<Integer> vector = new Vector();
		for (int i=0; i<lim; i++) {
			vector.add(i);
		}
		Instant stopV = Instant.now();
		System.out.println("--vector--->"+Duration.between(startV, stopV).getNano());
		vector = null;

		Instant startQ = Instant.now();
		ArrayDeque arrayDeque = new ArrayDeque();
		for (int k=0; k<lim; k++) {
			arrayDeque.add(k);
		}
		Instant stopQ = Instant.now();
		System.out.println("--arrayDeque--->"+Duration.between(startQ, stopQ).getNano());
		arrayDeque = null;

		Instant startA = Instant.now();
		ArrayList arrayList = new ArrayList();
		for (int j=0; j<lim; j++) {
			arrayList.add(j);
		}
		Instant stopA = Instant.now();
		System.out.println("--arraylist--->"+Duration.between(startA, stopA).getNano());
		arrayList = null;

		Instant startHM = Instant.now();
		Map<String, String> hashMap = new HashMap<>();
		for (int k=0; k<lim; k++) {
				hashMap.put(String.valueOf(k), "x"); 
		}
		Instant stopHM = Instant.now();
		System.out.println("--HashMap--->"+Duration.between(startHM, stopHM).getNano());
		hashMap = null;
		
		Instant startTM = Instant.now();
		Map<String, String> treeMap = new TreeMap<>();
		for (int k=0; k<lim; k++) {
				treeMap.put(String.valueOf(k), "x"); 
		}
		Instant stopTM = Instant.now();
		System.out.println("--TreeMap--->"+Duration.between(startTM, stopTM).getNano());
		treeMap = null;
	}
}
