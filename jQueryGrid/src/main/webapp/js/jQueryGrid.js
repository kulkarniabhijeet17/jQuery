function fillGridOnEvent() {
	$("#jQGrid").html("<table id=\"list\"></table><div id=\"page\"></div>");
	jQuery("#list").jqGrid(
					{
						url : '<%=request.getContextPath()%>/JQGridServlet?q=1&action=fetchData',
						datatype : "json",
						mtype: 'POST',
						height : "auto",
						colNames : [ 'Sr. No.', 'Student Name', 'Student Std.',
								'Student Roll No.', "Action" ],
						colModel : [ {
							name : 'srNo',
							index : 'srNo',
							width : 90,
							sortable : true
						}, {
							name : 'stdName',
							index : 'stdName',
							width : 130,
							sortable : false
						}, {
							name : 'stdStd',
							index : 'stdStd',
							width : 100,
							sortable : false
						}, {
							name : 'stdRollNo',
							index : 'stdRollNo',
							width : 180,
							sortable : false
						}, {
							name : 'view',
							index : 'view',
							width : 100,
							sortable : false
						} ],
						multiselect : false,
						paging : true,
						rowNum : 10,
						rowList : [ 10, 20, 30 ],
						pager : $("#page"),
						loadonce : true,
						gridview: true,
						autoencode: true,
						caption : "Student Details"
					}).navGrid('#page', {
				edit : false,
				add : false,
				del : false
			});
}
jQuery().ready(function() {
	// fillGrid();
});