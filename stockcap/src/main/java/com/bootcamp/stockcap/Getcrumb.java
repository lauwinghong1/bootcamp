package com.bootcamp.stockcap;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Getcrumb {
  private String cookie;
  private String key;

  public Getcrumb(String parCookie) {
    this.cookie = parCookie;
    this.key = "";
    return;
  }

  public String giveCrumb() throws Exception {
    URL obj = new URL("https://query1.finance.yahoo.com/v1/test/getcrumb");
    HttpURLConnection con = (HttpURLConnection) obj.openConnection();
    con.setRequestMethod("GET");
    con.setRequestProperty("Cookie", this.cookie);
    con.setRequestProperty("User-Agent", "Mozilla/5.0");
    con.setRequestProperty("Accept", "*/*");
    con.setRequestProperty("Accept-Encoding", "gzip,deflate,br");
    con.setRequestProperty("Connection", "keep-alive");
    int responseCode = con.getResponseCode();
    // String key = con.getContent()
    if (responseCode == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      // print result
      // callkey = response.toString();
      this.key=response.toString();
      return (this.key);
    } else {
      System.out.println("GET request did not work.");
      return ("");
    }
  }
}
