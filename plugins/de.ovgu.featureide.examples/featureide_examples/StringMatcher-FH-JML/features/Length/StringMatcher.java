public class StringMatcher {
		
	/*@
	  @ requires \original;
	  @ ensures \result <==> a.length() == b.length();
	  @*/
	public boolean compare(String a, String b){
		return original(a,b) && a.length() == b.length();
	}

}