package cs2130;

public class Boolean {
  /**
   * @brief Computes Boolean multiplication.
   * @param x - value of first Boolean variable
   * @param y - value of second Boolean variable
   * @return result of Boolean multiplication
   */
  static int Multiply(int x, int y) {

    if(x == 1 && y == 1) {
      return 1;
    }

    return 0;
  }

  /**
   * @brief Computes Boolean addition.
   * @param x - value of first Boolean variable
   * @param y - value of second Boolean variable
   *    * @return result of Boolean addition
   */
  static int Add(int x, int y) {

    if(x == 1 || y == 1) {
      return 1;
    }

    return 0;
  }

  /**
   * @brief Computes Boolean complement.
   * @param x - value of Boolean variable
   * @return result of Boolean complement
   */
  static int Complement(int x) {

    if(x == 1) {
      return 0;
    }

    return 1;
  }

  /**
   * @brief Computes result of Booleon expression 1 specified in instructions.
   * @param x - value of first Boolean variable
   * @param y - value of second Boolean variable
   * @param y - value of third Boolean variable
   *    * @return result of the Boolean expression
   */
  static int Expression1(int x, int y, int z) {

    return Add(Add(Add(x, y), Multiply(z, x)), y);
  }

  /**
   * @brief Computes result of Booleon expression 2 specified in instructions.
   * @param x - value of first Boolean variable
   * @param y - value of second Boolean variable
   * @param y - value of third Boolean variable
   *    * @return result of the Boolean expression
   */
  static int Expression2(int x, int y, int z) {

    return Add(Multiply(Complement(x), Complement(y)), Add(z, y));
  }

  /**
   * @brief Computes result of Booleon expression 3 specified in instructions.
   * @param x - value of first Boolean variable
   * @param y - value of second Boolean variable
   * @param y - value of third Boolean variable
   *    * @return result of the Boolean expression
   */
  static int Expression3(int x, int y, int z) {

    return Add(Multiply(Complement(Add(x, z)), Add(y, Complement(x))), Multiply(Multiply(x, Complement(y)), z));
  }
}
