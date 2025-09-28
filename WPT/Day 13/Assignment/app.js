const express = require('express');
const users1 = require('./MOCK_DATA.json');
const port = 3000;
const app = express();

app.get('/', (req, res) => {
    res.send("Hello From Express");
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

app.get('/users/:id/:email', (req, res) => {
    const id = Number(req.params.id);
    const email = Number(req.params.email);

    const user = users1.find(
        user => user.id === id || user.email === email
    )

    return res.json(user);
});

app.get('/users/:id', (req, res) => {
    const id = Number(req.params.id)

    const user = users1.find(
        user => user.id === user
    )

    return res.json(user)
});

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

app.listen(port)// 
console.log("Server Started");