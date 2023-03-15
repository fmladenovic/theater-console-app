package domain;

public enum PerformanceType {
    DRAMA,
    OPERA,
    BALLET;
    public static PerformanceType fromStringToPerformanceType(String stringRepresentation) {
        if (stringRepresentation == "DRAMA") {
            return PerformanceType.DRAMA;
        }
        if (stringRepresentation == "OPERA") {
            return PerformanceType.OPERA;
        }
        if (stringRepresentation == "BALLET") {
            return PerformanceType.BALLET;
        }
        return null;
    }

}

