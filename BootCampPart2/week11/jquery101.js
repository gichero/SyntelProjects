// jquery targeting rules:
// 1. follow CSS.
// 2. ID = #
// 3. class = .
// 4. tag or window or document is bare.
$(document).ready(function(){
  
  const thing = $('#thing');
  
  $('button').click(function(){
    console.log(this);
    const whatToDo = $(this).attr('do');
    console.log(whatToDo);
    if(whatToDo === 'hide'){
      $('#thing').hide();
    }else if(whatToDo === 'show'){
      ('#thing').show();
    }
    else if(whatToDo === 'toggle'){
      ('#thing').toggle();
    }
   
  })
});


