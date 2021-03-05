var express = require("express");
var app = express();
const cors = require('cors');
const bodyParser = require('body-parser');

app.use(cors());
app.use(bodyParser.json());

app.listen(3000, () => {
    console.log("Server running on port 3000");
})

/*

żądanie -> midd1 -> midd2  -> endpoint (res) -> midd3 ->
           render <-  mid4   <-   ...  <-

 */


/*
    GETTERS
 */

app.get("/test-url", (req, res) => {
   res.json(someList);
});

app.post("/save-something", (req, res) => {
    console.log("/save-something");
    console.log(req.body);
    res.status(200);
})


/*
    VALUES
 */
const someList = [
    {id: 1, name: 'Jan', surname: 'Kowalski'},
    {id: 2, name: 'Zbigniew', surname: 'Nowak'}
]