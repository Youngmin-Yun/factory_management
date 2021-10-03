$(function () {
    $("#release").click(function () {
        location.href="/release"
    })
    $.ajax({
        type: "get",
        url: "/api/inventory-list?item=",
        success: function (r) {
            console.log(r)
            $(".body").html("")
            for (let i = 0; i < r.list.length; i++) {
                let tag =
                    '<tbody>' +
                    '<tr>' +
                    '<td>' + r.list[i].category + '</td>' +
                    '<td>' + r.list[i].goods + '</td>' +
                    '<td>' + r.list[i].amount + '개</td>' +
                    '<td>' + r.list[i].warehousing_date + '</td>' +
                    '<td>' + r.list[i].price + '</td>' +
                    '</tr>' +
                    '</tbody>'
                $(".body").append(tag)
            }
        }
    })
    $("#search").click(function () {
        let item = $("#item").val()
        console.log(item)
        $.ajax({
            type: "get",
            url: "/api/inventory-list?item=" + item,
            success: function (r) {
                console.log(r)
                $(".body").html("")
                for (let i = 0; i < r.list.length; i++) {
                    let tag =
                        '<tbody>' +
                        '<tr>' +
                        '<td>' + r.list[i].category + '</td>' +
                        '<td>' + r.list[i].goods + '</td>' +
                        '<td>' + r.list[i].amount + '개</td>' +
                        '<td>' + r.list[i].warehousing_date + '</td>' +
                        '<td><button class = "release">출고</button></td>' +
                        '</tr>' +
                        '</tbody>'
                    $(".body").append(tag)
                }
                $(".release").click(function () {
                    location.href = "/release"
                })
            }
        })
    })
})