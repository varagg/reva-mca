/* Part-B lab-2 Develop a program to convert infix arithmetic
   ex pression to postfix expression */

#include<stdio.h>
#include<string.h>
#include<ctype.h>
#include<conio.h>

void main()
 {
    char infix[50],postfix[50],s[50],ch;
    int top = -1,len,i,j = 0;
    clrscr();
    printf("enter infix expression \n");
    scanf("%s",infix);
    len = strlen(infix);
    s[++top] = '#';
    for(i = 0; i < len; i++)
     {
	ch = infix[i];
	if(isalpha(ch) || isdigit(ch))
	 {
	    postfix[j++] = ch;
	 }
	else if(ch == '^')
	 {
	    while(s[top] == '^')
	     {
		postfix[j++] = s[top--];
	     }
	    s[++top] = ch;
	 }
	else if(ch == '*'|| ch == '/')
	 {
	    while(s[top] == '^'|| s[top] == '*'|| s[top] == '/')
	     {
		postfix[j++] = s[top--];
	     }
	    s[++top] = ch;
	 }
	else if(ch == '+' || ch == '-')
	 {
	    while(s[top] == '^'|| s[top] == '*'|| s[top] == '/' || s[top] == '+' || s[top] == '-')
	     {
		postfix[j++] = s[top--];
	     }
	    s[++top] = ch;
	 }
	else if(ch == '(')
	  {
	     s[++top] = '(';
	  }
	else if(ch == ')')
	 {
	   while(s[top] != '(')
	    {
	       postfix[j++] = s[top--];
	    }
	    top = top - 1; // remove the left parenthesis
	 }
     }
   while(s[top] != '#')
    {
      postfix[j++] = s[top--];
    }
   postfix[j] = '\0';
   printf("postfix expression = %s",postfix);
   getch();
 }

