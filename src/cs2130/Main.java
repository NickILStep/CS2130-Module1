package cs2130;

public class Main {

  public static void main(String[] args) {

    // Print truth table for proposition 1
    System.out.println("Proposition 1:");
    System.out.println("--------------------");
    System.out.println("|p|q|r|(p∧q)∨¬(r∨p)|");
    System.out.println("|T|T|T|     " + Logic.Proposition1('T', 'T', 'T') + "      |");
    System.out.println("|T|T|F|     " + Logic.Proposition1('T', 'T', 'F') + "      |");
    System.out.println("|T|F|T|     " + Logic.Proposition1('T', 'F', 'T') + "      |");
    System.out.println("|T|F|F|     " + Logic.Proposition1('T', 'F', 'F') + "      |");
    System.out.println("|F|T|T|     " + Logic.Proposition1('F', 'T', 'T') + "      |");
    System.out.println("|F|T|F|     " + Logic.Proposition1('F', 'T', 'F') + "      |");
    System.out.println("|F|F|T|     " + Logic.Proposition1('F', 'F', 'T') + "      |");
    System.out.println("|F|F|F|     " + Logic.Proposition1('F', 'F', 'F') + "      |");
    System.out.println("--------------------");
    System.out.println();

    // Print truth table for proposition 2
    System.out.println("Proposition 2:");
    System.out.println("--------------------");
    System.out.println("|p|q|r|(q∨p)→(¬q∧r)|");
    System.out.println("|T|T|T|     " + Logic.Proposition2('T', 'T', 'T') + "      |");
    System.out.println("|T|T|F|     " + Logic.Proposition2('T', 'T', 'F') + "      |");
    System.out.println("|T|F|T|     " + Logic.Proposition2('T', 'F', 'T') + "      |");
    System.out.println("|T|F|F|     " + Logic.Proposition2('T', 'F', 'F') + "      |");
    System.out.println("|F|T|T|     " + Logic.Proposition2('F', 'T', 'T') + "      |");
    System.out.println("|F|T|F|     " + Logic.Proposition2('F', 'T', 'F') + "      |");
    System.out.println("|F|F|T|     " + Logic.Proposition2('F', 'F', 'T') + "      |");
    System.out.println("|F|F|F|     " + Logic.Proposition2('F', 'F', 'F') + "      |");
    System.out.println("--------------------");
    System.out.println();

    // Print truth table for proposition 3
    System.out.println("Proposition 3:");
    System.out.println("--------------------");
    System.out.println("|p|q|r|(p↔r)∨(q∧¬p)|");
    System.out.println("|T|T|T|     " + Logic.Proposition3('T', 'T', 'T') + "      |");
    System.out.println("|T|T|F|     " + Logic.Proposition3('T', 'T', 'F') + "      |");
    System.out.println("|T|F|T|     " + Logic.Proposition3('T', 'F', 'T') + "      |");
    System.out.println("|T|F|F|     " + Logic.Proposition3('T', 'F', 'F') + "      |");
    System.out.println("|F|T|T|     " + Logic.Proposition3('F', 'T', 'T') + "      |");
    System.out.println("|F|T|F|     " + Logic.Proposition3('F', 'T', 'F') + "      |");
    System.out.println("|F|F|T|     " + Logic.Proposition3('F', 'F', 'T') + "      |");
    System.out.println("|F|F|F|     " + Logic.Proposition3('F', 'F', 'F') + "      |");
    System.out.println("--------------------");
    System.out.println();

    // Print truth table for Boolean expression 1
    System.out.println("Expression 1:");
    System.out.println("--------------------");
    System.out.println("|x|y|z|(x+y)+(zx)+y|");
    System.out.println("|0|0|0|     " + Boolean.Expression1(0, 0, 0) + "      |");
    System.out.println("|0|0|1|     " + Boolean.Expression1(0, 0, 1) + "      |");
    System.out.println("|0|1|0|     " + Boolean.Expression1(0, 1, 0) + "      |");
    System.out.println("|0|1|1|     " + Boolean.Expression1(0, 1, 1) + "      |");
    System.out.println("|1|0|0|     " + Boolean.Expression1(1, 0, 0) + "      |");
    System.out.println("|1|0|1|     " + Boolean.Expression1(1, 0, 1) + "      |");
    System.out.println("|1|1|0|     " + Boolean.Expression1(1, 1, 0) + "      |");
    System.out.println("|1|1|1|     " + Boolean.Expression1(1, 1, 1) + "      |");
    System.out.println("--------------------");
    System.out.println();

    // Print truth table for Boolean expression 2
    System.out.println("Expression 2:");
    System.out.println("------------------");
    System.out.println("|x|y|z|x′y′+(z+y)|");
    System.out.println("|0|0|0|    " + Boolean.Expression2(0, 0, 0) + "     |");
    System.out.println("|0|0|1|    " + Boolean.Expression2(0, 0, 1) + "     |");
    System.out.println("|0|1|0|    " + Boolean.Expression2(0, 1, 0) + "     |");
    System.out.println("|0|1|1|    " + Boolean.Expression2(0, 1, 1) + "     |");
    System.out.println("|1|0|0|    " + Boolean.Expression2(1, 0, 0) + "     |");
    System.out.println("|1|0|1|    " + Boolean.Expression2(1, 0, 1) + "     |");
    System.out.println("|1|1|0|    " + Boolean.Expression2(1, 1, 0) + "     |");
    System.out.println("|1|1|1|    " + Boolean.Expression2(1, 1, 1) + "     |");
    System.out.println("------------------");
    System.out.println();

    // Print truth table for Boolean expression 3
    System.out.println("Expression 3:");
    System.out.println("-------------------------");
    System.out.println("|x|y|z|(x+z)′(y+x′)+xy′z|");
    System.out.println("|0|0|0|        " + Boolean.Expression3(0, 0, 0) + "        |");
    System.out.println("|0|0|1|        " + Boolean.Expression3(0, 0, 1) + "        |");
    System.out.println("|0|1|0|        " + Boolean.Expression3(0, 1, 0) + "        |");
    System.out.println("|0|1|1|        " + Boolean.Expression3(0, 1, 1) + "        |");
    System.out.println("|1|0|0|        " + Boolean.Expression3(1, 0, 0) + "        |");
    System.out.println("|1|0|1|        " + Boolean.Expression3(1, 0, 1) + "        |");
    System.out.println("|1|1|0|        " + Boolean.Expression3(1, 1, 0) + "        |");
    System.out.println("|1|1|1|        " + Boolean.Expression3(1, 1, 1) + "        |");
    System.out.println("-------------------------");
    System.out.println();

  }
}
