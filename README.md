# java-wechaty-getting-started

Java Wechaty Starter Project Template that Works Out-of-the-Box

## Connecting Chatbots

[![Powered by Wechaty](https://img.shields.io/badge/Powered%20By-Wechaty-brightgreen.svg)](https://github.com/Wechaty/wechaty)

Wechaty is a RPA SDK for Wechat **Individual** Account that can help you create a chatbot in 6 lines of Java.

## The World's Shortest Java ChatBot: 6 lines of Code

```java
class Bot{
  public static void main(String args[]){
    bot = Wechaty.instance()
      .on('scan', (qrcode, status string) -> System.out.println('Scan QR Code to login: %s\nhttps://api.qrserver.com/v1/create-qr-code/?data=%s', status, encodeURIComponent(qrcode)))
      .on('login', user -> System.out.println('User %s logined', user))
      .on('message', message -> System.out.println('Message: %s', message))
      .start();
  }
}
```

## Usage

### Install

```sh
make install
```

### Run

```sh
make bot
```

## Copyright & License

- Code & Docs © 2020-now Wechaty <https://github.com/wechaty>
- Code released under the Apache-2.0 License
- Docs released under Creative Commons
