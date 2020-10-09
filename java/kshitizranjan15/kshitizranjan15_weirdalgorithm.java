/*
Consider an algorithm that takes as input a positive integer n. If n is even, the algorithm divides it by two, and if n is odd, the algorithm multiplies it by three and adds one. The algorithm repeats this, until n is one. For example, the sequence for n=3 is as follows:
3→10→5→16→8→4→2→1

Your task is to simulate the execution of the algorithm for a given value of n.
//https://cses.fi/problemset/task/1068

*/
import java.util.Scanner;

	public class weirdalgorithm {

		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			long n=sc.nextLong();
			System.out.print(n+" ");
			while(n > 1)
			{
				if(n%2 == 0)
				{
					n = n/2;
					System.out.print(n+" ");
				}
				else 
				{
					n = (n*3)+1;
					System.out.print(n+" ");
				}
			}
		}

	}

//author:- kshitizranjan15 
// https://cses.fi/user/32865
