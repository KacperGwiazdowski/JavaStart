package start.pack.learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
	public static void main(String[] args)
	{
		System.out.println("Execution start...");
		
		List<Integer> MOCK_DATA_LIST = new ArrayList<Integer>(Arrays.asList(4,5,2,1,4));
		
		DataInput dataInput = new DataInput(MOCK_DATA_LIST);
		
		DataProcessor dataProcessor = new DataProcessor(dataInput);
		
		DataOutput dt1 = new DataOutput(dataInput);
		
		System.out.println("-------------------------------------");
		
		DataOutput dt2 = new DataOutput(dataProcessor);
		
		System.out.println("Execution end...");
	}
}