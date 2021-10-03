$(function(){
    $("#release").click(function(){
        let goods = $("#goods").val()
        let amount = $("#amount").val()
        $.ajax({
            type:"get",
            url:"/api/release-amount?goods="+goods,
            success:function(r){
                if(r.cnt>=amount){
                    $.ajax({
                        type:"patch",
                        url:"/api/release-info?amount="+amount+"&goods="+goods,
                        success:function(r){
                            alert(r.message)
                            $.ajax({
                                type:"get",
                                url:"/api/release-amount?goods="+goods,
                                success:function(r){
                                    if(r.cnt == 0){
                                        $.ajax({
                                            type:"delete",
                                            url:"/api/release-delete-item",
                                            success:function(r){
                                                alert("재고가 모두 소진되었습니다. 입고가 필요합니다.")
                                            }
                                        })
                                    }
                                }
                            })
                        }
                    })
                }
                else{
                    alert("재고가 부족합니다.")
                }
            }
        })
    })
})