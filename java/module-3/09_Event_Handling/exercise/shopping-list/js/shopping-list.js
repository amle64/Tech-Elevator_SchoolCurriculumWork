let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.textContent = pageTitle;
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.textContent = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

function updateButtonText() {
  const completeButton = document.getElementById('toggleAll');
  if (allItemsIncomplete) {
    completeButton.textContent = 'Mark All Complete';
  } else {
    completeButton.textContent = 'Mark All Incomplete';
  }
}

document.addEventListener('DOMContentLoaded',()=> {
  setPageTitle();
  displayGroceries();

  //Variable tasks is all of the grocery items
  const tasks = document.querySelectorAll('li');

  //Access the grocery item for the array
  tasks.forEach((task)=>{

    //Add eventListener for click that denotes completed task
    //Crossed line and green circle
    task.addEventListener('click',()=>{
      if(!task.classList.contains('completed')){
        task.classList.add('completed');
        task.querySelector('i').classList.add('completed');
      }
    })

    //Add eventListener for double click to undo completed task
    //Undo action
    task.addEventListener('dblclick',()=>{

      if(task.classList.contains('completed')){
        task.classList.remove('completed');
        task.querySelector('i').classList.remove('completed');
      }
    })

          
    })

    
    //Variable for the MarkAllComplete
    const completeButton = document.querySelector('#toggleAll.btn');

    //Add eventListener for click to cross all items and green circle
    completeButton.addEventListener('click',()=>{
      
      if(allItemsIncomplete){
        tasks.forEach((task) => {
          task.classList.add('completed');
          task.querySelector('i').classList.add('completed');
        });
        completeButton.textContent = 'Mark All Incomplete';
        allItemsIncomplete = false;
        return;
      } else {
        tasks.forEach((task) => {
          task.classList.remove('completed');
          task.querySelector('i').classList.remove('completed');
          completeButton.textContent = 'Mark All Complete';
          allItemsIncomplete = true;
          return;
        });
      }
  });



});