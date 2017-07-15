class ArrayDemo{

 
 static int [] filter(int[] Narray,int ex  ){
    int size=Narray.length-1;
        int [] filtered= new int [size];
        int num=0;    
        for(int i=0;i<Narray.length ;i++){
                if(Narray[i]!=ex)
                {   
                    filtered[num]    =Narray[i];
                    num++;
                }

        }
        return filtered;

  }



static void p(String s){

    System.out.println(s);

}



static void swap(int a, int b  ){



    System.out.println("INSIDE SWAP Value Before Swap a:"+a +" b:"+b);
        int k=a;
        a=b;
        b=k;

    System.out.println("INSIDE SWAP Value after Swap a:"+a+" b:"+b);


 }


static void swap(data a,data b){
/*            as_object,bs_object  OBJECT
            as,       bs    reference variable
            swap(as,bs);
            as->a   bs->b ;

*/
    System.out.println("INSIDE SWAP String Value Before Swap a:"+a +" b:"+b);
    data k=a;
         a=b;
         b=k;

    System.out.println("INSIDE SWAP String Value after Swap a:"+a+" b:"+b);



 }



int a=10;
increment(a);


static void increment(int num){
        p(nnum);
        num++;
        p(num);

 }

 static void increment(data d){

        d.v++;
 }


    static boolean find(int[] Narray,int ex ){

            for(int i=0;i<Narray.length;i++)
             if(Narray[i] ==ex )
                return true;


            return false;    


    }



public static void main(String args[]){

    //declaring a array
    int [] numberList;


    //initialising array
    numberList=new int[10];

 //   numberList= {10,20,30,40,50,60,70,80,90 } ;
 

    for(int i=0;i<numberList.length;i++){


            numberList[i]=i*10;


        }
    

System.out.println("Array bbefore filter");
    for(int i=0;i<numberList.length;i++){


         System.out.print(" "+numberList[i]);   

        }

       numberList= filter(numberList,40);

System.out.println("\n Array After filter");
    for(int i=0;i<numberList.length;i++){


         System.out.print(" "+numberList[i]);   

        }


    System.out.println("Check:  50 esist "+ find(numberList,50));
    
    System.out.println("Check:  40 esist "+ find(numberList,40));


int a=10;
int b=20;



data as =new data();
as.v=10;

int num1=10;
p("Value before increment num1 : "+num1);
increment(num1);
p("Value after increment num1 : "+num1);


p("Value before increment as : "+as);
increment(as);
p("Value after increment as : "+as);




data bs=new data();
bs.v=20;
//Integer bs=new Integer(20);
//String as="10";
//String bs="20";

    /*System.out.println("Before Swaping Values a:"+a+" b:"+b);
    swap(a,b);
    System.out.println("After Swaping Values a:"+a+" b:"+b);


    System.out.println("Before Swaping Values a:"+as+" b:"+bs);
    swap(as,bs);
    System.out.println("After Swaping Values a:"+as+" b:"+bs);
    */


}


static class data{
    int v;

    public String toString(){

        return ""+v;
    }

}

}