package guru.springframework.bootstrap.profilesysout;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Modified by Pierrot on 8/26/22.
 */
@Component
@Profile("dev")
public class DevProfileSysOut {

    @Value("${guru.springframework.profile.message}")
    private String msg;

    public DevProfileSysOut(String msg) {
        this.msg = msg;
    }

    public DevProfileSysOut() {
        System.out.println("##################################");
        System.out.println("##################################");
        System.out.println("##              DEV             ##");
        System.out.println("##################################");
        System.out.println("##################################");
    }
}
