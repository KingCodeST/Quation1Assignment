package ac.za.cputAssignment;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class ClassRoom {

    private static final String students[] ={"Siviwe","Unathi","Pk","Siya","Athenkosi","Azola"};

    private static final String friends[] ={"Omega","Coolio","Khalipha","Sibongile","Noluthando","Nobuhle"};

    public ClassRoom()
    {

        List<String> studList=new LinkedList<String>();
        List<String>fridList=new LinkedList<String>();

        for(String student : students)
            studList.add(student);

        for(String friend : friends)
            fridList.add(friend);

        studList.addAll(fridList);
        fridList =null;

        printList(studList);

        convertToUppercaseStrings(studList);
        printList(studList);

        System.out.print("\n Deleting elements 4 to 6...");
        removeItems(studList,4,7);
        printList(studList);
        printReversedList(studList);

    }

    public void printList(List<String> list)
    {
        System.out.println("\n list: ");
        for(String friend : list)
            System.out.printf("%s",friend);
        System.out.println();
    }

    private void convertToUppercaseStrings(List<String> list)
    {
        ListIterator<String> iterator=list.listIterator();

        while (iterator.hasNext())
        {
           String friend =iterator.next();
           iterator.set(friend.toUpperCase());

        }

    }

    private void removeItems(List<String>list,int start,int end)
    {
        list.subList(start,end).clear();
    }

    private void printReversedList(List<String> list)
    {
        ListIterator<String> iterator=list.listIterator();
        System.out.println("\n Reverse List");

        while(iterator.hasPrevious())
        {
            System.out.printf("%s",iterator.previous());
        }

    }

    public static void main(String args[])
    {
        new ClassRoom();
    }



}
