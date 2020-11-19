db.people.mapReduce(
    function(){
        emit(this.job, 1);
    },
    function(key, value){
        return key
    },
    { out: {inline: 1}}
)
  


