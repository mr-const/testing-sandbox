package com.mrconst.testing;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;


public class CustomRobolectricRunner extends RobolectricTestRunner {

    public CustomRobolectricRunner(Class<?> testClass) throws InitializationError {
        super(testClass);

        _prepareManifestPath();
    }

    private void _prepareManifestPath() {
        String buildVariant = (BuildConfig.FLAVOR.equals("")
                ? "" : BuildConfig.FLAVOR+ "/") + BuildConfig.BUILD_TYPE;
        String intermediatesPath = BuildConfig.class.getResource("")
                .toString().replace("file:", "");
        intermediatesPath = intermediatesPath
                .substring(0, intermediatesPath.indexOf("/classes"));

        System.setProperty("android.package",
                BuildConfig.APPLICATION_ID);
        System.setProperty("android.manifest",
                intermediatesPath + "/manifests/full/"
                        + buildVariant + "/AndroidManifest.xml");
        System.setProperty("android.resources",
                intermediatesPath + "/res/" + buildVariant);
        System.setProperty("android.assets",
                intermediatesPath + "/assets/" + buildVariant);
    }
}