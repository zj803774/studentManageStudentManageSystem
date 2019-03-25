/**
 * Created by lenovo on 2019/3/22.
 */
$(function(){
    //控制导航栏的点击事件
    $(".submenu li a").on("click",function(){
        var url=$(this).data("url");
        $(".page-content iframe").attr("src","/StudentManageSystem"+url);
    });
})