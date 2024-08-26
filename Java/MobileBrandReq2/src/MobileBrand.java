import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class MobileBrand {
	private String name;
	private List<Mobile> mobileList;
	
	public MobileBrand() {
		mobileList=new ArrayList<>();
	}

	public MobileBrand(String name, List<Mobile> mobileList) {
		super();
		this.name = name;
		this.mobileList = mobileList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mobile> getMobileList() {
		return mobileList;
	}

	public void setMobileList(List<Mobile> mobileList) {
		this.mobileList = mobileList;
	}
	
	public void addMobileToMobileBrand(Mobile mobile)
	{
		mobileList.add(mobile);
	}
	public Boolean removeMobileFromMobileBrand(String referenceId)
	{
		//ConcurrentModificationException
		boolean isFound=false;
		for(Mobile m:mobileList)
		{
			if(m.getReferenceId().equals(referenceId))
			{
				//found
				isFound=true;
				mobileList.remove(m);
				break;
			}
		}
		return isFound;
	}
	public void displayMobiles()
	{
		if(mobileList.isEmpty())
		{
			System.out.println("No mobiles to show");
			return;
		}
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		System.out.format("%-15s %-15s %-12s %-8s %s\n","Reference Id","Model Name","Display Size", "Price","Launched Date");
		for(Mobile m:mobileList)
		{
			System.out.format("%-15s %-15s %-12s %-8s %s\n",m.getReferenceId(),m.getModelName(),m.getDisplaySize(), m.getPrice(),sdf.format(m.getLaunchedDate()));
		}
	}

	
}
