var express = require('express');
var router = express.Router();
const mysql = require('mysql');
const db_creds = require('../config/config.js');
//set up a connection to use and reuse...
const connection = mysql.createConnection({
  host: '127.0.0.1',
  user: 'root',
  password: 'todo',
  database: 'todo'
})

connection.connect();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Express' });
});

router.post('/addItem',(req, res, next)=>{
  const taskName = req.body.newTask;
  const taskdate = req.body.newTaskDate;
});

module.exports = router;
