public class Pytsyry extends Spartansy {
    private String horsemen; // атчандар
    private String joBaskandar;  //

    public Pytsyry(String name, String massa, String horsemen, String joBaskandar) {
        super(name, massa);
        this.horsemen = horsemen;
        this.joBaskandar = joBaskandar;
    }

    public String getHorsemen() {
        return horsemen;
    }

    public void setHorsemen(String horsemen) {
        this.horsemen = horsemen;
    }

    public String getJoBaskandar() {
        return joBaskandar;
    }

    public void setJoBaskandar(String joBaskandar) {
        this.joBaskandar = joBaskandar;
    }
}
