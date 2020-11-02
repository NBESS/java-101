public class Magic {
	public static void main(String[] args) {
    // myNumber is the original number
    int myNumber = 20;
    // set equal to the original number multiplied by itself
	int stepOne = myNumber * myNumber;
    // Set it equal to the previous result (stepOne) plus the original number
    int stepTwo = stepOne + myNumber;
    // Set equal to the previous result (stepTwo) divided by the original number
    int stepThree = stepTwo / myNumber;
    // Set equal to the previous result (stepThree) plus 17
    int stepFour = stepThree + 17;
    // Set equal to the previous result (stepFour) minus the original number
    int stepFive = stepFour - myNumber;
    // Set equal to the previous result (stepFive) divided by 6
    int stepSix = stepFive / 6;
    // Print out the value of the last step
    System.out.println(stepSix);


	}
}