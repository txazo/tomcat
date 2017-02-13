package test.tomcat;

import org.apache.catalina.startup.Bootstrap;

public class TomcatBootstrap {

    public static void main(String[] args) {
        String catalinaHome = "/Users/txazo/Txazo/tomcat";
        System.setProperty("catalina.base", catalinaHome);
        System.setProperty("catalina.home", catalinaHome);
        System.setProperty("java.io.tmpdir", catalinaHome + "/temp");
        System.setProperty("java.endorsed.dirs", catalinaHome + "/endorsed");
        System.setProperty("java.util.logging.manager", "org.apache.juli.ClassLoaderLogManager");
        System.setProperty("java.util.logging.config.file", catalinaHome + "/conf/logging.properties");
        Bootstrap.main(new String[]{});
    }

}
