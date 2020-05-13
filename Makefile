.PHONY: all
all: install bot

.PHONY: install
install:
	mvn install

.PHONY: bot
bot:
	java examples/ding-dong-bot.java