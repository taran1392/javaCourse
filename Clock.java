class Clock{






public static void main(String args[]){

    long startTime=System.currentTimeMillis();


    while(true){

    long currentTime=System.currentTimeMillis();
    int diff=(int)(currentTime-startTime)/1000;
    int minutes=( diff)/60;
    int seconds=( diff)%60;
    
    System.out.println(" Duration  "+ minutes+":"+seconds);
    try{
    Thread.sleep(1000);
    }catch(Exception e){


    }
    }

    //extend it show the current time

}

}