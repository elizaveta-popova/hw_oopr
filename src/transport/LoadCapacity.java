package transport;

public enum LoadCapacity {
    N1 (0, 3.5F),
    N2 (3.5F, 12),
    N3 (12, 100);

    private final float minload;
    private final float maxload;
    @Override
    public String toString() {
        if (minload<0 || minload>100) {
            return "Грузоподъемность: до " + maxload + " тонн.";
        }
        return "Грузоподъемность: от" + minload + " тонн до " + maxload + " тонн.";
    }

    LoadCapacity(float minload, float maxload) {
        this.minload = minload;
        this.maxload = maxload;
    }

    public float getMinload() {
        return minload;
    }

    public float getMaxload() {
        return maxload;
    }
}
