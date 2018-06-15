const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res)=>{
  if(req.url === '/'){
    res.writeHead(200,{'content-type':'text/html'});
    const weatherWidgetHTML = fs.readFileSync("../weatherWidget.html");
    res.end(weatherWidgetHTML);
  }else if(req.url === '/weatherWidget.js'){
    res.writeHead(200,{'content-type':'text/js'});
    const weatherWidgetJS = fs.readFileSync("../weatherWidget.js");
    res.end(weatherWidgetJS);
  }else if(req.url === '/style.css'){
    res.writeHead(200,{'content-type':'text/css'});
    const styleCSS = fs.readFileSync('../style.css');
    res.end(styleCSS);
  }else if(req.url === '/weather.jpg'){
    res.writeHead(200,{'content-type':'image/jpg'});
    const weatherJPG = fs.readFileSync('../weather.jpg');
    res.end(weatherJPG);
  }else{
    res.end(`Page not found!`);
  }
});

server.listen(3000);
console.log(`Server is listening on port 3000...`);