package factory;

import threat.Threat;

public abstract class ThreatCreator {

    public abstract Threat createThreat();

    public void showThreat() {
        Threat threat = createThreat();
        threat.displayInfo();
    }
}

