import java.io.*;
class FileRead{

/*

    Stream
        used to connect program to DataSource
        perform read write operation on dataSource


    InputStream     dataSource->program     Reading from dataSource
    OutputStream    program->datasource     Writing to DatSource

*/

    public static void main(String args[]){

try{
    String filename=args[0];
    File f=new File(filename);
    FileInputStream fin=new FileInputStream(f);
    int c= fin.read();
    while(c>-1){

            System.out.print( (char) c   );
            c=fin.read();

    }


    }catch(Exception e){


    }



    }

}