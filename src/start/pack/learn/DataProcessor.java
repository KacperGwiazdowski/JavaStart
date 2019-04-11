package start.pack.learn;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DataProcessor implements IData {
	
	private List<DataMessage> dataList = new ArrayList<>();
	
	public DataProcessor(IData dataInput)
	{
		Set<DataMessage> temp = new TreeSet<>(dataInput.GetDataList());
		this.dataList.addAll(temp);
		this.dataList.add(SumDataMessage(this.dataList));
	}
	
	private DataMessage SumDataMessage(List<DataMessage> inputList)
	{
		int temp=0;
		
		for(DataMessage item: inputList)
		{
			temp += item.GetValue();
		}
		
		return new DataMessage(temp);
	}
	
	public List<DataMessage> GetDataList()
	{
		return this.dataList;
	}

}
