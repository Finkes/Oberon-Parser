package dhbw.compilerbau.oberonparser.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.DOTTreeGenerator;

import dhbw.compilerbau.oberonparser.parser.OberonLexer;
import dhbw.compilerbau.oberonparser.parser.OberonParser;
import dhbw.compilerbau.oberonparser.parser.OberonParser.module_return;

public class ParserTest 
{
	public static void main(String[] args) 
	{
		try
		{
			//load testfile from folder
			FileInputStream fileInputStream = new FileInputStream(new File("OberonTestFiles/test2.oberon"));
			
			//create ANTLR input stream
			ANTLRInputStream inputStream = new ANTLRInputStream(fileInputStream);
			
			//create lexer
			OberonLexer lexer = new OberonLexer(inputStream);
			
			//Buffer for tokens
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			
			//create parser
			OberonParser parser = new OberonParser(tokens);
			
			//start parser at it's first rule
			module_return result = parser.module();
			CommonTree tree = (CommonTree)result.getTree();
			
			//log tree to console
			System.out.println(tree.toStringTree());
			
			DOTTreeGenerator genarator = new DOTTreeGenerator();
			
			PrintWriter writer = new PrintWriter(new File("graphviz/graph"));
        	
        	writer.write(genarator.toDOT(tree).toString());
        	
        	writer.close();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		

	}

}
