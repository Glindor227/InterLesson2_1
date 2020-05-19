package Report;

class ReportItemImpl implements ReportItem{
	private String description;
	private float amount;
	
	public ReportItemImpl(String description, float amount){
		this.description = description;
		this.amount = amount;
	}
	@Override
	public String getDescription(){
		return description;
	}
	@Override
	public float getAmount(){
		return amount;
	}
}