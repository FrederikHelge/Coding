interface Device {
    String getModel();
}

interface CanTakePictures extends Device {
    double getMegapixels();
}

interface CanPlayMusic extends Device {
    String[] getMusicFormats();
}

interface CanMakeCalls extends Device {
    String getNetworkType();
}

class Camera implements CanTakePictures {
    private String model;
    private double megapixels;

    public Camera(String model, double megapixels) {
        this.model = model;
        this.megapixels = megapixels;
    }

    public String getModel() {
        return model;
    }

    public double getMegapixels() {
        return megapixels;
    }
}

class MusicPlayer implements CanPlayMusic {
    private String model;
    private String[] musicFormats;

    public MusicPlayer(String model, String[] musicFormats) {
        this.model = model;
        this.musicFormats = musicFormats;
    }

    public String getModel() {
        return model;
    }

    public String[] getMusicFormats() {
        return musicFormats;
    }
}

class Featurephone implements CanMakeCalls {
    private String model;
    private String networkType;

    public Featurephone(String model, String networkType) {
        this.model = model;
        this.networkType = networkType;
    }

    public String getModel() {
        return model;
    }

    public String getNetworkType() {
        return networkType;
    }
}

class Smartphone implements CanMakeCalls, CanPlayMusic, CanTakePictures {
    private String model;
    private String networkType;
    private String[] musicFormats;
    private double megapixels;

    public Smartphone(String model, String networkType, double megapixels, String[] musicFormats) {
        this.model = model;
        this.networkType = networkType;
        this.megapixels = megapixels;
        this.musicFormats = musicFormats;
    }

    public String getModel() {
        return model;
    }

    public String getNetworkType() {
        return networkType;
    }

    public String[] getMusicFormats() {
        return musicFormats;
    }

    public double getMegapixels() {
        return megapixels;
    }
}
