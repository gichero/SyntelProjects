function convertToRoman(num) {

  var romanNumerals = [ 'M', 'CM', 'D', 'CD', 'C', 'XC', 'L', 'XL', 'X', 'IX', 'V', 'IV', 'I' ],
    decimals = [ 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 ];


  var romanized = "";

  decimals.map(function(decimal, i) {
      while (num >= decimal) {
        romanized += romanNumerals[i];
        num -= decimal;
      }
  });

 return romanized;
}

convertToRoman(23);