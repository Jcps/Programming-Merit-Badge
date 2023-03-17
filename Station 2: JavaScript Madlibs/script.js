// This function is a chunk of code that runs when the "Go!" button is pressed.
function makeCard() {
  // Get the value from the input field whose Id is "nameInput", and then store
  // this input in a variable called "name"
  let name = document.getElementById("nameInput").value;

  // This sets the content of the "div" element with Id "nameOut" to he value
  // stored in the above variable named "name"
  document.getElementById("nameOut").innerHTML = name;
}
