var mf = function () {
	var key = this.sex;
	var value = {
	    count: 1,
	    weight: this.weight,
	    height: this.height
	};
    emit(key, value);
};

var rf = function (key, values) {
    var reducedValue = {count: 0, weight: 0, height: 0};
    
    for(var i= 0; i < values.length; i++){
        reducedValue.count += values[i].count;
        reducedValue.weight += values[i].weight;
        reducedValue.height += values[i].height;
    }

    return reducedValue;
};

var finalizeFunction = function (key, reducedValue) {
    var Result = {
        avgHeight: reducedValue.height/reducedValue.count,
        avgWeight: reducedValue.weight/reducedValue.count
    }
   
    return Result;
};
db.people.mapReduce(mf, rf, {out: {inline: 1}, finalize: finalizeFunction});