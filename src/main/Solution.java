package main;

import java.util.*;
import java.io.*;
import java.util.concurrent.ExecutionException;

public class Solution{
    public static void main(String []argh)  {

        Map<String, String> hm
                = new HashMap<String, String>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            String phone=in.nextLine();
            hm.put(name, phone);

        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if(!hm.containsKey(s)){
                System.out.println("Not found");
            }else{
                System.out.println(s+ "="+hm.get(s));
            }
        }
    }
}