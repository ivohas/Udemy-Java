import java.util.*;

enum DestinationType {
    CITY, BEACH, MOUNTAIN, HISTORIC_SITE
}

class Destination {
    private String name;
    private DestinationType type;

    public Destination(String name, DestinationType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public DestinationType getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}

