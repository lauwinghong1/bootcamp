import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;

public class ConnecttoYahoo {

public static String getCrumb() throws MalformedURLException, IOException {
        var connection = (HttpURLConnection) new URL("https://query1.finance.yahoo.com/v1/test/getcrumb").openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("User-Agent", "Mozilla/5.0");
        connection.setRequestProperty("Cookie", new URL("https://fc.yahoo.com").openConnection().getHeaderField("Set-Cookie"));
        return new String(connection.getInputStream().readAllBytes());
    }

    public static String getNewKey(String crumb) throws MalformedURLException, IOException {
        String urlString = "https://query1.finance.yahoo.com/v7/finance/quote?symbols=0388.HK&crumb=" + crumb;
        System.out.println(urlString); // Print the constructed URL
        var connection = (HttpURLConnection) new URL(urlString).openConnection();
        connection.setRequestMethod("GET");
        return new String(connection.getInputStream().readAllBytes());
    }

    public static void main(String[] args) throws MalformedURLException, IOException {
        String crumb = getCrumb();
        String response = getNewKey(crumb);
        System.out.println(response);
    }

  
}
