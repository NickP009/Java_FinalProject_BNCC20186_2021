import java.util.Scanner;
import java.util.Random; 

public class FinalProject_NickyPratama
{

public static void main(String[] args)
{

	static Menu[] men = new Menu[100];
    static int i = 0;

    public static void main1(String[] args)
    {
    	getMenu();
    }

    public static void getMenu()
    {
    	Scanner sc = new Scanner(System.in);
    	while (true)
    	{

        int select;
        System.out.println("1. Add Menu");
        System.out.println("2. View Menu");
        System.out.println("3. Update Menu");
        System.out.println("4. Delete Menu");
        System.out.println("0. Exit");
        select = sc.nextInt();

        switch (select)
        {
        case 1:
        addEmp(men);

        break;
        case 2:
        viewEmp(men);

        break;
        
        case 3:
        break;
        
        case 4:
        break;
        
        case 0:
        return;
        
        default:
        System.out.println("Invalid Option");
        }
    }

    }

    public static void addMen(Menu[] emp)
    {
    Scanner sc = new Scanner(System.in);
    int harga, stok;
    String Name;

    int addMore;

    do
    {
        System.out.println("Masukkan Nama");
        Name = sc.nextLine();
        System.out.println("Masukkan harga");
        harga = sc.nextLine();
        System.out.println("4. Masukkan stok");
        stok = sc.nextInt();
        men[i] = new Menu(Name);
        ++i;

        System.out.println("Untuk menambahkan input 1");
        addMore = sc.nextInt();
    } 
    while (addMore == 1);
    }

    public static void viewMenu(Menu[] men)
    {
    	
    	for (Menu element : men) 
    	{
    		if (null != element) 
    		{
    			System.out.println("Kode Menu: " + element.getrandomString());
    			System.out.println("Nama Menu: " + element.getName());
    			System.out.println("Harga    : " + element.getharga());
    			System.out.println("Stok     : " + element.getstok() + "\n");
    		}
    	}
    }
}
