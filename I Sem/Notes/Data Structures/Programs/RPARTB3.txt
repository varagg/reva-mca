/* Part-B 3 Develop a program to simulate the working
   of circular queue providing the following operations
   Insert,Delete and Display */

#include<stdio.h>
#include<conio.h>
#define SIZE 4

void cqinsert(int);
void cqdelete();
void cqdisplay();

int cq[SIZE],front = - 1,rear = -1;

void main()
 {
    int item,op;
    clrscr();
    do
     {
       printf("1.Insert \n");
       printf("2.Delete \n");
       printf("3.Display \n");
       printf("4.Exit \n \n");
       printf("enter option \n");
       scanf("%d",&op);
       switch(op)
	{
	  case 1:
		  printf("enter item to be inserted \n");
		  scanf("%d",&item);
		  cqinsert(item);
		  break;
	  case 2:
		  cqdelete();
		  break;
	  case 3:
		  cqdisplay();
		  break;
       }
      } while(op != 4);
    }

    void cqinsert(int item)
     {
	if(((front == 0) && (rear == SIZE - 1)) || (front == rear + 1))
	  {
	     printf("circular queue is full \n");
	     return;
	  }
	if(front == -1)
	  {
	    front = 0;
	    rear = 0;
	  }
	else if(rear == SIZE - 1)
	 {
	   rear = 0;
	 }
	else
	 {
	   rear = rear + 1;
	 }
	 cq[rear] = item;
     }

     void cqdelete()
       {
	  if(front == -1)
	    {
	      printf("circular queue is empty \n");
	      return;
	    }
	  printf("delted element = %d \n",cq[front]);
	  if(front == rear)
	    {
	      front = -1;
	      rear = -1;
	    }
	  else if(front == SIZE - 1)
	    {
	       front = 0;
	    }
	  else
	   {
	     front = front + 1;
	   }
     }

  void cqdisplay()
    {
       int i;
       if(front == -1)
	 {
	    printf("circular queue is empty \n");
	    return;
	 }
       printf("contents of circular queue \n");
       if(front <= rear)
	 {
	   for(i = front; i <= rear; i++)
	    {
	      printf("%d \n",cq[i]);
	    }
	 }
	else
	 {
	   for(i = front; i <= SIZE - 1; i++)
	    {
	      printf("%d \n",cq[i]);
	    }
	    for(i = 0; i <= rear; i++)
	    {
	      printf("%d \n",cq[i]);
	    }
	 }
       }


