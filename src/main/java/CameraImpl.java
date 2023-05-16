public class CameraImpl implements Camera{

    private CameraRoll cameraRoll;

    public CameraImpl() {
    }

    public CameraImpl(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }

    @Override
    public void doPhoto() {
        System.out.println("Click");
        cameraRoll.processing();
    }

    public CameraRoll getCameraRoll() {
        return cameraRoll;
    }

    public void setCameraRoll(CameraRoll cameraRoll) {
        this.cameraRoll = cameraRoll;
    }
}