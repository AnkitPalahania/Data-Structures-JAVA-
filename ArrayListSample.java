import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSample
{   
    private ArrayList<String> items=new ArrayList<String>();   

    //ADDING THE ITEMS AT BEGINNING
    public void addItems(String item_names)
    {
        items.add(item_names);
    }

    //PRINTING THE ELEMENTS
    public void printItems()
    {
        System.out.println("YOU HAVE: "+items.size()+ " ELEMENTS");  

        for(int i=0;i<items.size();i++)
        System.out.println((i+1)+" ELEMENT IS : "+items.get(i));
    }

    //MODIFYING THE LIST
    public void modifyItems(int pos,String new_item)
    {
        items.set(pos,new_item);
        System.out.println("THE NEW ITEM "+new_item+" IS ADDED AT "+pos+" POSITION");
    }

    //REMOVING THE ELEMENT
    public void removeItems(int pos)
    {
        items.remove(pos);
        System.out.println("ITEM "+items.get(pos)+" IS REMOVED SUCCESSFULLY FROM "+pos+" POSITION");
    }

    //FINDING THE ITEM
    public String findItem(String search_item)
    {
        /*boolean exists;
        exists=items.contains(search_item);
        return exists;
        */
        int position=items.indexOf(search_item);
        if(position>=0)
        {
            System.out.println("THE ITEM FOUND AT: "+items.indexOf(search_item));
            return items.get(position);
        }
        else {
            System.out.println("XXXXXXXXXXXXX ITEM NOT FOUND  XXXXXXXXXXXXXXXXXXX");
            return null;
        }
    }
    public static void main(String args[])
    {
        ArrayListSample obj=new ArrayListSample();

        Scanner sc=new Scanner(System.in);
        boolean quit=false;
        int choice;
        while(!quit)
        {
            System.out.println(":::::::::::::::::::::::::ENTER UR CHOICE(0-6) ONLY::::::::::::::::::::::::::::::::::::");
            choice=sc.nextInt();
            sc.nextLine();     //CREATING INPUT BUFFER     

            switch (choice)
            {
                case 0:
                    System.out.println("0-> FOR MENU");
                    System.out.println("1-> FOR PRINTING");
                    System.out.println("2-> ADDING THE ITEM");
                    System.out.println("3-> FOR MODIFYING");
                    System.out.println("4-> REMOVING");
                    System.out.println("5-> FOR FINDING");
                    System.out.println("6-> TO EXIT");
                    break;
                case 1:
                    System.out.println(":::::::::::::::::::::::::::::::PRINTING THE ITEMS:::::::::::::::::::::::::::::::::::::::");
                    obj.printItems();
                    break;
                case 2:
                    System.out.println("ENTER THE ITEM");
                    obj.addItems(sc.next());
                    break;
                case 3:
                    System.out.println("ENTER THE POSITION");
                    int pos=sc.nextInt();
                    System.out.println("ENTER THE REPLACEMENT ITEM: ");
                    String replace_item=sc.next();
                    obj.modifyItems(pos,replace_item);
                    break;
                case 4:
                    System.out.println("ENTER THE POSITION OF REMOVING ITEM:");
                    int remove=sc.nextInt();
                    obj.removeItems(remove);
                    break;
                case 5:
                    System.out.println("ENTER THE SEARCHING ITEM:");
                    String search_item=sc.nextLine();
                    obj.findItem(search_item);

                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }
}
