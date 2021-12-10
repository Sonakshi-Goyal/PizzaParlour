/*
Name:Sonakshi Goyal
*/
/* PROBLEM STATEMENT:
Implement Queue as ADT using linked list or array. Use same ADT to implement Pizza delivery system.
*/

//SOURCE CODE:

import java.util.Scanner;
class Pizza
{
    String pizza_name;
    char size;
    int price;
}

class PizzaParlour
{
    int front,rear,size;
    int MAXSIZE;
    Pizza list[];

    public PizzaParlour()
    {
        front=rear=size=0;
        MAXSIZE=20;
        list=new Pizza[MAXSIZE];
    }
    public PizzaParlour(int q_size)
    {
        front=rear=size=0;
        MAXSIZE=q_size;
        list=new Pizza[MAXSIZE];
    }

    public boolean isFull()
    {
        if(size==MAXSIZE)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isEmpty()
    {
        if(size==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void placeOrder(Pizza pizza)                     //enqueue
    {
        if(isFull())
        {
            System.out.println("Queue is full.Cannot place the order");

        }
        else
        {
            list[rear]=pizza;
            rear++;
            size++;
        }
    }

    public void deliverOrder()                             //dequeue
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty.No orders available");
        }
        else
        {
            Pizza temp=list[front];
            front++;
            size--;
            System.out.println("Delievered item is: "+temp.pizza_name+"-"+temp.size+"-"+temp.price);
        }
    }

    public void displayOrder()
    {
        if(isEmpty())
        {
            System.out.println("Queue is empty.No orders available");
        }
        else
        {
            System.out.println("Pizza Name\tSize\tprice");
            for(int i=front;i<rear;i++)
            {
                System.out.println(list[i].pizza_name+"\t"+list[i].size+"\t"+list[i].price);
            }
        }
    }
}

public class PizzaParlour_Management
{
    public static void main(String[] args) 
    {
        PizzaParlour Pizza_hut=new PizzaParlour();
        Scanner sc=new Scanner(System.in);
        int ch,ch1;
        do
        {
            System.out.println("What do you want to do?");
            System.out.println("1-Place new order");
            System.out.println("2-Deliver an order");
            System.out.println("3-Display all pending orders");
            ch=sc.nextInt();
            
            switch(ch)
            {
                case 1:                     //place order-enqueue
                {
                    Pizza pizza=new Pizza();
                    System.out.print("Enter the name of the pizza: ");
                    sc.nextLine();
                    pizza.pizza_name=sc.nextLine();
                    System.out.print("Enter the size of the pizza (S/M/L): ");
                    pizza.size=sc.next().charAt(0);
                    System.out.print("Enter the cost of the pizza: ");;
                    pizza.price=sc.nextInt();
                    Pizza_hut.placeOrder(pizza);
                    break;
                }
                case 2:                     //deliver order-dequeue
                {
                    Pizza_hut.deliverOrder();
                    break;
                }
                case 3:                     //display all orders
                {
                    Pizza_hut.displayOrder();
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                }
            }

            System.out.println("Press 1 to continue");
            System.out.println("Press 0 to exit");
            ch1=sc.nextInt();
        }while(ch1==1);
    }
}

/*   OUTPUT:
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
1
Enter the name of the pizza: Cheese Pizza
Enter the size of the pizza (S/M/L): M
Enter the cost of the pizza: 400
Press 1 to continue
Press 0 to exit    
1
What do you want to do?     
1-Place new order
2-Deliver an order
3-Display all pending orders
1
Enter the name of the pizza: Tomato Pizza
Enter the size of the pizza (S/M/L): S
Enter the cost of the pizza: 300
Press 1 to continue
Press 0 to exit    
1
What do you want to do?     
1-Place new order
2-Deliver an order
3-Display all pending orders
1
Enter the name of the pizza: Capsicum Pizza
Enter the size of the pizza (S/M/L): L
Enter the cost of the pizza: 500
Press 1 to continue
Press 0 to exit    
1
What do you want to do?
1-Place new order      
2-Deliver an order
3-Display all pending orders
1
Enter the name of the pizza: Schezwan Pizza
Enter the size of the pizza (S/M/L): M
Enter the cost of the pizza: 450
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
3
Pizza Name      Size    price
Cheese Pizza    M       400
Tomato Pizza    S       300
Capsicum Pizza  L       500
Schezwan Pizza  M       450
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
2
Delievered item is: Cheese Pizza-M-400
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
3
Pizza Name      Size    price
Tomato Pizza    S       300
Capsicum Pizza  L       500
Schezwan Pizza  M       450
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
1
Enter the name of the pizza: Tandoori Pizza
Enter the size of the pizza (S/M/L): L
Enter the cost of the pizza: 600
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
3
Pizza Name      Size    price
Tomato Pizza    S       300
Capsicum Pizza  L       500
Schezwan Pizza  M       450
Tandoori Pizza  L       600
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
2
Delievered item is: Tomato Pizza-S-300
Press 1 to continue
Press 0 to exit
1
What do you want to do?
1-Place new order
2-Deliver an order
3-Display all pending orders
3
Pizza Name      Size    price
Capsicum Pizza  L       500
Schezwan Pizza  M       450
Tandoori Pizza  L       600
Press 1 to continue
Press 0 to exit
0
*/
