class ProgrammingLanguageRunner{

	public static void main(String[] args){

		ProgrammingLanguage pl = new ProgrammingLanguage();

		pl.java = 1;
		pl.python = 2;
		pl.c = 3;
		pl.cpp = 4;
		pl.csharp = 5;
		pl.javascript = 6;
		pl.typescript = 7;
		pl.go = 8;
		pl.kotlin = 9;
		pl.swift = 10;
		pl.ruby = 11;
		pl.php = 12;
		pl.r = 13;
		pl.matlab = 14;
		pl.dart = 15;
		pl.rust = 16;
		pl.scala = 17;
		pl.perl = 18;
		pl.groovy = 19;
		pl.objectiveC = 20;


		Syntax syntax = new Syntax();

		syntax.variables = 1;
		syntax.datatypes = 2;
		syntax.operators = 3;
		syntax.ifCondition = 4;
		syntax.elseCondition = 5;
		syntax.switchCase = 6;
		syntax.forLoop = 7;
		syntax.whileLoop = 8;
		syntax.doWhileLoop = 9;
		syntax.arrays = 10;
		syntax.strings = 11;
		syntax.methods = 12;
		syntax.classes = 13;
		syntax.objects = 14;
		syntax.constructors = 15;
		syntax.inheritance = 16;
		syntax.polymorphism = 17;
		syntax.abstraction = 18;
		syntax.encapsulation = 19;
		syntax.exceptionHandling = 20;

		pl.syntax = syntax;

		pl.displayProgrammingLanguageDetails();
	}
} 