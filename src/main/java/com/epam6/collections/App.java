package com.epam6.collections;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App
{
  public static void main (String[]args)
  {

    List < Object > custom_list = new ArrayList <> ();
    custom_list.add("1");
    custom_list.add("2");
    custom_list.add("3");
    custom_list.add("4");
    custom_list.add("5");
    custom_list.add("6");
    custom_list.add("7");
    custom_list.add("8");
    custom_list.add("9");
    custom_list.add("10");
    @SuppressWarnings("resource")
	Scanner scanner=new Scanner(System.in);
    int choice;

    int sample=1,index;
    String choiceforindex,element;
    while(sample!=0){
             System.out.println ("Choice your choice from(1-insertion , 2- deletion , 3-printing , 4-exit)= ");
            choice=scanner.nextInt();
    switch(choice){
        case 1:System.out.println ("want to add element with index(choose - 1) or without index(choose - 2)= ");
                choiceforindex=scanner.next();
                if(choiceforindex.equals("1")){
                    System.out.println("Enter index for inserting element= ");
                    index=scanner.nextInt();
                    System.out.println("Enter element for inserting= ");
                    element=scanner.next();
                    
                    custom_list.add(index,element);
                }
                else{
                    element=scanner.next();
                    custom_list.add(element);
                }
                
                break;
        case 2:System.out.println("Enter an element to delete= ");
            element=scanner.next();
            custom_list.remove(element);
            break;
                
        case 3:System.out.println(custom_list);
        break;
        case 4:sample=0;
            break;
           default:System.out.println("Invalid Choice Try Again:)");
           break;
        
    }
       
    }
System.out.println("After the completion of all operaitons on Custom List,\nFinal List= "+custom_list);
  }
}
