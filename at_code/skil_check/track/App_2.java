package at_code.skil_check.track;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.Arrays;

public class App_2 {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      // 整数xを文字列に変換し、各桁の数字を配列に格納する
      String xStr = scanner.nextLine();

      BigInteger[] digits = new BigInteger[xStr.length()];
      for (int i = 0; i < xStr.length(); i++) {
        digits[i] = BigInteger.valueOf(Character.getNumericValue(xStr.charAt(i)));
      }

      // 配列を昇順にソートする
      Arrays.sort(digits);

      // ソートされた配列を元に最小の値を計算する
      BigInteger minPermutation = BigInteger.ZERO;
      int leadingZeroCount = 0;
      // 0が何個あるかを数える
      for (int i = 0; i < digits.length; i++) {
        if (digits[i].equals(BigInteger.ZERO)) {
          leadingZeroCount++;
        } else {
          break;
        }
      }
      // 先頭に0の次に小さい数を入れて、残りの数を昇順に並べる
      minPermutation = digits[leadingZeroCount];
      for (int i = 0; i < digits.length; i++) {
        if (i != leadingZeroCount) {
          minPermutation = minPermutation.multiply(BigInteger.TEN).add(digits[i]);
        }
      }

      System.out.println(minPermutation);
    }
  }
}
