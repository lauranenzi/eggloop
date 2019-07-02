package io.github.eggloop.stl.syntax;

import io.github.eggloop.stl.visitor.FormulaVisitor;

public class Negation implements Formula {

    private Formula argument;

    public Negation(Formula argument) {
        this.argument = argument;
    }

    @Override
    public String toString() {
        return SyntaxUtils.toStringUnaryFormula("!", argument.toString());
    }


    public String toLogicString() {
        return SyntaxUtils.toStringUnaryFormula("¬", argument.toString());
    }

    @Override
    public <T> T accept(FormulaVisitor<T> visitor) {
        return visitor.visit(this);
    }

    public Formula getArgument() {
        return argument;
    }
}
