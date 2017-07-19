class ChildClass extends BaseClass {

String name;
   ChildClass(String name,String id){
    super(name,id);
    
    this.name="CHIDCLASS "+name;

   } 


void showParentName(){

        System.out.println(super.name);

   }


public void callMe(){

    System.out.println("[ChildClass] My Name is "+ super.name );
}


private void doSomething(){

    System.out.println("DOing something in the class");
}
   

 void average(int ... args){

int sum=0;
    for(int i:args ){

        sum+=i;

    }

print("Avaerage "+ sum/args.length);

 }  


    public static void main(String args[]){


            ChildClass child=new ChildClass("JAVA","41");


            System.out.println("Child "+ child.name+ " id: "+child.id);

            System.out.println(child.toString());

            System.out.println("Name property of Parent ");
            child.showParentName();

            child.callMe();


            child.doSomething();
            BaseClass baseRef;
            baseRef=child;

            baseRef.callMe();


            child.average(2,4);
            child.average(2,4,7,10);


    }

/*
            BaseNote
                ->ListNote
                ->SimpleNote
                ->PictureNote

            Array<BaseNote> 
*/
}