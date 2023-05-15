public class Client {
    public static void main(String[] args) {
        Camera camera = new Camera(new BlackWhiteCameraRoll());
        camera.doPhoto();

        camera.setCameraRoll(new ColorCameraRoll());
        camera.doPhoto();
    }
}
