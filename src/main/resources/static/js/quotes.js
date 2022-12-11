const quotes=[
    {
        quote1: "오늘부터 운동을 한다고 생각하지말고 새로운 삶을 산다고 생각해야돼 ",
        quote2: "네 삶이 운동이 추가된게 아니고 삶이 변하는거야",
        author: "-김종국-",
      },
      {
        quote1: "성격과 인성은 '표정'에서 드러나고",
        quote2: "생활과 성실함은 '체형'에서 드러난다",
        author: "無",
      },
      {
        quote1:
          "완벽에 관한 것이 아니라 노력에 관한 것이다",
          quote2: "매일매일 노력을 한다면 거기에서 변화가 일어난다",
        author: "-프레드리히 니체-",
      },
      {
        quote1: "진정 위대한 모든 생각은 ",
        quote2: "걷기로부터 나온다",
        author: "Helen Keller",
      },
      {
        quote1: "간단하다",
        quote2: "흔들리면 지방이다",
        author: "-Anold Schwarzenegger-",
      },
      {
        quote1: "오늘부터 1년뒤 당신은",
        quote2: "'그때 시작할걸..' 할지도 모른다",
        author: "-Caren rem-",
      },
      {
        quote1: "독서는 마음을 위한 것이고",
        quote2: "운동은 몸을 위한 것이다",
        author: "-조셉 메디슨-",
      },
      {
        quote1: "몸을 만들고 싶다면 말로 떠들지말고",
        quote2: "하루 30분이라도 체육관에 가라",
        author: "-Jason Statham-",
      },
      {
        quote1: "건강한 신체에 건강한 정신이 깃든다",
        quote2: "",
        author: "-유베 날리스-",
      },
      {
        quote1: "운동은 하루를 짧게하지만 인생을 길게한다",
        quote2: "",
        author: "-김현우-",
      },
    ];

    const quote1= document.querySelector('#quote span:first-child');
    const quote2= document.querySelector('#quote span:nth-child(3)');
    const author= document.querySelector('#quote span:last-child');

    // quotes의 길이만큼 랜덤한 정수 출력 0~9
    const todaysQuote=  quotes[Math.floor(Math.random()*quotes.length)];

    quote1.innerText = todaysQuote.quote1;
    quote2.innerText = todaysQuote.quote2;
    author.innerText = todaysQuote.author;
