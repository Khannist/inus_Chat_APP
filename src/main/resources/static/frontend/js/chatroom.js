const express = require('express'),
      app = express(),
      util = require('util'),
      bodyParser = require('body-parser');





const server = app.listen(7000, function(){
    console.log("Express's started on port 7000");
});

const io = require('socket.io').listen(server, {
  log: false,
  origins: '*:*',
  pingInterval: 3000,
  pingTimeout: 5000
});

io.sockets.on('connection', (socket, opt) => {
  socket.emit('message', {msg: 'Welcome ' + socket.id});

  util.log("connection>>", socket.id, socket.handshake.query)

  socket.on('join', function(roomId, fn) {
    socket.join(roomId, function() {
      util.log("Join", roomId, Object.keys(socket.rooms));
      if (fn)
        fn();
    });
  });

  socket.on('leave', function(roomId, fn) {
    util.log("leave>>", roomId, socket.id)
    socket.leave(roomId, function() {
      if (fn)
        fn();
    });
  });

  socket.on('rooms', function(fn) {
    if (fn)
      fn(Object.keys(socket.rooms));
  });

  // data: {room: 'roomid', msg: 'msg 내용..'}
  socket.on('message', (data, fn) => {
    util.log("message>>", data)

    socket.broadcast.to(data.room).emit('message', {room: data.room, msg: data.msg});

    if (fn)
      fn(data.msg);
  });

  socket.on('message-for-one', (socketid, msg, fn) => {
    // socket.broadcast.to(socketid).emit('message', {msg: msg});
    socket.to(socketid).emit('message', {msg: msg});
  });

  socket.on('disconnecting', function(data) {
    util.log("disconnecting>>", socket.id, Object.keys(socket.rooms))
  });

  socket.on('disconnect', function(data) {
    util.log("disconnect>>", socket.id, Object.keys(socket.rooms))
  });






});