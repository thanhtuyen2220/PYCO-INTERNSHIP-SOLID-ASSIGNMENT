import java.util.*;

public class Main {

    public static void main(String[] args) {
        //As we can see,high level module isn't depending on low level modules
        Feature feature = new Feature();
        //Feature feature1 = new Feature();
        feature.registerFeature(new Camera());
        feature.registerFeature(new Flycam());

        feature.Feature();
        //feature1.Feature();
    }
}
