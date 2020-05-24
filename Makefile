.PHONY: all
all: install bot

.PHONY: install
install:
	mvn clean install -f examples/pom.xml

.PHONY: bot
bot:
	java -jar examples/target/wechaty-examples-1.0.0-SNAPSHOT-jar-with-dependencies.jar

.PHONY: clean
clean:
	rm -fr examples/target/*

.PHONY: version
version:
	@newVersion=$$(awk -F. '{print $$1"."$$2"."$$3+1}' < VERSION) \
		&& echo $${newVersion} > VERSION \
		&& git add VERSION \
		&& git commit -m "$${newVersion}" > /dev/null \
		&& git tag "v$${newVersion}" \
		&& echo "Bumped version to $${newVersion}"
