// Get DOM elements
const form = document.getElementById('expense-form');
const expenseList = document.getElementById('expense-list');

// Initialize expenses array
let expenses = [];

// Function to display expenses
function displayExpenses() {
  // Clear previous entries
  expenseList.innerHTML = '';

  // Display each expense
  expenses.forEach((expense, index) => {
    const li = document.createElement('li');
    li.innerHTML = `
      <strong>${expense.name}</strong>: $${expense.amount} on ${expense.date}
      <button onclick="deleteExpense(${index})" class="btn-delete">Delete</button>
    `;
    expenseList.appendChild(li);
  });
}

// Function to add expense
function addExpense(name, amount, date) {
  expenses.push({ name, amount, date });
  displayExpenses();
}

// Function to delete expense
function deleteExpense(index) {
  expenses.splice(index, 1);
  displayExpenses();
}

// Event listener for form submission
form.addEventListener('submit', function(e) {
  e.preventDefault();
  const name = this.querySelector('#name').value;
  const amount = this.querySelector('#amount').value;
  const date = this.querySelector('#date').value;
  if (name && amount && date) {
    addExpense(name, amount, date);
    this.reset();
  } else {
    alert('Please fill in all fields');
  }
});
