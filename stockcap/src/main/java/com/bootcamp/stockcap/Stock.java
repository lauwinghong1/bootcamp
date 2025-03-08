package com.bootcamp.stockcap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Stock {

  public static void main(String[] args) throws Exception {
    String callkey = "";
  

    URL cookie = new URL("https://fc.yahoo.com");
    String getCookie = cookie.openConnection().getHeaderField("Set-Cookie");
    // System.out.println("Cookie ==> " + getCookie);
    
    Getcrumb crumbKey = new Getcrumb(getCookie);
    callkey = crumbKey.giveCrumb();

    // URL obj = new URL("https://query1.finance.yahoo.com/v1/test/getcrumb");
    // HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    // con.setRequestMethod("GET");
    // con.setRequestProperty("Cookie", getCookie);
    // con.setRequestProperty("User-Agent", "Mozilla/5.0");
    // con.setRequestProperty("Accept", "*/*");
    // con.setRequestProperty("Accept-Encoding", "gzip,deflate,br");
    // con.setRequestProperty("Connection", "keep-alive");
    // int responseCode = con.getResponseCode();
    // // String key = con.getContent()
    // if (responseCode == HttpURLConnection.HTTP_OK) { // success
    //   BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
    //   String inputLine;
    //   StringBuffer response = new StringBuffer();

    //   while ((inputLine = in.readLine()) != null) {
    //     response.append(inputLine);
    //   }
    //   in.close();

    //   // print result
    //   //callkey = response.toString();
    //   callkey=response.toString();
    //   System.out.println(callkey);
    // } else {
    //   System.out.println("GET request did not work.");
    // }

    String yahooStock = "https://query1.finance.yahoo.com/v7/finance/quote?symbols=0388.HK&crumb="+callkey;
    System.out.println(yahooStock);
    URL obj2 = new URL(yahooStock);
    HttpURLConnection con2 = (HttpURLConnection) obj2.openConnection();
    con2.setRequestMethod("GET");
    con2.setRequestProperty("Cookie", getCookie);
    con2.setRequestProperty("User-Agent", "Mozilla/5.0");
    con2.setRequestProperty("Accept", "*/*");
    con2.setRequestProperty("Accept-Encoding", "gzip,deflate,br");
    con2.setRequestProperty("Connection", "keep-alive");
    int responseCode2 = con2.getResponseCode();
    // String key = con.getContent()
    if (responseCode2 == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(new InputStreamReader(con2.getInputStream()));
       String inputLine;
       StringBuffer response = new StringBuffer();

       while ((inputLine = in.readLine()) != null) {
         response.append(inputLine);
         System.out.println(inputLine);
       }
       in.close();
    // print result (That is JSON in raw string)
       //System.out.println(response.toString());
     } else {
       System.out.println("GET request did not work.");
     }
  }
}
