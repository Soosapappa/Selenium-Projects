package org.base;


public class Program {

	public static void main(String[] args) {
   int a[ ] = {67779,11,44,10,13256,490422222};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]){
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				}
			}
		}
		
			System.out.println(a[0]);
		}
		
		
        }
