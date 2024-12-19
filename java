
String bookname;
	String author;
	book(String b,String c)
	{
		this.bookname=b;
		this.author=c;
	}
	public void show()
	{
		System.out.println(bookname+" "+author);
	}
}
class booktest
{
	public static void main(String args[])
	{
		book bk=new book("java","Herbert");
		bk.show();
	}
}
