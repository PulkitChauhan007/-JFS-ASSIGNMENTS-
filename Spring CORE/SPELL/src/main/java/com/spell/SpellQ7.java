package com.spell;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;



public class SpellQ7 {
	    public static void main(String[] args) {

	        /**
	         * SpEL is an exression language supporting the features of querying and manipulating an object graph at runtime.
	         */
	        ExpressionParser parser = new SpelExpressionParser();

	        Expression exp = parser.parseExpression("'Hello SPELL'");
	        String msg = (String)exp.getValue();
	        System.out.println(msg);


	        ExpressionParser parser1 = new SpelExpressionParser();
	        Expression exp1 = parser1.parseExpression("'Welcome SPELL'.concat('!')");
	        String message = (String) exp1.getValue();
	        System.out.println(message);
	    }
	}