class PrimeNumber
{
	public static void main(String ags[])
	{
		int i,j,a=0;
		for(i=1;i<=100;i++)
		 {
		for(j=2;j<i;j++)
		{
			if(i%j==0)
			{
				break;
			}
		}
		if(i==j)
		{
			System.out.println(i);
		}
		}
	}
}
				

					
		