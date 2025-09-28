const express = require('express');
const fs = require('fs')
const users1 = require('./MOCK_DATA.json');
const port = 300;
const app = express();
app.set('view engine', 'hbs');


app.use((req, res, next) =>{
    next();
});

app.get('/', (req, res) => {
    res.send("Hello From Express");
});

app.get('/calc', (req, res) => {
    res.render('C:/Users/IET/Desktop/Omkar Pawar/WPT/Day 14/Assignment 1/Calculation.hbs');
});

app.get('/users', (req, res) => {

    res.json(users1);
});

app.get('/users/:id', (req, res) => {
    const id = Number(req.params.id);

    const user = users1.find(
        user => user.id === id
    )

    return res.json(user);
});

app.get('/users/email/:email', (req, res) => {
    const email = req.params.email;

    const user = users1.find(
        user => user.email === email
    )

    return res.json(user);
});

app.get('/users5/:id/:email', (req, res) => {
    const id = Number(req.params.id);
    const email = req.params.email;

    const user = users1.find(
        user => user.id === id && user.email === email
    )

    return res.json(user);
});

// app.get('/users/:id', (req, res) => {
//     const id = Number(req.params.id)

//     const user = users1.find(
//         user => user.id === user
//     )

//     return res.json(user)
// });

app.delete('/users/:id', (req, res) => {
    const id = Number(req.params.id);

    const userIndex = users1.findIndex(
        user => user.id === id
    )
    if (userIndex === -1)
        return res.status(404).send('Data not found');

    const [deletedUser] = users1.splice(userIndex, 1);

    return res.status(200).json({ deleted: deletedUser });
});

app.use(express.urlencoded({ extended: false }));

app.post('/adduser', (req, res) => {
    const data = req.body;
    users1.push({ id: users1.length + 1, data });

    fs.writeFile('./MOCK_DATA.json',
        JSON.stringify(users1), (err) => { console.log(err) }
    )

    return res.json("data added ");
});

// app.put();

app.get('/aboutus', (req, res) => {
    res.sendFile("C:/Users/IET/Desktop/Omkar Pawar/WPT/Day 14/Assignment 1/About_Us.html");
});

app.get("/Calculation", (req, res) => {
    res.render("Calculation")
})

app.get('/cal', (req, res) => {
    let n1 = req.body.num1;
    let n2 = req.body.num2;

    let sum = Number(n1) + Number(n2);
    res.render("calculation", { result: sum });
});

app.listen(port)// 
console.log("Server Started");