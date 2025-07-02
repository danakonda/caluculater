// 1. Declare the lunches array
let lunches = [];

// 2. addLunchToEnd function
function addLunchToEnd(array, lunchItem) {
  array.push(lunchItem);
  console.log(`${lunchItem} added to the end of the lunch menu.`);
  return array;
}

// 3. addLunchToStart function
function addLunchToStart(array, lunchItem) {
  array.unshift(lunchItem);
  console.log(`${lunchItem} added to the start of the lunch menu.`);
  return array;
}

// 4. removeLastLunch function
function removeLastLunch(array) {
  if (array.length === 0) {
    console.log("No lunches to remove.");
  } else {
    const removedItem = array.pop();
    console.log(`${removedItem} removed from the end of the lunch menu.`);
  }
  return array;
}

// 5. removeFirstLunch function
function removeFirstLunch(array) {
  if (array.length === 0) {
    console.log("No lunches to remove.");
  } else {
    const removedItem = array.shift();
    console.log(`${removedItem} removed from the start of the lunch menu.`);
  }
  return array;
}

// 6. getRandomLunch function
function getRandomLunch(array) {
  if (array.length === 0) {
    console.log("No lunches available.");
  } else {
    const randomIndex = Math.floor(Math.random() * array.length);
    console.log(`Randomly selected lunch: ${array[randomIndex]}`);
  }
}

// 7. showLunchMenu function
function showLunchMenu(array) {
  if (array.length === 0) {
    console.log("The menu is empty.");
  } else {
    console.log(`Menu items: ${array.join(", ")}`);
  }
}
addLunchToEnd(lunches, "Tacos");
addLunchToStart(lunches, "Pizza");
removeLastLunch(lunches);
removeFirstLunch(lunches);
getRandomLunch(lunches);
showLunchMenu(lunches);
