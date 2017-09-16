package test.tomcat;

public abstract class TomcatEnvironment {

    public static void init() {
        String catalinaHome = getCatalinaHome();
        System.setProperty("catalina.base", catalinaHome);
        System.setProperty("catalina.home", catalinaHome);
        System.setProperty("java.io.tmpdir", catalinaHome + "/temp");
        System.setProperty("java.endorsed.dirs", catalinaHome + "/endorsed");
        System.setProperty("java.util.logging.manager", "org.apache.juli.ClassLoaderLogManager");
        System.setProperty("java.util.logging.config.file", catalinaHome + "/conf/logging.properties");
    }

    private static String getCatalinaHome() {
        String path = TomcatEnvironment.class.getResource("/").getPath();
        int index = path.indexOf("/target");
        if (index > -1) {
            return path.substring(0, index);
        }
        return path;
    }

}
