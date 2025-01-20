public class Palindrome{
	
	public  static boolean palindrome(int digits){
		int actual = digits;
		int remainingValue = 0;
		int reversedCheck = 0;
		while(digits != 0){
			  remainingValue = digits % 10;
			reversedCheck == reversedCheck * 10 + remainingValue;
			digits /= 10;
		}
		
		return actual = remainingValue;
	
	}
	
	    //public static boolean isPalindrome(int num) {
       // int reversed = 0;
       // int original = num;

       // while (num != 0) {
         //   int remainder = num % 10;
           // reversed = reversed * 10 + remainder;
           // num /= 10;
        //}

       // return original == reversed;
    //}
//}


	public static void main(String[] args){
		System.out.println(palindrome(12121));
	}
}