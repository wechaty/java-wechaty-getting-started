package io.github.wechaty;


import io.github.wechaty.user.Contact;
import io.github.wechaty.user.Room;
import io.github.wechaty.utils.QrcodeUtils;
import org.apache.commons.lang3.StringUtils;


public class DingDongBot {


    public static void main(String[] args) throws Exception {

        String token = "your_token";

        if(StringUtils.equals("your_token",token)){
            throw new Exception("need a token");
        }

        Wechaty bot = Wechaty.instance(token);



        bot.on("scan", (qrcode, statusScanStatus, data) -> {
            System.out.println(QrcodeUtils.getQr(qrcode));
        });

        bot.on("message", (MessageListener) message -> {

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
