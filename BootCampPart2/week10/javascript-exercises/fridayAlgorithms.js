function caseConverter(){
  //replacing camelCase to snake_case
  var snake_case = "master_ace_master";
  var toCamelCase = snake_case.replace(/([A-Z])/g, function($1){
    return "_","" + $1.toUpperCase();
  });
  var camelCase = "snakeCaseWordAgain";
  var toSnake_case = camelCase.replace(/([A-Z])/g, function($1){
  return $1.toLowerCase().replace("","_");

  });
  console.log(toCamelCase);
  console.log(toSnake_case);
}

caseConverter()

// function creditCardNo(){
//   var creditCard = [];
//   for(var i = 0; i <creditCard.length; i++){
//     if c
//   }
// }