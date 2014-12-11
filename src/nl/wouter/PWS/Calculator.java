package nl.wouter.PWS;

import java.util.Arrays;
import java.util.List;

/**
 * Calculator part which calculates all the statistical values based on some inputs.
 * 
 * @author Wouter Zorgdrager
 *
 */
public class Calculator {
	
	/**
	 * Inputs
	 */
	private String experimentName;
	private Float[] values;
	private Type type;
	
	/**
	 * Outputs
	 */
	private float median;
	private float mean;
	private float variance;
	private float standarddeviation;
	
	
	public Calculator(String experimentName, Float[] values, String type){
		this.experimentName = experimentName;
		this.values = values;
		
		if(type.equalsIgnoreCase("steekproef")){
			this.type = Type.SAMPLE;
		}else{
			this.type = Type.POPULATION;
		}
	}
	
	/**
	 * Calculates all the values synchronized (only 1 calculation at a time) and opens up a new window.
	 */
	public synchronized void calculate(){
		mean = calculateMean();
		median = calculateMedian();
		variance = calculateVariance();
		standarddeviation = calculateStandardDeviation();
		
		new Result(experimentName, mean, median, variance, standarddeviation, type.name()).setVisible(true);
	}
	
	/**
	 * Calculates the mean of the float array. First of all it sums up all the values and then it is divided by the amount of values.
	 * @return the mean of the array
	 */
	private float calculateMean(){
		float sum = 0F; //sigma X
		int size = values.length; //n
		
		for(int i = 0; i < values.length; i++){
			sum = sum + values[i]; //loop to sum up all the values
		}
		
		float result = sum/size; // sigma x /n
		return result;
	}
	
	/**
	 * Calculates the median. Picks the middle number of the dataset or the middle 2 numbers divided by 2. 
	 * @return
	 */
	private float calculateMedian(){
		float result = 0F;
		int length = values.length; //length of the data set
		
		sort(); //sorts the whole array
		
		if (values.length % 2 == 0) { //check if even or not
			//even
			result = (values[length/2] + values[(length/2)-1] ) / 2; //pick the middle 2 divided by 1
		}else{
			//oneven
			result = values[(length-1)/2]; //pick the middle one
			
		}
		return result;
	}
	
	/**
	 * Calculate the variance, the sum of all the squared difference to the mean divived by the amount of values or the amount of values minus 1 (sample)
	 * @return the variance
	 */
	private float calculateVariance(){
		int N = values.length; //n
		float sumDifference= 0.0F; //sum of all the differences
		
		for(int i = 0; i < values.length; i++){
			float difference = (values[i] - mean);
			
			if(difference < 0){
				//it must be postive!! so lets pick the absolute value using a library
				difference = Math.abs(difference);
			}
			
			float differenceKwadraat = difference * difference;
			
			sumDifference = differenceKwadraat + sumDifference;
		}
		
		float variance = 0F; // we must check if it is a sample or a population (because of the 'vrijheidsgraad')
		switch(type){
			case POPULATION:
				variance = sumDifference / N;
				break;
			case SAMPLE:
				variance = sumDifference / (N-1);
				break;
		}
		
		return variance;
	}
	
	/**
	 * Calculates the standard deviation based on the variance
	 * @return standard deviation
	 */
	private float calculateStandardDeviation(){
		float standardDeriv = (float) Math.sqrt(variance);
		
		return standardDeriv;
	}
	
	private void sort(){
		Arrays.sort(values);
	}
	
	public enum Type{
		POPULATION, SAMPLE;
	}

}
