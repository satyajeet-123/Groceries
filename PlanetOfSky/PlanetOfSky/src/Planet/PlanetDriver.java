package Planet;public class PlanetDriver
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Planet db[]=new Planet[6];
		
		db[0]=new Planet("Mercury",null, 0,false);
		db[1]=new Planet("Venus",new String[] {"Co2","N2"}, 0, false);
		db[2]=new Planet("Earth",new String[] {"N2","O2"}, 1, false);
		db[3]=new Planet("Jupiter",new String [] {"H2","He"},79,true);
		db[4]=new Planet("Saturn",new String[] {"H2","He"},83,true);
		db[5]=new Planet("Uranus",new String[] {"H2","He","CH4"},27,true);
		
		System.out.println(moon(db));
		dominantGas(db);
	}
	
	public static int moon(Planet p[])
	{
		int sum=0;
		for (int i = 0; i < p.length; i++)
		{
			if(p[i].rings==true)
			{
				sum+=p[i].moon;
			}
		}
		return sum;
	}
	
	public static void dominantGas(Planet p[])
	{
		int size=0;
		for (int i = 0; i < p.length; i++)
		{
			if(p[i].gas!=null)
			{
				size+=p[i].gas.length;
			}
		}
		
		String gas[]=new String[size];
		
		for (int i = 0,k=0; i < p.length; i++)
		{
			if(gas[i]!=null)
			{
				for (int j = 0; j < p[i].gas.length; j++)
				{
					gas[k++]=p[i].gas[j];
				}
			}
		}
		//System.out.println(Arrays.to);
		int ct[]=new int[gas.length];
		
		for (int i = 0; i < gas.length; i++) 
		{
			int count=0;
			for (int j = i+1; j < gas.length; j++)
			{
				if(gas[i].equals(gas[j]))
				{
					count++;
					ct[i]=-1;
				}
			}
			if(ct[i]!=-1)
			{
				ct[i]=count;
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int i=0;i<ct.length;i++)
		{
			if(ct[i]>max)
			{
				max=ct[i];
			}
		}
		
		System.out.println("The dominant gases are : ");
		
		for (int i = 0; i < ct.length; i++)
		{
			if(ct[i]==max)
			{
				System.out.println(gas[i]);
			}
		}
	}
}
