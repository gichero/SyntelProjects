const express = require('express');
console.log(express);
const app = express();

app.get('/', (req, res)=>{
  res.send(`Hello World Again and again!!!`);
});
app.listen(8080);
console.log('listening on port 8080....');