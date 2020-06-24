package com.luiggy.java;

import java.math.BigDecimal;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n + 2];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				BigDecimal d1 = new BigDecimal(s[j]);
				BigDecimal d2 = new BigDecimal(s[j + 1]);

				if (d1.compareTo(d2) < 0) {

					String temp = s[j];
					s[j] = s[j + 1];
					s[j + 1] = temp;

				}
			}
		}
		// Output
		for (int i = 0; i < n; i++) {
			System.out.println(s[i]);
		}

	}

}
