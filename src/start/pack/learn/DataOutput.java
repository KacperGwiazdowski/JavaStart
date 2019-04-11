package start.pack.learn;

import java.util.List;

public class DataOutput {
	
	private List<DataMessage> dataList;
	
	public DataOutput(IData dataProcessor)
	{
		this.dataList = dataProcessor.GetDataList();
		
		for(DataMessage item: this.dataList) {
			System.out.println(item);
		}
	}
	

}
