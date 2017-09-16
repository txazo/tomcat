package test.tomcat;

import org.apache.catalina.startup.Bootstrap;

public class TomcatStartup {

    public static void main(String[] args) {
        TomcatEnvironment.init();
        Bootstrap.main(new String[]{"start"});
    }

}
