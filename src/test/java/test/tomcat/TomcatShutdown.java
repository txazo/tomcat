package test.tomcat;

import org.apache.catalina.startup.Bootstrap;

public class TomcatShutdown {

    public static void main(String[] args) {
        TomcatEnvironment.init();
        Bootstrap.main(new String[]{"stop"});
        System.out.println("Tomcat stoped.");
    }

}
