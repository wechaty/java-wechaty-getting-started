package io.github.wechaty.examples;


import io.github.wechaty.MessageListener;
import io.github.wechaty.ScanListener;
import io.github.wechaty.Wechaty;
import io.github.wechaty.filebox.FileBox;
import io.github.wechaty.user.Contact;
import io.github.wechaty.user.Room;
import io.github.wechaty.utils.QrcodeUtils;
import java.io.IOException.*;

import okhttp3.OkHttpClient;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.List;
import java.util.stream.Collectors;


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

        bot.on("room-join", (room, inviteeList, inviter, date) -> {
            List<String> nameList = inviteeList.stream().map(Contact::name).collect(Collectors.toList());
            room.say("欢迎" + nameList + "加入群聊");

        });
        bot.start(true);

    }



}
