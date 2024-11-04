let result = 0;
let log = [];

function addNumbers() {
  console.log("type of userInput", typeof userInput.value);
  result += parseInt(userInput.value);
  console.log("type of result", typeof result);
  const newLog = {
    type: "ADD",
    num: userInput.value
  }
  log.push(newLog);
  console.log(log);
  outputResult(result);
}

function clear() {
  result = 0;
  log.splice(0);
  outputResult(result);
}

addButton.addEventListener("click", addNumbers);
clearButton.addEventListener("click", clear)
