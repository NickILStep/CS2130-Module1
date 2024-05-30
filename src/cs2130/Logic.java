package cs2130;

public class Logic {
  /**
   * @brief Computes logical conjunction.
   * @param p - value of first logical variable
   * @param q - value of second logical variable
   * @return result of logical conjunction
   */
  static char Conjunction(char p, char q) {
    char junct;

    if(p == 'T' && q == 'T') {
      junct = 'T';
    }
    else {
      junct = 'F';
    }
    
    return junct;
  }

  /**
   * @brief Computes logical disjunction.
   * @param p - value of first logical variable
   * @param q - value of second logical variable
   * @return result of logical disjunction
   */
  static char Disjunction(char p, char q) {
    char disjunct;

    if (p == 'T' || q == 'T') {
      disjunct = 'T';
    }
    else {
      disjunct = 'F';
    }

    return disjunct;
  }

  /**
   * @brief Computes logical negation.
   * @param p - value of logical variable
   * @return result of logical negation
   */
  static char Negation(char p) {

    if(p == 'T') {
      return 'F';
    }

    return 'T';
  }

  /**
   * @brief Computes logical conditional.
   * @param p - value of first logical variable
   * @param q - value of second logical variable
   * @return result of logical conditional
   */
  static char Conditional(char p, char q) {

    if(p == 'F') {
      return 'T';
    }
    else if(q == 'T') {
      return 'T';
    }

    return 'F';
  }

  /**
   * @brief Computes logical biconditional.
   * @param p - value of first logical variable
   * @param q - value of second logical variable
   * @return result of logical biconditional
   */
  static char Biconditional(char p, char q) {

    if(p == q) {
      return 'T';
    }

    return 'F';
  }

  /**
   * @brief Computes result of compound proposition 1 specified in instructions.
   * @param p - value of first logical variable
   * @param q - value of first logical variable
   * @param r - value of second logical variable
   * @return result of the proposition
   */
  static char Proposition1(char p, char q, char r) {

    return Disjunction(Conjunction(p, q), Negation(Disjunction(r, p)));
  }

  /**
   * @brief Computes result of compound proposition 2 specified in instructions.
   * @param p - value of first logical variable
   * @param q - value of first logical variable
   * @param r - value of second logical variable
   * @return result of the proposition
   */
  static char Proposition2(char p, char q, char r) {

    return Conditional(Disjunction(q, p), Conjunction(Negation(q), r));
  }

  /**
   * @brief Computes result of compound proposition 3 specified in instructions.
   * @param p - value of first logical variable
   * @param q - value of first logical variable
   * @param r - value of second logical variable
   * @return result of the proposition
   */
  static char Proposition3(char p, char q, char r) {

    return Disjunction(Biconditional(p, r), Conjunction(q, Negation(p)));
  }
}
