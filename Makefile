.PHONY: all
all: install bot

.PHONY: install
install:
	mvn clean install -f examples/pom.xml

.PHONY: bot
bot:
	java -jar examples/target/wechaty-examples-1.0.0-SNAPSOHOT-jar-with-dependencies.jar