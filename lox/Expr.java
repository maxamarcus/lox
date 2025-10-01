package lox;

/* Grammar

expression  -> literal | unary | binary | grouping ;
binary      -> expression operator expression ;
unary       -> ("-" | "!") expression ;
literal     -> NUMBER | STRING | "true" | "false" | "nil" ;
grouping    -> "(" expression ")" ;
*/

abstract class Expr {
    
    static class Binary extends Expr {

        final Expr left;
        final Token operator;
        final Expr right;

        Binary(Expr left, Token operator, Expr right) {
            this.left = left;
            this.operator = operator;
            this.right = right;
        }
    }

    static class Unary extends Expr {

        final Token operator;
        final Expr expression;

        Unary(Token operator, Expr expression) {
            this.operator = operator;
            this.expression = expression;
        }
    }

    static class Literal extends Expr {
    }

    static class Grouping extends Expr {
    }
}
