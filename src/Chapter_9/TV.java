package Chapter_9;



public class TV {
    private int channel = 1;
    private int volumeLevel = 3;
    private boolean on = false;

    public TV() {
    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public void setChannel(int channel) {
        if (on && (channel != this.channel || channel >= 1 && channel <= 120)) {
            this.channel = channel;
        }else{
            offMessage();
        }
    }

    public void channelUp(){
        if (on && channel < 120) {
            this.channel++;
        }else offMessage();
    }

    public void channelDown(){
        if (on && channel > 1) {
            this.channel--;
        } else offMessage();
    }

    public void setVolumeLevel(int volumeLevel) {
       if (on && volumeLevel >= 1 && volumeLevel <= 7) {
           this.volumeLevel = volumeLevel;
       }else offMessage();
    }

    public void volumeUp(){
        if (on && volumeLevel < 7) {
            this.volumeLevel++;
        }else offMessage();
    }
    public void volumeDown(){
        if (on && volumeLevel > 1) {
            this.volumeLevel--;
        } else offMessage();
    }

    public int getChannel() {
        return channel;
    }
    public int getVolumeLevel() {
        return volumeLevel;
    }
    public boolean isOn() {
        return this.on;
    }

    private void offMessage() {
        System.out.println("Please, turn on the TV First to operate the TV");
    }

}

class TestTv{
    public static void main(String[] args) {
        TV tv = new TV();

        tv.setChannel(3);
        tv.setVolumeLevel(3);
        System.out.println("isOn: " + tv.isOn());
        tv.turnOn();
        System.out.println("isOn: " + tv.isOn());
        tv.setChannel(10);
        tv.setVolumeLevel(7);
        System.out.println("Current channel: " + tv.getChannel());
        System.out.println("Current volume level: " + tv.getVolumeLevel());

    }
}
