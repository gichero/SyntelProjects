const ExtractData = React.createClass({
  getInitialState: function(){
    return {
      data: [
        {
          author:{
            avatarUrl: "http://iconpopanswers.com/wp-content/uploads/2013/04/icomania-large-167.jpg",
            name:"neo"
          },
          commentHeading: "I am the One.",
          text: "Humanity, relax. I will save you.",
          date: "Today",
          userBadge: [ 
            'Superman',
            'Herald',
            'Engineer'
          ]
        },
        {
          author:{
            avatarUrl: "https://maxcdn.icons8.com/Color/PNG/512/Cinema/morpheus-512.png",
            name:"Morpheus"
          },
          commentHeading: "There is no spoon.",
          text: "Don't think you are. Know you are.",
          date: "Two days ago",
          userBadge: [ 
            'The man',
            'Bard',
            'Samurai swordsman'
          ]
        }
      ]
    }
  },
  render: function(){
    return (
      <div>
        <Comment info={this.state.data[0]}/>
        <Comment info={this.state.data[1]}/>
      </div>
    )
  }

});

function Comment(props) {
  return (
    <div className="Comment">
    <div className="UserInfo">
    <img className="Avatar"
    src={props.info.author.avatarUrl}
    alt={props.info.author.name}
    />
    <div className="UserInfo-name">
    {props.info.author.name}
    </div>
    </div>
    <div className="Comment-body">
    <h1>{props.info.commentHeading}</h1>
    <div className="Comment-text">{props.info.text}</div>
    <div className="Comment-date">
    {Date(props.info.date)}
    </div>
    </div>
    <div className="UserBadges">
    <div className="badge">{props.info.userBadge[0]}</div>
    <div className="badge">{props.info.userBadge[1]}</div>
    <div className="badge">{props.info.userBadge[2]}</div>
    </div>
    </div>
  );``
 }

 ReactDOM.render(
   <ExtractData/>,
   document.getElementById('root')
 )