package lab_lesson6;

public class Lab06_4 {
    /*
     * String url = "https://google.com";
     * Check http OR https; domain name, .com OR .net
     *
     * */
    public static void main(String[] args) {
        String url = "https://google.com";

        if (url.contains("https")) {
            System.out.println("URL contains https");
        } else if (url.contains("http")) {
            System.out.println("URL contains http");
        }

        String domainName = url.substring(url.indexOf("//") + 2);
        System.out.println(domainName);

        if (url.contains(".com")) {
            System.out.println("URL contains .com");
        } else if (url.contains(".net")) {
            System.out.println("URL contains .net");
        }


    }
}
