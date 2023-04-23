
public class Constructor {
	
	Constructor()
	{
		System.out.println("with out parameter");
	}
	Constructor(String name,int id)
	{
		System.out.println(name+id);
	}
	

	public static void main(String[] args) 
	{
		Constructor c1=new Constructor();
		Constructor c2=new Constructor("rani",122);
		
		
	}

}
