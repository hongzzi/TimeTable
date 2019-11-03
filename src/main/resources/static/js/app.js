/**
 * 
 */

/*
 * 전체 강좌목록 불러오기
 */
function list() {
	$.ajax({
		url:"/timetable/rest/courses",
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
					let uri = "/timetable/rest/courses/detail/"+item.code;
					let $li = $("<li class='card-lecture' code='"+item.code+"'>");
					$li.append("<a class='lecture-title' href='#'>"+item.lecture+"</a>"
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
			alert("목록을 불러오며 오류가 발생했습니다. 다시시도해주세요!");
		}
	})
};
list();

/**
 * 수강신청한 테이블
 * @returns
 */
function courseTable() {
	$.ajax({
		url:"/timetable/rest/courses/mycourse",
		type:"get",
		success:function(resTxt){
			if(resTxt.status) {
				let data = resTxt.data;
				$("#mon-class").empty();
				$("#tue-class").empty();
				$("#wed-class").empty();
				$("#thu-class").empty();
				$("#fri-class").empty();
				$.each(data, function(idx, item) {
					let dayofweek = item.dayofweek;
					let day = "";					
					if(dayofweek=='월') day = "#mon-class";
					if(dayofweek=='화') day = "#tue-class";
					if(dayofweek=='수') day = "#wed-class";
					if(dayofweek=='목') day = "#thu-class";
					if(dayofweek=='금') day = "#fri-class";
					let time = "";
					if((item.endTime - item.startTime) == 2) time = "two-hr";
					
					$li = $("<li class='lecture-time "+time+" hr-"+item.startTime+"' data-event='lecture-0"+item.code.slice(-1)+"'>"
							+"<a href='#' code='"+item.code+"'>"
							+"<div class='lecture-info'>"
							+"<h6 class='lecture-title'>"+item.lecture+"</h6>"
							+"<h6 class='lecture-location'>"+item.location+"</h6>"
							+"</div>"
							+"<div class='lecture-noti' data-toggle='tooltip'"
							+"data-placement='top' title=''"
							+"data-original-title='과제 설명 텍스트 과제 설명 텍스트 과제 설명 텍스트'>"
							+"<i class='material-icons ic-lecture-noti'>assignment</i>"
							+"<span class='lecture-noti-title'>과제 제목 텍스트</span>"
							+"</div></a></li>"
					);
					
					$(day).append($li);
				})
			}
		},
		error:function(error){
			alert("목록을 불러오며 오류가 발생했습니다. 다시시도해주세요!");
		}
	})
}
courseTable();

/**
 * 검색하기
 * @param e
 * @returns
 */
$(".form-control").keyup(function(e){
	if(e.keyCode == 13)  (
			search($(this).val())
	); 
});

function search(keyword) {
	$.ajax({
		url:"/timetable/rest/courses/search/"+keyword,
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
					let uri = "/timetable/rest/courses/detail/"+item.code;
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
			alert("검색 중 오류가 발생했습니다. 다시시도해주세요!");
		}
	})
};


/**
 * 강좌 상세정보
 * @returns
 */
$(document).on("click", ".card-lecture", function() {
	let code = $(this).attr("code");
	$.ajax({
		url:"/timetable/rest/courses/detail/"+code,
		type:"get",
		success:function(resTxt){
			if(resTxt.status) {
				let data = resTxt.data;
				let dayofweek = data.dayofweek;
				let dayStr = "";
				dayofweek.split("").forEach((day)=>{
					dayStr+="("+day+") ";
				});
				$(".modal-body").empty();
				let $body = $("<h3 class='lecture-title' lecture-code='"+code+"'> "+data.lecture+" </h3>");
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
			alert("강의 정보를 불러오는 중 오류가 발생했습니다. 다시시도해주세요!");
		}
	})
	$('#modal-lecture-info').modal('show');
})

/**
 * 강좌 등록
 * @returns
 */
$(document).on("click", "#enrol-btn", function() {
	
	$.ajax({
		url:"/timetable/rest/courses/enrol",
		type:"post",
		data: JSON.stringify({
			"code": $('.modal-body > .lecture-title').attr("lecture-code"),
		}),
        contentType:"application/json",
		success:function(resTxt) {
			console.log(resTxt);
			courseTable();
		},
		error:function(error) {
			alert("수강신청할 수 없습니다.")
		}
	})
})

/**
 * 수강 중 강좌 상세정보 + 메모
 * @returns
 */
$(document).on("click", ".lecture-time > a", function() {
	let code = $(this).attr("code");
	$.ajax({
		url:"/timetable/rest/courses/detail/"+code,
		type:"get",
		success:function(resTxt){
			if(resTxt.status) {
				let data = resTxt.data;
				let dayofweek = data.dayofweek;
				let dayStr = "";
				dayofweek.split("").forEach((day)=>{
					dayStr+="("+day+") ";
				});
				$(".modal-body").empty();
				let $body = $("<h3 class='lecture-title' lecture-code='"+code+"'> "+data.lecture+" </h3>");
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
						+"<div class='lecture-description'> <p class='txt-description'>"+data.description+"</p> </div>"
						+"<div class='lecture-memo'>"
						+"<h5 class='memo-header'>메모</h5>"
						+"<ul>"
						+"	<li class='memo-list'>"
						+"		<div class='memo-content' data-toggle='tooltip'"
						+"			data-placement='top' title=''"
						+"			data-original-title='과제 설명 텍스트 과제 설명 텍스트 과제 설명 텍스트'>"
						+"			<i class='material-icons ic-lecture-noti'>assignment</i> <span"
						+"				class='lecture-noti-title'>과제 제목 텍스트</span>"
						+"		</div>"
						+"		<div class='memo-btn'>"
						+"			<a href=''><i class='material-icons ic-lecture-noti'>delete</i></a>"
						+"		</div></li></ul></div>");
				$(".modal-body").append($body);
			}
		},
		error:function(error){
			alert("강의 정보를 불러오는 중 오류가 발생했습니다. 다시시도해주세요!");
		}
	})
	
	$('#modal-lecture-task').modal('show');
});

/**
 * 강좌 삭제
 * @returns
 */
$(document).on("click", "#remove-btn", function() {
	let code = $('.modal-body > .lecture-title').attr("lecture-code");
	$.ajax({
		url:"/timetable/rest/courses/mycourse/delete/"+code,
		type:"delete",
		success:function(resTxt) {
			courseTable();
		},
		error:function(error) {
			alert("삭제 중 오류가 발생했습니다.")
		}
	})
})



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