import javax.swing.JOptionPane;

//October 12, 2017
public class ArrayChallenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] randomArray = {5, 6, 9, 4, 1, 2, 8, 3, 10};
		int length = randomArray.length;
		int numbers1to10wout1;
		//int sum1;
		int sum = 0;
		for (int i = 0; i < length; i++ ) {
			//int sum1 = 0;
			//int sum;
			sum = sum + randomArray[i];
		}	
		int missingNum = 55 - sum;
			
		JOptionPane.showMessageDialog(null, "Your missing number is: " + missingNum);	
		
		//JOptionPane.showMessageDialog(null, sum);

	}

}
