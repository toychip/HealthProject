

function showMakeRoutine() {
     window.open("make-routine.html", "make-routine-page", "width=700, height=500, left=500, top=200");
    }


 
    const makeRoutineForm= document.querySelector("#makeRoutine-form");
    const makeRoutineList= document.querySelector("#makeRoutine-list");
    // Input이 form안에 있으므로
    const makeRoutineInput =makeRoutineForm.querySelector("input")
    
    // 추가되기 때문에 let
    let makeRoutine=[];  
    
    // submit할때 일어나는 일들
    function makeRoutineubmit(event){
        event.preventDefault();
        const newTodo=makeRoutineInput.value;
        makeRoutineInput.value="";
        // makeRoutine.push(newTodo);
    
        // 어느 한 list를 지울때 localstorage는 어느부분이 지워져야하는지 모르기 때문에
        // Date.now()라는 랜덤숫자를 id로 사용하여 구분한다.
        const newTodoObj={
            text:newTodo,
            id: Date.now(),
        }
        makeRoutine.push(newTodoObj);
        toDoPaint(newTodoObj);
        savemakeRoutine();    
    
    
    }
    makeRoutineForm.addEventListener("submit",makeRoutineubmit);
    
    // input에 무언가를 치고  submit힐때마다 일어나는 일들
    function toDoPaint(newTodo){
        // html에 li, span 속성을 만든다.
         const li=document.createElement("li");
    
         // 각각의 li를 구별해주기위해 newTodo id를 넣어준다.
            li.id=newTodo.id;
        
         const span= document.createElement("span");
         // button 속성만들기
         const cancelBtn= document.createElement("button");
         cancelBtn.innerText="X";
    
         // li안에 span을 넣는다.
         li.appendChild(span);
         span.innerText=newTodo.text;
         // li안에 button을 넣는다.
         li.appendChild(cancelBtn);
         // list item(li)들을 todoList에 넣는다.
         makeRoutineList.appendChild(li);
    
         //  X버튼 누르면 일어나는 일들
         cancelBtn.addEventListener('click',deleteListItem);
         
    }
    
    // li 삭제하기
    function deleteListItem(event){
        // target은 클릭된 html element를 보여준다.
        // parentElement는  클릭된 element의 부모, 여기서 부모는 li
       const chosenli=event.target.parentElement;
       // 해당 li 화면에서 제거
       chosenli.remove();
    
        // Filter : localstorage에서 제거되기위해 사용
     // filter는 foreach와 비슷하게 배열의 요소만큼 함수실행
     //  filter에서 실행되는 함수는 
     // return값이 true면 새 배열에 이전 요소들을 모두 포함하는것
     // false면 그 요소는 새 배열에서 제외
       // 여기서 toDo는 makeRoutine배열의 요소들
       // 여기서 chosenli.id의 type이 string이라 비교불가
       // 정수형으로 변환해준다.
       makeRoutine=makeRoutine.filter(toDo=>parseInt(chosenli.id)!==toDo.id);
       // 새 makeRoutine를 localstorage에 저장해준다. 
       savemakeRoutine();
     }
    
    
    // list(makeRoutine) localStorage에 저장하기
     // localStorage에는 오직 text만 넣을 수 있다.
    function savemakeRoutine(){
        // JSON.stringify() :  어떤 타입이든 string으로 변환
        // localStorage에 배열형태로 저장 
        localStorage.setItem("makeRoutine", JSON.stringify(makeRoutine));
     
    }
    
    
    function sayHello(event){
        console.log(`hello ${event}`);
     }
    
    
    
    // localStorage에 있는 내용 로드하기
    const savedmakeRoutine= localStorage.getItem("makeRoutine");
    
    // localStorage의 makeRoutine가 비어있지 않다면
    if(savedmakeRoutine!==null){
    // makeRoutine의 내용을  JSON.pasre하면 array형태를 얻는다.
        const parsedmakeRoutine= JSON.parse(savedmakeRoutine);
        // 새로운 todo값이 이전값을 덮는것을 방지하기위헤
        // 이전 todo값을 makeRoutine에 저장해놓는다. 
        makeRoutine= parsedmakeRoutine;
    
    // forEach(함수): 배열의 각 item마다 sayHello 출력
        // parsedmakeRoutine.forEach(sayHello);
        // parsedmakeRoutine에 있는 요소만큼 toDoPaint 실행
        parsedmakeRoutine.forEach(toDoPaint); // 핵심!!!!!!!
    
      
    
    }


    function makeRoutineNew(){
        

        window.close()
    }