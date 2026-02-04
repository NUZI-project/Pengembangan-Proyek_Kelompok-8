package factory;

import threat.PhishingThreat;
import threat.Threat;

public class PhishingFactory extends ThreatCreator {

    private String target;
    private String url;
    private String teknik;

    public PhishingFactory(String target, String url, String teknik) {
        this.target = target;
        this.url = url;
        this.teknik = teknik;
    }

    @Override
    public Threat createThreat() {
        return new PhishingThreat(target, url, teknik);
    }
}
