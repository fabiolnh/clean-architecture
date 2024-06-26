package com.example.demo.domain.order.validations;

// An Example of a validation that could be inside of the Domain
// Clean Architecture: Entity

public class ValidateCpf {


  private static final int FACTOR_FIRST_DIGIT = 10;
  private static final int FACTOR_SECOND_DIGIT = 11;

  public static boolean validate(String rawCpf) {
    if (rawCpf == null || rawCpf.isEmpty()) return false;
    String cpf = removeNonDigits(rawCpf);
    if (!isValidLength(cpf)) return false;
    if (allDigitsEqual(cpf)) return false;
    int firstDigit = calculateDigit(cpf, FACTOR_FIRST_DIGIT);
    int secondDigit = calculateDigit(cpf, FACTOR_SECOND_DIGIT);
    return extractDigit(cpf).equals(String.valueOf(firstDigit) + secondDigit);
  }

  private static String removeNonDigits(String cpf) {
    return cpf.replaceAll("\\D", "");
  }

  private static boolean isValidLength(String cpf) {
    return cpf.length() == 11;
  }

  private static boolean allDigitsEqual(String cpf) {
    char firstDigit = cpf.charAt(0);
    return cpf.chars().allMatch(digit -> digit == firstDigit);
  }

  private static int calculateDigit(String cpf, int factor) {
    int total = 0;
    for (int i = 0; i < 9; i++) {
      total += Character.getNumericValue(cpf.charAt(i)) * factor--;
    }
    int remainder = total % 11;
    return (remainder < 2) ? 0 : 11 - remainder;
  }

  private static String extractDigit(String cpf) {
    return cpf.substring(9);
  }
}