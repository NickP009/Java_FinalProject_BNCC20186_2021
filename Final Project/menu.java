import java.util.Random; 

public class Menu
{
		private String Name, harga, stok, randomString;
		private int stok, harga, length;

		public Menu(String Name, int harga, int stok, int length, String randomString)
		{

		    this.Name = Name;
		    this.harga = harga;
		    this.stok = stok;

		}

		public String getName()
		{
		    return Name;
		}

		public void setName(String Name)
		{
		    this.Name = Name;
		}

		public int getstok()
		{
		    return stok;
		}
		
		public void setstok(int stok)
		{
		    this.stok = stok;
		}

        public int getharga()
		{
		    return harga;
		}
		
		public void setharga(int harga)
		{
		    this.harga = harga;
		}
		
		
		String Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	    String num = "0123456789";

	    String alphaNumeric = Alphabet + num;

	    StringBuilder sb = new StringBuilder();

	    Random random = new Random();

	    length = 7;

	    for(int i = 0; i < length; i++)
	    {
	      int index = random.nextInt(alphaNumeric.length());

	      char randomChar = alphaNumeric.charAt(index);

	      sb.append(randomChar);
	    }

	    randomString = sb.toString();

}