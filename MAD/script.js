document.getElementById('welcomeButton').addEventListener('click', function() {
  alert('Welcome to Our App!');
});


function validateForm() {
  // Get form fields
  const name = document.getElementById('name').value;
  const email = document.getElementById('email').value;
  const gender = document.querySelector('input[name="gender"]:checked');
  const dob = document.getElementById('dob').value;
  const country = document.getElementById('country').value;

  if (name === '') {
    alert('Please enter your name.');
    return false;
  }
  
  if (email === '') {
    alert('Please enter your email.');
    return false;
  }

  if (!gender) {
    alert('Please select your gender.');
    return false;
  }

  if (dob === '') {
    alert('Please enter your date of birth.');
    return false;
  }

  if (country === '') {
    alert('Please select your country.');
    return false;
  }

  alert('Form Submitted Successfully!');
  return true;
}
