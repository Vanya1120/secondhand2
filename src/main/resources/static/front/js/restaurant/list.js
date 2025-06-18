window.addEventListener("DOMContentLoaded", function(){
    const { mapLib } = commonLib;

    const el = document.getElementById("map");

    // 현재 위치의 식당 정보 조회
    navigator.geolocation.getCurrentPosition((pos) => {
        const { latitude: lat, logitude: lon }
    })
    fetch('/restaurant/search')
        .then(res => res.json())
        .then(items => console.log(items));
})