class PalinDrome
	{
 public static void main(String args[])
{  
  	int a;
        int c=0;
	int b;    
  	int n=32;
        b=n;    
        while(n>0){    
        a=n%10;   
       c=(c*10)+a;    
       n=n/10;    
  }    
  if(b==c)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}
		