package threat;

public class PhishingThreat implements Threat {

    private String nama;
    private String url;
    private String target;

    public PhishingThreat(String nama, String url, String target) {
        this.nama = nama;
        this.url = url;
        this.target = target;
    }

    @Override
    public void displayInfo() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "────────────────────────────\n" +
               "      PHISHING THREAT\n" +
               "────────────────────────────\n" +
               "Nama Phishing : " + nama + "\n" +
               "URL Bahaya    : " + url + "\n" +
               "Target Korban : " + target;
    }
}