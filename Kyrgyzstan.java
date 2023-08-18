import java.util.Locale;

public enum Kyrgyzstan {
    OSH("Osh") {
        @Override
        public String getDescription() {
            return "Sulaiman-Too";
        }
    },
    BATKEN("Batken") {
        @Override
        public String getDescription() {
            return "Kyzyl-Oruk";
        }
    },
    JALALABAD("Jalal-Abad") {
        @Override
        public String getDescription() {
            return "Arslanbab";
        }
    },
    TALAS("Talas") {
        @Override
        public String getDescription() {
            return "Manas";
        }
    },
    NARYN("Naryn") {
        @Override
        public String getDescription() {
            return "Too";
        }
    },
    ISSYKKOL("Issyk-kol") {
        @Override
        public String getDescription() {
            return "Kol";
        }
    },
    CHUI("Chui") {
        @Override
        public String getDescription() {
            return "Bishkek";
        }
    };

    private final String name;

    Kyrgyzstan(String name) {
        this.name = name;
    }

    public abstract String getDescription();

    @Override
    public String toString() {
        return this.name().toUpperCase(Locale.ROOT);
    }
}
