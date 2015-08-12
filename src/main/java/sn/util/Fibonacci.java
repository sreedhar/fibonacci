package sn.util;

public class Fibonacci {

	/**
	 * Returns the nth Fibonacci number
	 * where 1st is 0, 2nd is 1, 3rd is 1, 4th is 2, 5th is 3 and so on...
	 * @param n where 1 <= n <= 47
	 * @return the nth fibonacci number
	 */
	public int get(int n){
		if(n<1 || n > 47){
			throw new IllegalArgumentException("Supported values of n where 1 <= n <= 47 , called with n="+n);
		}
		ReplacingPair bootPair = new ReplacingPair(0,0);
		ReplacingPair resultPair = getNthPair(n, bootPair); 
		return resultPair.getFirst();
	}
	
	private ReplacingPair getNthPair(int n , ReplacingPair pair){
		if(n == 1){
			pair.push(0);
			return pair;
		}
		if(n == 2){
			pair.push(1);
			return pair;
		}
		
		ReplacingPair previous = getNthPair(n-1 , pair);
		
		int next = previous.getFirst() + previous.getSecond();
		previous.push(next);
		return pair;
	}
	
	private static class ReplacingPair {
		private int first;
		private int second;
		
		public ReplacingPair(int first, int second){
			this.first = first;
			this.second = second;
		}
		
		public void push(int next){
			this.second = this.first;
			this.first = next;
		}
		
		public int getFirst(){
			return this.first;
		}
		
		public int getSecond(){
			return this.second;
		}
	}
}
