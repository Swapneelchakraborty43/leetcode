package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class CarFleet {
	 private static class Car {
	        public int position;
	        public int speed;

	        public Car(int position, int speed) {
	            this.position = position;
	            this.speed = speed;
	        }
	 }

	public static int carFleet(int target, int[] position, int[] speed) {
// takes lot of time to execute
//		SortedMap<Integer, Integer> mp = new TreeMap<>(Collections.reverseOrder());
//		ArrayList<Float> arr = new ArrayList();
//
//		for (int i = 0; i < position.length; i++) {
//			mp.put(position[i], speed[i]);
//		}
//		//System.out.println(mp);
//
//		for (int i : mp.keySet()) {
//			float time = (float)(target - i) / mp.get(i);
//			arr.add(time);
//			System.out.println(time);
//
//			if (arr.size() >=2 && arr.get(arr.size()-1) <= arr.get(arr.size()-2)) {
//				arr.remove(arr.size()-1);
//			}
//
//			
//		}
//
//		//System.out.println(arr.size());
//		return arr.size();
		
		
// More efficient solution but need to create a user defined type for car 
		
		 int n = position.length;
	        Car[] cars = new Car[n];//array of objects

	        for (int i = 0; i < n; i++) {
	            cars[i] = new Car(position[i], speed[i]);
	        }
	        
	        	System.out.println(cars[0]);

	        Arrays.sort(cars, (x, y) -> Integer.compare(y.position, x.position));//performs object sorting

	        int fleetsCount = 0;
	        double lastCarArrivalTime = 0;

	        for (Car car : cars) {
	            double arrivalTime = (target - car.position) / (double) car.speed;

	            if (arrivalTime > lastCarArrivalTime) {
	                fleetsCount++; // new fleet formed
	                lastCarArrivalTime = arrivalTime;
	            }
	        }

	        return fleetsCount;
	        
	        

	}

	public static void main(String[] args) {

		int target = 100;
		int position[] = {0,2,4 };
		int speed[] = { 4,2,1};
		int carFleet = carFleet(target, position, speed);
		System.out.println(carFleet);
	}

}

