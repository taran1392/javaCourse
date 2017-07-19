class BaseClass {

    String name;
    String id;

    void print(String s){
        System.out.println(s);

    }

    
    
    BaseClass(String name, String id){

            this.name=name;
            this.id=id;
    }  

    public String toString(){

            return "Name: "+name+" ID: "+id;

    }

    public void callMe(){

            print("[BaseClass] My Name is "+name);

    }

    private void  doSomething(){

        print("Do Something...");
    }


}