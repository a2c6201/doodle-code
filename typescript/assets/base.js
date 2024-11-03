const addButton = document.getElementById("btn-add");
const currentProcess = document.getElementById("current-calculation");
const currentResultOutput = document.getElementById("current-result");

function outputResult(result) {
  console.log(currentResultOutput);
  currentResultOutput.innerHTML = result;
}
