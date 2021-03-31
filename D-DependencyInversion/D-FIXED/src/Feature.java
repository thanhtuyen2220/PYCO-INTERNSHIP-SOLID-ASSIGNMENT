import java.util.List;

public class Feature {
    private List<IDevices> devices;
    //This class should work with interface
    IDevices idevice;
    public void registerFeature(IDevices device){
        idevice=device;
    }

   /* public Feature(List<IDevices> devices) {
        this.devices = devices;
    }*/
    public void Feature(){
        idevice.takePicture();
    }
}
