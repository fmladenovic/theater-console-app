package domain;

public enum PerformanceType {
    DRAMA,
    OPERA,
    BALLET;
    public static PerformanceType fromStringToPerformanceType(String stringRepresentation) {
        if (stringRepresentation.equals("DRAMA")) {
            return PerformanceType.DRAMA;
        }
        if (stringRepresentation.equals("OPERA")) {
            return PerformanceType.OPERA;
        }
        if (stringRepresentation.equals("BALLET")) {
            return PerformanceType.BALLET;
        }
        return null;
    }

}

