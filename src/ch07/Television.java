package ch07;

// interface는 클래스와는 다르게 implements로 상속받음
public class Television implements RemoteControl {
    private int volume;

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void volumeUp() {if(volume < MAX_VOLUME){volume++;}}

    @Override
    public void volumeDown() {if(volume > MIN_VOLUME){volume--;}}

    public void volumeState(){System.out.println("volume : " + volume);}
}
