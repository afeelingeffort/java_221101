import java.time.LocalDate;

class Computer{
	private String modelName;
	private boolean status;
	private LocalDate productionDate;
	
	public String getModelName() {
		return modelName;
	}
	
	public boolean isStatus() {
		return status;
	}
	
	public LocalDate getProductionDate() {
		return productionDate;
	}
	
	public void setModelName(String modelName) {
		this.modelName=modelName;
	}
	
	public void setStatus(boolean status) {
		this.status=status;
	}
	
	public void setProductionDate(LocalDate productionDate) {
		this.productionDate=productionDate;
	}
}
public class google_oop_method_GetSet_Computer {

	public static void main(String[] args) {
		Computer cmp=new Computer();
		
		cmp.setModelName("Mac Book Air M1");
		cmp.setStatus(true);
		cmp.setProductionDate(LocalDate.now());
		
		System.out.println(cmp.getModelName());
		System.out.println(cmp.isStatus());
		System.out.println(cmp.getProductionDate());
	}

}
