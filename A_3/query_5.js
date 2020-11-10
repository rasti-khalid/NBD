db.people.find({birth_date:{"$gte":"2000-1-1T05:44:11Z"}}, {first_name:1,last_name:1,birth_date:1, _id:0, "location.city":1})
