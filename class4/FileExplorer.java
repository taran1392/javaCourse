import java.io.*;
import java.util.Date;
import java.util.Scanner;
import java.util.*;
import java.lang.*;
class FileExplorer {

static void p(String s){

    System.out.println(s);
}

static void printContents(File f){

    p("Current Directory: "+f.getAbsolutePath());

p("Contents");
p("0) Parent");
    File allFiles[]=f.listFiles();

    for(int i=0;i<allFiles.length;i++)
    {   
          
        char type= allFiles[i].isDirectory() ?'D':'F';

        p((i+1)+ ")  -" +type +"- " + allFiles[i].getName());
    }




}




    public static void main(String args[]){


            File f=new File("G:/projects");

 /*           p("FileName: "+f.getName());
            p("Size: "+f.length());
            p( "IsDirectory: "+f.isDirectory());
            p("isFile: "+f.isFile());
            p("LastModified: "+new Date( f.lastModified()));
             
   */

        Scanner sc=new Scanner(System.in);
             
        while(true){


           try{ 
                printContents(f);

                p("Please enter the directory no. to explore: ");
           
                int n=sc.nextInt();

                if(n==0)
                {
                    f=f.getParentFile();
                 }else{
           
           
                File allFiles[]=    f.listFiles();
                f=allFiles[n-1];
           
            }

        }
        catch(InputMismatchException e){
                p(" Please enter only the no. of Directory");
                sc.nextLine();
        }catch( ArrayIndexOutOfBoundsException e){
            p( " Directory no. does not exist. ");

        }        catch(Exception e){

            p("Some Error "+ e);

            
        }finally{

                p(" Executing final block");
                if(f.listFiles()==null)
                    f=f.getParentFile();

        }




        }


    }
}



/*

CurrentDirectory: g:\projects
contents:
0. Parent  ..
1. folder1
2. folder2;
3. folder3
4. file

Please enter the no. of direcotry to explore: 1 +enter





*/








