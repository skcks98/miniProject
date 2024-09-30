package com.project.model.dto;

import java.util.Objects;

public class SoccerPlayer {

	private String position; // 포지션
	private String name; // 이름
	private int backNumber; // 등번호
	private int age; // 나이
	private String nationality; // 국적
	
	// 기본 생성자
	public SoccerPlayer() {}

	// 매개변수 생성자
	public SoccerPlayer(String position, String name, int backNumber, int age, String nationality) {
		super();
		this.position = position;
		this.name = name;
		this.backNumber = backNumber;
		this.age = age;
		this.nationality = nationality;
	}

	
	
	
	// getter/setter
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public void setBackNumber(int backNumber) {
		this.backNumber = backNumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	// toString()
	@Override
	public String toString() {
		return " [포지션: " + "<" + position +">" + " / 이름: " + name + " / 등번호: " + backNumber + " / 나이: " + age
				+ " / 국적: " + nationality + "]";
	}

	
	// 해시
	@Override
	public int hashCode() {
		return Objects.hash(age, backNumber, name, nationality, position);
	}

	
	// 비교
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SoccerPlayer other = (SoccerPlayer) obj;
		return age == other.age && backNumber == other.backNumber && Objects.equals(name, other.name)
				&& Objects.equals(nationality, other.nationality) && Objects.equals(position, other.position);
	} 
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
