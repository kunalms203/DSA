function createTimer() {
    let HH = 0;
    let MM = 0;
    let SS = 0;
  
    function timer() {
      console.log(HH, ":", MM, ":", SS);
  
      SS++;
      if (SS === 60) {
        SS = 0;
        MM++;
      }
      if (MM === 60) {
        MM = 0;
        HH++;
      }
      if (HH === 24) {
        HH = 0;
      }
    }
    
    setInterval(timer, 1000); // Call the timer function every second to update the time displayed in the console.
  
    return timer; // Return the timer function
  }
  
  // const myTimer = createTimer();
  // myTimer(); // Start the timer

let a=0
function countere(){
  a++;
  console.log(a);
}

setInterval(countere, 1000) // Call the countere function every second with the initial value of a set to 0.

