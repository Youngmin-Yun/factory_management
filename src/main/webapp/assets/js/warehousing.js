$(function () {
    $(".select").change(function () {
        let cate = $(this).find("option:selected").val()
        getCate(cate)
        console.log(cate)
    })

    function getCate(cate) {
        $(".save").click(function () {
            let goods = $("#goods").val()
            let amount = $("#amount").val()
            let date = $("#date").val()
            let price = $("#price").val()
            console.log(date)
            if (goods == null || goods == undefined || goods == "") {
                alert("상품명을 입력해주세요")
                return
            }
            if (amount == "" || amount == null || amount == undefined) {
                alert("수량을 입력해주세요")
                return
            }
            if (date == null || date == "" || date == undefined) {
                alert("날짜를 입력하지 않을 경우 오늘 날짜로 입력됩니다.")
            }
            if (price == null || price == "" || price == undefined){
                alert("단가를 입력해주세요.")
            }
            let data = {
                cate_seq: cate,
                goods: goods,
                amount: amount,
                warehousing_date: date,
                price : price
            }
            if (!confirm("등록하시겠습니까?")) return
            $.ajax({
                type:"get",
                url:"/api/duplication-goods?goods="+goods,
                success:function(r){
                    if(r.status == false){
                        var check = confirm(r.message)
                        if(check){
                            location.href="/inventory"
                        }
                        else{
                            location.reload
                        }
                    }
                    if(r.status == true){
                        $.ajax({
                            type: "post",
                            url: "/api/goods-input",
                            data: JSON.stringify(data),
                            contentType: 'application/json; charset=utf-8',
                            success: function (r) {
                                console.log(r)
                                alert(r.message)
                                location.reload
                            }
                        })
                    }
                }
            })
        })
    }
})