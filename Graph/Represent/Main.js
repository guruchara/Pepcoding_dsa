let inputArr = process.argv.slice(2);
let command = inputArr[0];
switch (command){
    case "tree":
        //call tree function
        console.log("tree function called and executed succesfully");
        break;
    case "organize":
        //call organize function
        console.log("tree function called and executed succesfully");
        break;
    case "help":
        //call help function
        console.log("tree function called and executed succesfully");
        break;
    default:
        console.log("command not recognized :");
        break;
}
