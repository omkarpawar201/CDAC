const http = require("http");
const file = require("fs")


const server = http.createServer((req, res) => {
    file.readFile("Sample.txt", (err, data) => {
        if (err) {
            console.error(err);
            return;
        }
        else {
            res.writeHead(200, { "content-Type": "Text/html" });
            res.end(data);

        }
    })
});

server.listen(100);