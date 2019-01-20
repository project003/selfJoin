import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class selfJoin {
	
	String[][] text=new String[3][3];
	int k=2,m=0;
	public static void main(String args[])
	{
		
		selfJoin sj= new selfJoin();
		
		sj.getInput();
		sj.display();
	
	}	
	public void getInput()
	{
		
		
		try {
			File emp = new File("C:\\Users\\user\\eclipse-workspace\\SelfJoin\\emp.txt");
			Scanner sc = new Scanner(emp);
			String nextLine = sc.nextLine();
			
			
			
			while(sc.hasNext())
			{
				for(int i=0;i<3;i++)
				{	
				    for(int j=0;j<3;j++)
				    {
					String[] records = nextLine.split(",");
				    text[i][j]=records[j];
				    //System.out.println("Next line is : "+text[i][j]);    
				    }
				    if(i<2)
				    {
				    nextLine =sc.next();
				    }
				
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
	
	public void display()
	{
	
		for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					int str = text[i][k].compareTo(text[j][m]);
					if(str==0)
					{
						 System.out.println(text[i][k-1]+" "+text[j][m+1]);  
					}
				
				}
			}					
	}
}

