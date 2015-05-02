
class Fft02 {

	public static void main(String[] args) {

		// Instantiate an object that will implement
		// the processes used in an FFT, but not in
		// the order required by an FFT algorithm.
		Transform transform = new Transform();

		// Prepare the input data and the output
		// arrays for Case A. Note that for this
		// case, the input complex series contains
		// non-zero values only in the real part.
		// Also, most of the values in the real part
		// are zero.
		System.out.println("Case A");
		double[] realInA = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		double[] imagInA = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		double[] realOutA = new double[16];
		double[] imagOutA = new double[16];

		// Perform the transform and display the
		// transformed results for the original
		// complex series.
		transform.doIt(realInA, imagInA, 2.0, realOutA, imagOutA);
		display(realOutA, imagOutA);

		// Process and display the results for Case B.
		// Note that the input complex series
		// contains non-zero values in both the real
		// and imaginary parts. However, most of the
		// values in the real and imaginary parts are
		// zero.
		System.out.println("\nCase B");
		double[] realInB = { 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1 };
		double[] imagInB = { 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1 };

		double[] realOutB = new double[16];
		double[] imagOutB = new double[16];

		transform.doIt(realInB, imagInB, 2.0, realOutB, imagOutB);
		display(realOutB, imagOutB);

		// Process and display the results for Case C.
		// Note that the input complex series
		// contains non-zero values in both the real
		// and imaginary parts. In addition, very
		// few of the values in the complex series
		// have a value of zero. (The values of the
		// complex samples actually describe a cosine
		// curve and a sine curve.)
		System.out.println("\nCase C");
		double[] realInC = { 1.0, 0.923, 0.707, 0.382, 0.0, -0.382, -0.707,
				-0.923, -1.0, -0.923, -0.707, -0.382, 0.0, 0.382, 0.707, 0.923 };
		double[] imagInC = { 0.0, -0.382, -0.707, -0.923, -1.0, -0.923, -0.707,
				-0.382, 0.0, 0.382, 0.707, 0.923, 1.0, 0.923, 0.707, 0.382 };

		double[] realOutC = new double[16];
		double[] imagOutC = new double[16];

		transform.doIt(realInC, imagInC, 16.0, realOutC, imagOutC);
		display(realOutC, imagOutC);

	}

	// The purpose of this method is to display
	// a real series and an imaginary series,
	// each contained in an incoming array object
	// of type double. The double values are
	// truncated to no more than four digits
	// before displaying them. Then they are
	// displayed on a single line.
	static void display(double[] real, double[] imag) {
		System.out.println("Real: ");
		for (int cnt = 0; cnt < real.length; cnt++) {
			System.out.print(((int) (1000.0 * real[cnt])) / 1000.0 + " ");
		}// end for loop
		System.out.println();

		System.out.println("imag: ");
		for (int cnt = 0; cnt < imag.length; cnt++) {
			System.out.print(((int) (1000.0 * imag[cnt])) / 1000.0 + " ");
		}// end for loop
		System.out.println();
	}// end display

}