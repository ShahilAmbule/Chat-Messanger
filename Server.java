import java.net.*;
import java.io.*;

class Server
{
    public static void main(String Arg[]) throws Exception
    {
        System.out.println("Client Application is Running...");
        
        ServerSocket ssobj = new ServerSocket(2100);
        

        Socket sobj = ssobj.accept();
        System.out.println("Client gets Successfully connected");

        PrintStream ps = new PrintStream(sobj.getOutputStream());
        BufferedReader br1= new BufferedReader(new InputStreamReader (sobj.getInputStream()));
        BufferedReader br2= new BufferedReader(new InputStreamReader (System.in));
        String str1,str2;

        System.out.println("Marvellous messanger started...");

        while((str1=br1.readLine()) !=null)
        {
            System.out.println("Clients says :"+str1);
            System.out.println("Enter message for server :");
            str2=br2.readLine();
            ps.println(str2);

        }
        System.out.println("Thank you for using Marvellous Messanger..");

    }
}