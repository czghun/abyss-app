window.onscroll = function() {myFunction()};

var navbar = document.getElementById("navbar");
var sticky2 = navbar.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky2) {
    navbar.classList.add("sticky2")
  } else {
    navbar.classList.remove("sticky2");
  }
}