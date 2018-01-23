class Room
{
	double width;
	double length;
	double height;

	Room()
	{
		width=6;
		height=8;
		length=10;
	}
}
class RoomDemo
{
	public static void main(String args[])
	{
		Room myroom1= new Room();
		double vol;
		vol=myroom1.width*myroom1.height*myroom1.length;
		System.out.println("The volume of myroom1 is "+vol);
	}
}