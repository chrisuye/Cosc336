package objectAdventure.structure;

import java.util.Optional;

/**
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
     * @return
     */
    public String getLongName() {
        return longName;
    }

    /**
     *
     * @return
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
     * @param lexeme
     * @return
     */
    public static Optional<Direction> fromLexeme(final String lexeme) {
        // Just to be safe...
        var string = lexeme.trim().toLowerCase();

        // Search through ALL lexemes looking for a match with early bailout.
        for (var Direction : Direction.values()) {
            if (Direction.longName.toLowerCase().startsWith(string)) {
                return Optional.of(Direction);
            }
        }

        return Optional.empty();
    }

}
