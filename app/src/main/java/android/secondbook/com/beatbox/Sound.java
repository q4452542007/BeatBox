package android.secondbook.com.beatbox;

/**
 * Created by Administrator on 2017/9/4.
 */

public class Sound {
    private String mAssetsPath;
    private String mName;

    public Sound(String assetsPath) {
        mAssetsPath = assetsPath;
        String[] components = assetsPath.split("/");
        String filename = components[components.length - 1];
        mName = filename.replace(".wav", "");
    }

    public String getAssetsPath() {
        return mAssetsPath;
    }

    public String getName() {
        return mName;
    }
}
