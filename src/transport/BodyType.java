package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");
        private final String body;

        @Override
        public String toString() {
            return "Тип кузова: " + body + ".";
        }

        BodyType(String body) {
            this.body = body;
        }
        public String getBody() {
            return body;
        }

    }
