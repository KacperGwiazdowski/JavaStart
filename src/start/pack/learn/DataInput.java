package start.pack.learn;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DataInput implements IData {
	
	private List<DataMessage> DataList = new ArrayList<DataMessage>();
	
	
	public DataInput(Collection<Integer> intInputArray)
	{
		for(int item: intInputArray)
		{
			this.DataList.add(new DataMessage(item));
		}
	}
	
	
	public List<DataMessage> GetDataList()
	{
		return this.DataList;
	}

	
}
