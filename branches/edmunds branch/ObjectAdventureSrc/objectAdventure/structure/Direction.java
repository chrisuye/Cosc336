package objectAdventure.structure;

import java.util.Optional;

/**
 * Enum Type for compass directions.
 *
 * @author Adam J. Conover, COSC436
 */
public enum Direction {

    NORTH("North", 'N'),
    SOUTH("South", 'S'),
    EAST("East", 'E'),
    WEST("West", 'W');

    private final String longName;
    private final char abbreviation;

    Direction(String longName, char abbreviation) {
        this.longName = longName;
        this.abbreviation = abbreviation;
    }

    /**
     *
     * @return the full name of the direction
     */
    public String getLongName() {
        return longName;
    }

    /**
     *
     * @return the abbreviated name of the direction
     */
    public char getAbbreviation() {
        return abbreviation;
    }

    @Override
    public String toString() {
        return this.longName;
    }

    /**
     *
     * @param lexeme the string name of the direction to map to a real Direction object.
     *
     * @return the Direction object created from the string as an Optional which will be empty if
     * the direction string could not be parsed.
     */
    public static Optional<Direction> fromLexeme(final String lexeme) {
        // Just to be safe...
        var string = lexeme.trim().toLowerCase();

        // Search through ALL lexemes looking for a match with early bailout.
        for (var Direction : Direction.values()) {
            // Can use just the first few characters if desired.
            if (Direction.longName.toLowerCase().startsWith(string)) {
                return Optional.of(Direction);
            }
        }

        return Optional.empty();
    }

}
