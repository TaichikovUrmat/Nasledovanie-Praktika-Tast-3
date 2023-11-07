public class Vsatneki extends Spartansy{
    private String fecers;   //Кылыч чандар
    private String level;   // опуту

    public Vsatneki(String name, String massa, String fecers, String level) {
        super(name, massa);
        this.fecers = fecers;
        this.level = level;
    }

    public String getFecers() {
        return fecers;
    }

    public void setFecers(String fecers) {
        this.fecers = fecers;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
