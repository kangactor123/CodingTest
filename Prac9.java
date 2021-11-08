package com.test.codingTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class Prac9 {
	public static void main(String[] args) {
		String[] parti = {"mislav", "stanko", "mislav", "ana"};
		String[] comple = {"stanko", "ana", "mislav"};
		
		System.out.println("answer : "+solution3(parti, comple));

	}
	
	public static String solution(String[] participant, String[] completion) {
		//참가자, 완주자
		//동명이인이 있을 수 있음
		//완주자 목록에 없을 시 탈락자 리턴
		Arrays.sort(participant);
		Arrays.sort(completion);
		
		for (String str : participant) {
			System.out.print(str + " ");
		}
		System.out.println();
		for (String str : completion) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		String answer = "";
		
		for (int i = 0; i < completion.length; i++) {
			if (i == completion.length - 1 && participant[i].hashCode() == completion[i].hashCode()) {
				answer = participant[i+1];
			}
			if (participant[i].hashCode() != completion[i].hashCode()) {
				answer = participant[i];
			}
		}
		return answer;
	}
	
	public static String solution2(String[] participant, String[] completion) {
		String answer = "";
		HashMap<Integer, String> map = new HashMap<>();
		
		for (int i = 0; i < completion.length; i++) {
			map.put(completion[i].hashCode(), completion[i]);
		}
		
		for (String str : participant) {
			System.out.println(str + "의 해쉬코드 : " + str.hashCode());
		}
		
		System.out.println(" : "+map.get(participant[3].hashCode()).hashCode());
		
		for (int i = 0; i < participant.length; i++) {
			if (!map.containsKey(participant[i].hashCode())) {
				answer = participant[i];
			}
		}
		
		
		return answer;
	}
	
	public static String solution3(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		
		//map에 참가자 목록 넣었음
		for (int i = 0; i < participant.length; i++) {
			if (map.containsKey(participant[i])) {
				map.put(participant[i], map.get(participant[i])+1);
			} else {
				map.put(participant[i], 1);
			}
		}
		
		//완주자 걸러내기
		for (String str : completion) {
			System.out.println("str : " + str);
			System.out.println("get : " + map.get(str));
			if (map.containsKey(str)) {
				map.put(str, map.get(str)-1);
			}
		}
		//완주하지 못한 선수 찾아내기
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<String,Integer> entry = it.next();
			String player = entry.getKey();
			
			if (map.get(player) == 1) {
				answer = player;
			}
		}
		return answer;
	}
	
	
	
	
	
	
	
	
	
	
	

}
