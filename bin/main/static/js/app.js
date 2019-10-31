/**
 * 
 */

function list() {
	$.ajax({
		url:"http://localhost:5000/timetable/rest/courses",
		type:"get",
		success:function(resTxt){
			if(resTxt.status) {
				let data = resTxt.data;
				$(".list-lecture").empty();
				$.each(data, function(idx, item) {
					let dayofweek = item.dayofweek.split("");
					let dayStr = "";
					dayofweek.split("").forEach((day)=>{
						res+="("+day
					})
					let uri = "http://localhost:5000/timetable/rest/courses/detail/";
					let $li = $("<li class='card-lecture'>");
					$li.append("<li class='card-lecture'> <a class='lecture-title' href="+uri+item.code+">"+item.lecture+"</a>");
					$li.append("<h6 class='lecture-time'> <i class='material-icons ic-lecture-info'>access_time</i>");
					$li.append("<span>"+item.startTime+":00 - "+item.endTime+":50 | "+(월), (수)+"</span></h6>");
					$li.append("<ul class='list-lecture-info'>");
					$li.append("<li>교과목 코드 : "+item.code+"</li>");
					$li.append("<li>담당 교수 : "+item.professor+"</li>");
					$li.append("<li>강의실 : "+item.location+"</li></ul></li>");
				})
			}
		},
		error:function(error){
			
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