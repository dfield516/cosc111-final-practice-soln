
public class Gadget 
{
	// Part and serial number of the gadget
	int partNumber;
	int serialNumber;
	
	// Constructor
	public Gadget(int partNumber, int serialNumber) {
		super();
		this.partNumber = partNumber;
		this.serialNumber = serialNumber;
	}

	// Getters and setters
	public int getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(int partNumber) {
		this.partNumber = partNumber;
	}

	public int getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
}
