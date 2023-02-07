package com.example.practice;

public class Sample {
public static void main(String[] args) {
	int x = 100;
	int a = x++;
	int b = ++x;
	int c = x++;
	int d = (a<b)?(b<c)?a:(b<c)?b:c:b;
	System.out.println(d);
	System.out.println(a);
	
}
}
