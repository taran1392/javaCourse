class Main {

static void print(String s){

System.out.println(s);


}

    public static void main(String args[]){

        Point p;
        p= new Point(10,20);

        Point p1=new Point(20,30);

        
        Point p2=new Point(30,40);



        print("Distance "+ p2.distance(p1) )  ;

        Point origin =new Point();
        Point x=new Point(10,0);

        print("Distance should be 10 => "+ origin.distance(x) )  ;

        print("Point p.x "+p.x+" p.y "+p.y);
        print("Point p: "+ p );


        print("Total no. of object created: " +  Point.count );
    


    }
}