
lexparse:
	java -jar lib/sablecc.jar -d src grammars/CompilerGrammar.grammar 

main:
	cd src && javac -d ../bin/ Main.java

run:
	cd bin && java Main

all: lexparse
