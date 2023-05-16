import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Camera camera = context.getBean("camera", Camera.class);

        camera.doPhoto();

        CameraImpl cameraImpl = context.getBean("camera", CameraImpl.class);
        System.out.println(camera == cameraImpl);

        Camera cameraInnerBean = context.getBean("cameraInnerBean", Camera.class);
        cameraInnerBean.doPhoto();

        Camera cameraConstructor = context.getBean("cameraConstructor", Camera.class);
        cameraConstructor.doPhoto();
    }
}
