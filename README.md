# java-wechaty-getting-started [![Java Version](https://img.shields.io/maven-central/v/io.github.wechaty/wechaty?label=Java)](https://mvnrepository.com/artifact/io.github.wechaty/wechaty) [![Java CI with Maven](https://github.com/wechaty/java-wechaty-getting-started/workflows/Java%20CI%20with%20Maven/badge.svg)](https://github.com/wechaty/java-wechaty-getting-started/actions?query=workflow%3A%22Java+CI+with+Maven%22)

[![Java Wechaty](https://wechaty.github.io/java-wechaty/images/java-wechaty.png)](https://github.com/wechaty/java-wechaty-getting-started)

Java Wechaty Starter Project Template that Works Out-of-the-Box

[![Gitpod Ready-to-Code](https://img.shields.io/badge/Gitpod-Ready--to--Code-blue?logo=gitpod)](https://gitpod.io/#https://github.com/wechaty/java-wechaty-getting-started) 
[![Wechaty in Java](https://img.shields.io/badge/Wechaty-Java-blue)](https://github.com/wechaty/java-wechaty)

## Connecting Chatbots

[![Powered by Wechaty](https://img.shields.io/badge/Powered%20By-Wechaty-brightgreen.svg)](https://github.com/Wechaty/wechaty)
[![Java Version](https://img.shields.io/maven-central/v/io.github.wechaty/wechaty?label=Java)](https://mvnrepository.com/artifact/io.github.wechaty/wechaty)

Wechaty is a RPA SDK for Wechat **Individual** Account that can help you create a chatbot in 6 lines of Java.

## The World's Shortest Java ChatBot: 6 lines of Code

```java
class Bot{
  public static void main(String args[]){
    Wechaty bot = Wechaty.instance()
      .onScan((qrcode, statusScanStatus, data) -> System.out.println(QrcodeUtils.getQr(qrcode)))
      .onLogin(user -> System.out.println("User logined :" + user))
      .onMessage(message -> System.out.println("Message:" + message))
      .start(true);
  }
}
```

## Usage

### Install

```sh
# Install Maven
apt install maven

make install
```

### Run

```sh
export WECHATY_PUPPET_SERVICE_TOKEN=your_token_at_here

make bot
```

## Wechaty Getting Started in Multiple Languages

- [TypeScript Wechaty Getting Started](https://github.com/wechaty/wechaty-getting-started)
- [Python Wechaty Getting Started](https://github.com/wechaty/python-wechaty-getting-started)
- [Java Wechaty Getting Started](https://github.com/wechaty/java-wechaty-getting-started)
- [Go Wechaty Getting Started](https://github.com/wechaty/go-wechaty-getting-started)

## Badge

[![Wechaty in Java](https://img.shields.io/badge/Wechaty-Java-blue)](https://github.com/wechaty/java-wechaty)

```md
[![Wechaty in Java](https://img.shields.io/badge/Wechaty-Java-blue)](https://github.com/wechaty/java-wechaty)
```

## Maintainers

[@wechaty/java](https://github.com/orgs/wechaty/teams/java/members)

## Copyright & License

- Code & Docs © 2020 Wechaty Contributors <https://github.com/wechaty>
- Code released under the Apache-2.0 License
- Docs released under Creative Commons
