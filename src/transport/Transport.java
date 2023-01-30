package transport;

public class Transport {
    private final String brand;
    private final String model;
    private String color;
    private final int year;
    private final String country;
    private int maxSpeed;

    @Override
    public String toString() {
        return "Марка автомобиля: " + brand + ". " +
                "Модель: " + model + ". " +
                "Цвет кузова: " + color + ". " +
                "Год производства: " + year + ". " +
                "Страна сборки: " + country + ". " +
                "Максимальная скорость: " + maxSpeed + ". ";
    }

    public Transport(String brand,
                     String model,
                     String color,
                     int year,
                     String country,
                     int maxSpeed) {
        if (brand==null || brand.isEmpty() || model==null || model.isEmpty() || country == null || country.isEmpty()) {
            this.brand = "default";
            this.model = "default";
            this.country = "default";
        } else {
            this.brand = brand;
            this.model = model;
            this.country = country;
        }




        setColor(color);
        if (year <=0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color == "") {
            this.color = "белый";
        } else {
            this.color = color;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0) {
            this.maxSpeed = 40;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }
}
