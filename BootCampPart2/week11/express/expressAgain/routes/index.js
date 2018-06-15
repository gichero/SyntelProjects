var express = require('express');
var router = express.Router();

let bandMembers = [
  `Tommy Lee`,
  `Mick Marks`,
  `Vince Neil`,
  `Nicky Stixx`
];
console.log(bandMembers);

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { theBand: bandMembers });
});
router.get('/add/:member', function(req, res, next) {
  // res.render('index', { theBand: bandMembers });
  const newMember = req.params.member;
  bandMembers.push(newMember);
  res.redirect('/');
});
router.get('/remove/:member', function(req, res, next) {
  // res.render('index', { theBand: bandMembers });
  const removeMember = req.params.member;
  const indexToSplice = bandMembers.indexOf(removeMember);
  if(indexToSplice > -1){
    bandMembers.splice(indexToSplice);
  }
  res.redirect('/');
});

module.exports = router;
