const logout = document.querySelector('.logout');
const basicColor= document.querySelector('.bg-lights');
const firstColorBtn =document.querySelector('.firstcolorbtn');
const secondColorBtn =document.querySelector('.secondcolorbtn');
const thirdColorBtn =document.querySelector('.thirdcolorbtn');
const fourthColorBtn =document.querySelector('.fourthcolorbtn');
const fifthColorBtn =document.querySelector('.fifthcolorbtn');
const sixthColorBtn =document.querySelector('.sixthcolorbtn');
const seventhColorBtn =document.querySelector('.seventhcolorbtn');
const eighthColorBtn =document.querySelector('.eighthcolorbtn');








function handleClickButton(){
    alert('로그아웃하였습니다!');
}

function handleClickButton2(){
    basicColor.style.backgroundColor = "rgba(var(--bs-light-rgb))";
}
function handleClickButton3(){
    basicColor.style.backgroundColor = "gray";
}
function handleClickButton4(){
    basicColor.style.backgroundColor = "yellow";
}
function handleClickButton5(){
    basicColor.style.backgroundColor = "orange";
}
function handleClickButton6(){
    basicColor.style.backgroundColor = "green";
}
function handleClickButton7(){
    basicColor.style.backgroundColor = "blue";
}
function handleClickButton8(){
    basicColor.style.backgroundColor = "purple";
}
function handleClickButton9(){
    basicColor.style.backgroundColor = "black";
    basicColor.style.color="white";
}



logout.addEventListener('click',handleClickButton);
firstColorBtn.addEventListener('click',handleClickButton2);
secondColorBtn.addEventListener('click',handleClickButton3);
thirdColorBtn.addEventListener('click',handleClickButton4);
fourthColorBtn.addEventListener('click',handleClickButton5);
fifthColorBtn.addEventListener('click',handleClickButton6);
sixthColorBtn.addEventListener('click',handleClickButton7);
seventhColorBtn.addEventListener('click',handleClickButton8);
eighthColorBtn.addEventListener('click',handleClickButton9);








