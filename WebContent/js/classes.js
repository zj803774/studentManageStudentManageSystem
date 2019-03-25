/**
 * Created by lenovo on 2019/3/24.
 */
$(function(){
    //加载表格
    $("#grid-table").jqGrid({
    	url : $path_base+'/Classes/loadData',
    	datatype : "json",
        colNames : [ 'ID', '班级名称'],
        colModel : [ 
                     {name : 'id',index : 'id',width : 55}, 
                     {name : 'classname',index : 'classname'},                     
                   ],
        rowNum : 10,
        rowList : [ 10, 20, 30 ],
        pager : '#grid-pager',
        sortname : 'id',
        viewrecords : true,
        sortorder : "desc",
        jsonReader : {
          repeatitems : true,
          id : "0"
        },
        caption : "班级列表",
        height : '100%',
        width:"100%",
        autowidth:true,
    });
    //分页模块加载
    $("#grid-table").jqGrid('navGrid', '#grid-pager', {
        edit : true,
        add : true,
        del : true
     });
})