package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x;
        Scanner n = new Scanner(System.in);
        x= n.nextInt();
        if(x%2==0 && x!=2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
