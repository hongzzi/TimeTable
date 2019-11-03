/**
 * 
 */

/*
 * 전체 강좌목록 불러오기
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
					let dayofweek = item.dayofweek;
					let dayStr = "";
					dayofweek.split("").forEach((day)=>{
						dayStr+="("+day+") ";
					});
					let uri = "http://localhost:5000/timetable/rest/courses/detail/"+item.code;
					let $li = $("<li class='card-lecture' code='"+item.code+"'>");
					$li.append("<a class='lecture-title' href="+uri+">"+item.lecture+"</a>"
							+"<h6 class='lecture-time'><i class='material-icons ic-lecture-info'>access_time</i><span>"+item.startTime+":00 - "+(item.endTime-1)+":50 | "+dayStr+"</span></h6>"
							+"<ul class='list-lecture-info'>"
							+"<li>교과목 코드 : "+item.code+"</li>"
							+"<li>담당 교수 : "+item.professor+"</li>"
							+"<li>강의실 : "+item.location+"</li></ul></li>");
					$(".list-lecture").append($li);
				})
			}
		},
		error:function(error){
			alert("오류");
		}
	})
};
list();

$(".form-control").keyup(function(e){
	if(e.keyCode == 13)  (
			search($(this).val())
	); 
});

function search(keyword) {
	$.ajax({
		url:"http://localhost:5000/timetable/rest/courses/search/"+keyword,
		type:"get",
		success:function(resTxt){
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
					let $li = $("<li class='card-lecture' code='"+item.code+"'>");
					$li.append("<a class='lecture-title' href="+uri+">"+item.lecture+"</a>"
							+"<h6 class='lecture-time'><i class='material-icons ic-lecture-info'>access_time</i><span>"+item.startTime+":00 - "+(item.endTime-1)+":50 | "+dayStr+"</span></h6>"
							+"<ul class='list-lecture-info'>"
							+"<li>교과목 코드 : "+item.code+"</li>"
							+"<li>담당 교수 : "+item.professor+"</li>"
							+"<li>강의실 : "+item.location+"</li></ul></li>");
					$(".list-lecture").append($li);
				})
			}
		},
		error:function(error){
			alert("오류");
		}
	})
};

$(document).on("click", ".card-lecture", function() {
	console.log($(this).attr("code"));
	$.ajax({
		url:"http://localhost:5000/timetable/rest/courses/detail/"+$(this).attr("code"),
		type:"get",
		success:function(resTxt){
			if(resTxt.status) {
				let data = resTxt.data;
				console.log(resTxt);
				let dayofweek = data.dayofweek;
				let dayStr = "";
				dayofweek.split("").forEach((day)=>{
					dayStr+="("+day+") ";
				});
				$(".modal-body").empty();
				let $body = $("<h3 class='lecture-title'> "+data.lecture+" </h3>");
				$body.append("<ul class='lecture-info'>"
						+"<li class='lecture-time'><i class='material-icons ic-lecture-info'>access_alarm</i> "
						+"<span>강의 시간 : 0"+data.startTime+":00 - "+(data.endTime-1)+":50 | "+dayStr+"</span></li>"
						+"<li class='lecture-code'><i class='material-icons ic-lecture-info'>code</i> "
						+"<span>교과목 코드 : "+data.code+"</span></li>"
						+"<li class='lecture-code'><i class='material-icons ic-lecture-info'>school</i> "
						+"<span>담당 교수 : "+data.professor+"</span></li>"
						+"<li class='lecture-code'><i class='material-icons ic-lecture-info'>business</i> "
						+"<span>강의실 : "+data.location+"</span></li>"
						+"</ul>"
						+"<div class='lecture-description'> <p class='txt-description'>"+data.description+"</p> </div>");
				$(".modal-body").append($body);
			}
		},
		error:function(error){
			alert("오류");
		}
	})
	$('#modal-lecture-info').modal('show');
})

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