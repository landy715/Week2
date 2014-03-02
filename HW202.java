class HW202{
	public static void main(String[] args)
	{
		double[] d={152.5,203.6,300.7};
		double sum=0;
		double average=0;
		for(double temp : d)
		{
			sum+=temp;
			System.out.println("[" + temp + "]");
		}
		System.out.println("\n sum: " + sum);
		average=sum/d.length;
		System.out.println("average: " + average);
	}
}