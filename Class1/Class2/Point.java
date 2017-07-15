class Point {

static int count=0;



static int getCount(){

    return count;

    
}


int x,y;

    //constructor
    Point(int xCoordinate,int yCoordinate){

        x=xCoordinate;
        y=yCoordinate;

        count++;


    }

    Point (Point p ){
            //creates a copy of [point Object]

        x=p.x;
        y=p.y;

        count++;

    }

    Point(){
     //     this(0,0);

        count++;
        x=0;
        y=0;   
    }

    public String toString(){

        System.out.println("to STring Callled..!!!");

        String s="("+ x+","+y+")";

        return s;

    }


    double distance(Point p){

            int x1,x2,y1,y2;
            x1=this.x;
            y1=this.y;

            x2=p.x;
            y2=p.y;

          return   Math.sqrt( Math.pow( (x1-x2),2 )+ Math.pow( (y1-y2),2 )   );

    }

    void translate( int xOffset,int yOffset ){

        this.x+=xOffset;
        this.y+=yOffset;
    }

    double distanceFromOrigin(){

          return   Math.sqrt( Math.pow( (this.x),2 )+ Math.pow(this.y,2 )   );
        

    }







}