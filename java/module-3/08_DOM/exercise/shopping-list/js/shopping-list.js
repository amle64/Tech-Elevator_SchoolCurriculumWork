// add pageTitle
let pageTitle = "My Shopping List";
// add groceries
let groceries = ['Eggs','Apples','Bread','Fish','Chips','Cucumbers','Onion','Tomatoes','Milk', 'Orange Juice'];
/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const titleElement = document.getElementById('title');
  titleElement.textContent = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const groceryList = document.querySelector('#groceries');
  
  for (let i =0;i<groceries.length;i++){
    const newListItem = document.createElement('li');
    newListItem.textContent = groceries[i];
    groceryList.appendChild(newListItem);
  }  
}

/**
 * This function will be called when the button is clicked. You will need to get a reference
 * to every list item and add the class completed to each one
 */
function markCompleted() {
  const listItems = document.getElementsByTagName('li');
  for (let i = 0;i<listItems.length;i++){
    listItems[i].classList.add('completed');

  }
}

setPageTitle();

displayGroceries();

// Don't worry too much about what is going on here, we will cover this when we discuss events.
document.addEventListener('DOMContentLoaded', () => {
  // When the DOM Content has loaded attach a click listener to the button
  const button = document.querySelector('.btn');
  button.addEventListener('click', markCompleted);
});
