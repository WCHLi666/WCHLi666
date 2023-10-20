<!DOCTYPE html>
<html lang="en">
    <head>
    <meta charset="UTF-8">
    <title></title>
<script src="../js/jquery-3.4.1.min.js"></script>
<script src="../js/modernizr.2.5.3.min.js"></script>
<script src="../js/turn.min.js"></script>
</head>
<body>
<div id="flipbook">
    <div
</div>
<script type="text/javascript">
    yepnope({
    test:Modernizr.csstransforms,
    yep:['turn.min.js'],
    nope:['../js/turn.html4.min.js'],
    both:[],
    complete:function (){
    $("#flipbook").turn({
    width:400,
    height:300,
    autoCenter:true
})
}
})
</script>
</body>
</html>