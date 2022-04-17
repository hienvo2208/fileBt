public class TV implements TvService{
    private int channel;
    private int volumeLevel;
    private boolean on;

    public TV() {
    }

    public TV(int channel, int volumeLevel, boolean on) {
        this.channel = channel;
        this.volumeLevel = volumeLevel;
        this.on = on;
    }

    public int getChannel() {
        return channel;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void setVolume(int newVolumeLevel) {
        System.out.printf("Bat volum");
    }

    @Override
    public void channel() {

    }

    @Override
    public void channelDown() {

    }

    @Override
    public void volumeUp() {

    }

    @Override
    public void volumeDown() {

    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }
}
