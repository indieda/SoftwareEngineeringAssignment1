#rule-name: Hello.java
#		javac Hello.java

TARGET=Hello

%.class : %.java
	javac $<

run : ${TARGET}.class
	java ${TARGET}