const http = require('http');
const server = http.createServer(function(req, res){
    res.end("HELLO WORLD");

})
server.listen(3000);