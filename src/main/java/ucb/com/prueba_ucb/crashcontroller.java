package ucb.com.prueba_ucb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import java.lang.Exception;
import io.sentry.Sentry;

@Controller
class crashcontroller {

    @GetMapping("/crash")
    public void crash() {
        try {
            throw new Exception("This is a test.");
            } catch (Exception e) {
            Sentry.captureException(e);
            }
    }

}
