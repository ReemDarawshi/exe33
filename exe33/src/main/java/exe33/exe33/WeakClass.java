package exe33.exe33;

/*Reem Darawshi 211705181
Jeries Ghattas 31581651*/


public class WeakClass {

	public int weakMethod2(int a, int b) {
	    int result = 0;

	    if (a > 0) { 
	        // בכוונה לא בודקים את b != 0 כדי לאפשר חלוקה באפס במקרים מסוימים
	        result = 100 / b; // עלול לגרום ל-ArithmeticException
	    } else {
	        result = a + b; // מסלול בטוח
	    }

	    if (b > 0) {
	        result += 10;
	    } else {
	        result -= 5;
	    }

	    return result;
	}}

