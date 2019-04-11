package start.pack.learn;

public class DataMessage implements Comparable<DataMessage>{
	
	private int veryImportantNumber;
	
	public DataMessage(int inputInt)
	{
		this.veryImportantNumber = inputInt;
	}

	public int GetValue()
	{
		return this.veryImportantNumber;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + veryImportantNumber;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataMessage other = (DataMessage) obj;
		if (veryImportantNumber != other.veryImportantNumber)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return Integer.toString(veryImportantNumber);
	}

	@Override
	public int compareTo(DataMessage o) {
		return (this.veryImportantNumber - o.veryImportantNumber);
	}
}
