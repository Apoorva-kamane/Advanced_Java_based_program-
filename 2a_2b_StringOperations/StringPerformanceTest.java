package lab_2;

public class StringPerformanceTest {
	    public static void main(String[] args) {
	        int iterations = 10000;
	        String text = "AIET";

	        // StringBuffer test (thread-safe, slower)
	        long startBuffer = System.nanoTime();
	        StringBuffer stringBuffer = new StringBuffer();
	        for (int i = 0; i < iterations; i++) {
	            stringBuffer.append(text);
	        }
	        long endBuffer = System.nanoTime();
	        long timeBuffer = endBuffer - startBuffer;
	        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");

	        // StringBuilder test (non-thread-safe, faster)
	        long startBuilder = System.nanoTime();
	        StringBuilder stringBuilder = new StringBuilder();
	        for (int i = 0; i < iterations; i++) {
	            stringBuilder.append(text);
	        }
	        long endBuilder = System.nanoTime();
	        long timeBuilder = endBuilder - startBuilder;
	        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

	        // Compare
	        if (timeBuilder < timeBuffer) {
	            System.out.println("StringBuilder is faster than StringBuffer.");
	        } else {
	            System.out.println("StringBuffer is faster than StringBuilder.");
	        }
	    }
	


}
