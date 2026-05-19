package com.ss.model;

public class Student {
String name;
int age;
Double marks;
int rank;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public Double getMarks() {
	return marks;
}
public void setMarks(Double marks) {
	this.marks = marks;
}
public int getRank() {
	return rank;
}
public void setRank(int rank) {
	this.rank = rank;
}
public Student(String name, int age, Double marks, int rank) {
	super();
	this.name = name;
	this.age = age;
	this.marks = marks;
	this.rank = rank;
}

}
