package io.github.wechaty;


import io.github.wechaty.user.Contact;
import io.github.wechaty.user.Room;
import io.github.wechaty.utils.QrcodeUtils;
import org.apache.commons.lang3.StringUtils;


public class DingDongBot {


    public static void main(String[] args) throws Exception {

        final String token = System.getenv("WECHATY_PUPPET_SERVICE_TOKEN");

        if (StringUtils.isBlank(token)) {

            System.out.println("Error: WECHATY_PUPPET_SERVICE_TOKEN is not found in the environment variables");
            System.out.println("You need a TOKEN to run the Java Wechaty. Please goto our README for details");
            System.out.println("https://github.com/wechaty/java-wechaty-getting-started/#run");

            throw new Exception("need a token");
        }
        Wechaty bot = Wechaty.instance(token);


        bot.onScan((qrcode, statusScanStatus, data) -> {
            System.out.println(QrcodeUtils.getQr(qrcode));
            System.out.println("Online Image: https://wechaty.github.io/qrcode/" + qrcode);
        });

        bot.onMessage(message -> {

            Contact from = message.from();
            Room room = message.room();

            String text = message.text();

            if (StringUtils.equals(text, "#ding")) {
                if (room != null) {
                    room.say("dong");
                } else {
                    from.say("dong");
                }
            }
        });

        bot.start(true);

    }


}
