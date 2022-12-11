'use-strict'
const mypage= document.querySelector('.mypage');
const signup = document.querySelector('.signups');



function handleClickButton(){
    alert('로그인하세요!');
}
function handleClickInput(){
    alert('환영합니다!')
}


mypage.addEventListener('click',handleClickButton);
signup.addEventListener('click',handleClickInput);
