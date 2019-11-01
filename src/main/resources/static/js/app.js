/**
 * 
 */

function list() {
	
	$.ajax({
		url:"http://localhost:5000/timetable/rest/courses",
		type:"get",
		success:function(resTxt){
			console.log("ajax");
			if(resTxt.status) {
				let data = resTxt.data;
				$(".list-lecture").empty();
				$.each(data, function(idx, item) {
					let dayofweek = item.dayofweek;
					let dayStr = "";
					dayofweek.split("").forEach((day)=>{
						dayStr+="("+day+") ";
					});
					let uri = "http://localhost:5000/timetable/rest/courses/detail/"+item.code;
					let $li = $("<li class='card-lecture'>");
					$li.append("<li class='card-lecture'> <a class='lecture-title' href="+uri+">"+item.lecture+"</a>");
					$li.append("<h6 class='lecture-time'> <i class='material-icons ic-lecture-info'>access_time</i>");
					$li.append("<span>"+item.startTime+":00 - "+item.endTime+":50 | "+dayStr+"</span></h6>");
					$li.append("<ul class='list-lecture-info'>");
					$li.append("<li>교과목 코드 : "+item.code+"</li>");
					$li.append("<li>담당 교수 : "+item.professor+"</li>");
					$li.append("<li>강의실 : "+item.location+"</li></ul></li>");
					$(".list-lecture").append($li)
				})
			}
		},
		error:function(error){
			alert("오류");
		}
	})
};

list();

$('.card-lecture').click(function() {
	$('#modal-lecture-info').modal('show');
});

$('.lecture-time > a').click(function() {
	$('#modal-lecture-task').modal('show');
});

$(function() {
	$('[data-toggle="tooltip"]').tooltip();
});

$(function() {
	$('[data-toggle="popover"]').popover({
		container : 'body',
		html : true,
		placement : 'right',
		sanitize : false,
		content : function() {
			return $("#PopoverContent").html();
		}
	});
});