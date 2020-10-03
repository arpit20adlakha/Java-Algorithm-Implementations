package pom;

public class StateDesignPattern {
    //The state pattern is used to alter an object’s behavior when its state changes.

      static class FanWallControl {
        private SpeedLevel currentSpeed;

        public FanWallControl() {
            currentSpeed =  new Off();
        }
        public void setState(SpeedLevel speedLevel) {
            currentSpeed = speedLevel;
        }
        public void rotate() {
            currentSpeed.rotate(this);
        }

        @Override
        public   String toString() {
            return String.format("Fan Wall Control [current = %s]", currentSpeed.getClass());
        }
    }

    public interface SpeedLevel {
        void rotate(FanWallControl fanWallControl);
    }

    public static class SpeedLevel1 implements SpeedLevel{
        public void rotate(FanWallControl fanWallControl ) {
            fanWallControl.setState(new SpeedLevel2());
        }
    }
    public static class SpeedLevel2 implements SpeedLevel{
        public void rotate(FanWallControl fanWallControl) {
            fanWallControl.setState(new SpeedLevel3());
        }
    }
    public static class SpeedLevel3 implements SpeedLevel{
        public void rotate(FanWallControl fanWallControl) {
            fanWallControl.setState(new Off());
        }
    }

    public static class Off implements SpeedLevel{
        public void rotate(FanWallControl fanWallControl) {
            fanWallControl.setState(new SpeedLevel1());
        }
    }
}
