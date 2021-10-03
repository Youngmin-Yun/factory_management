$(function(){
    $(".save").click(function(){
        let cate = $(".cate").val()
        if(cate == "" || cate == null || cate == undefined){
            alert("공백은 사용할 수 없습니다.")
            return
        }
        console.log(cate)
        let data = {
            category : cate
        }
        $.ajax({
            type:"post",
            url:"/api/category-input",
            data:JSON.stringify(data),
            contentType:"application/json",
            success:function(r){
                console.log(r)
                alert(r.message)
                location.reload()
            }
        })
    })
    $.ajax({
        type:"get",
        url:"/api/category-list",
        success:function(r){
            console.log(r)
            $(".category").html("")
            for(let i = 0; i<r.list.length; i++){
                let tag = 
                '<div class = "list">'+r.list[i].category+'</div>'+
                '<button class="delete" data-seq="'+r.list[i].seq+'">삭제</button>'
                $(".category").append(tag)
            }
            $(".delete").click(function(){
                let seq = $(this).attr("data-seq")
                $.ajax({
                    type:"delete",
                    url:"/api/category-delete?seq="+seq,
                    success:function(r){
                        alert(r.message)
                        location.reload()
                    }
                })
            })
        }
    })
})