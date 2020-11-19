db.people.aggregate(
    { 
        $group: {	_id: "$sex", 
                  avgHeight: { $avg: {"$toDouble": "$height"} },
                  avgWeight: { $avg: {"$toDouble": "$weight"}}
              }
    },
    {
        $sort: {
            sex: 1
        }
    }
  

  )
  
