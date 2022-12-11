
const btnwrite= document.getElementsByClassName('btn-write');
btnwrite.addEventListenr('click',()=>{
    
})

date = new Date();
  year = date.getFullYear();
  month = date.getMonth() + 1;
  day = date.getDate();

  document.getElementsByClassName("current_date").innerHTML = month + "/" + day + "/" + year;