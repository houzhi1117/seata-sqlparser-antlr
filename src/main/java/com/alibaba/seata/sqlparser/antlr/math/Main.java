package com.alibaba.seata.sqlparser.antlr.math;


import java.io.FileInputStream;
import java.io.InputStream;

import com.alibaba.seata.sqlparser.antlr.math.parser.MathParserLexer;
import com.alibaba.seata.sqlparser.antlr.math.parser.MathParserParser;
import com.alibaba.seata.sqlparser.antlr.math.visitor.MathVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * @author houzhi
 * @date 2020-7-11
 * @description
 */
public class Main {

    public static void main(String[] args) throws Exception {

        String inputFile = "F:\\seata\\git-seata\\seata-sqlparser-antlr\\math.txt";
        InputStream is = System.in;

        if ( inputFile!=null ) is = new FileInputStream(inputFile);
        ANTLRInputStream input = new ANTLRInputStream(is);


        MathParserLexer lexer = new MathParserLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MathParserParser parser = new MathParserParser(tokens);
        ParseTree tree = parser.prog(); // parse
        MathVisitor eval = new MathVisitor();
        eval.visit(tree);
    }
}
