
//cosole.dir(document);

function rollDice(){
  console.log("Gunz!")
  //random number between 1-6
  let rand1 = Math.ceil(Math.random()*6);
  let rand2 = Math.ceil(Math.random()*6);
  let dice = document.getElementById("dice");
  dice.children[0].src=`./dragon-assets/d${rand1}.gif`
  dice.children[1].src=`./dragon-assets/d${rand2}.gif`
  console.dir(dice);
  
  if(rand1 + rand2 > 6){
    document.getElementById('dragon').children[0].src="https://www.google.com/search?q=lisa+simpson+memes&rlz=1C1GCEB_enUS785US785&tbm=isch&tbo=u&source=univ&sa=X&ved=0ahUKEwj5xP7_ge_aAhVi94MKHVGMC4IQ7AkINg&biw=1079&bih=492#imgrc=T26THnyS6YBIYM:"
  }
  //let dragon = document.getElementById('dragon');
  console.dir(dragon);
  dragon.innerHTML = `<h1>JavaScript was here!</h1>`;
}
