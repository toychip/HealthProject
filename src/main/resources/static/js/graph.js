/*
var ctx = document.getElementById('myChart').getContext('2d');
var chart = new Chart(ctx, {
  // 챠트 종류를 선택
  type: 'line',

  // 챠트를 그릴 데이타
  data: {
    labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July'],
    datasets: [{
      label: 'My First dataset',
      backgroundColor: 'transparent',
      borderColor: 'red',
      data: [0, 10, 5, 2, 20, 30, 45]
    }]
  },
  // 옵션
  options: {
    legend: {
    display: false
  },
  title: {
    display : true,
    text: '라인차트 제목'
  }}
});
*/

var options = {
  series: [{
    name: "체중",
    data: [65, 62, 68, 64, 63, 66, 61, 60, 66, 68, 65, 60]
  },
 

],
  chart: {
  height: 350,
  type: 'line',
  zoom: {
    enabled: false
  },
},
dataLabels: {
  enabled: false
},
stroke: {
  width: [5, 7, 5],
  curve: 'straight',
  dashArray: [0, 8, 5]
},
title: {
  text: '내 체중',
  align: 'left'
},
legend: {
  tooltipHoverFormatter: function(val, opts) {
    return val + ' - ' + opts.w.globals.series[opts.seriesIndex][opts.dataPointIndex] + ''
  }
},
markers: {
  size: 0,
  hover: {
    sizeOffset: 6
  }
},
xaxis: {
  categories: ['01 Jan', '02 Jan', '03 Jan', '04 Jan', '05 Jan', '06 Jan', '07 Jan', '08 Jan', '09 Jan',
    '10 Jan', '11 Jan', '12 Jan'
  ],
},
tooltip: {
  y: [
    {
      title: {
        formatter: function (val) {
          return val + " (mins)"
        }
      }
    },
    {
      title: {
        formatter: function (val) {
          return val + " per session"
        }
      }
    },
    {
      title: {
        formatter: function (val) {
          return val;
        }
      }
    }
  ]
},
grid: {
  borderColor: '#f1f1f1',
}
};

var chart = new ApexCharts(document.querySelector("#myChart"), options);
chart.render(); 