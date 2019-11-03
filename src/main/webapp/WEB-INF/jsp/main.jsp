<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css"></link>
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/material-design-icons/3.0.1/iconfont/material-icons.min.css"></link>
<link type="text/css" rel="stylesheet" href="/css/app.css"></link>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container-lecture">
		<section class="header">
			<h3 class="headline">시간표 만들기</h3>
		</section>
		<section class="section-nav">
			<form id="search-form" class="form-search">
				<input type="text" placeholder="강의 검색" class="form-control">
				<span><i class="material-icons ic-search">search</i></span>
			</form>
			<ul class="list-lecture">
			</ul>
		</section>

		<section class="section-list">
			<div class="container-xl">
				<div class="table-schedule">
					<div class="timeline">
						<ul>
							<li><span>09:00</span></li>
							<li><span>09:30</span></li>
							<li><span>10:00</span></li>
							<li><span>10:30</span></li>
							<li><span>11:00</span></li>
							<li><span>11:30</span></li>
							<li><span>12:00</span></li>
							<li><span>12:30</span></li>
							<li><span>13:00</span></li>
							<li><span>13:30</span></li>
							<li><span>14:00</span></li>
							<li><span>14:30</span></li>
							<li><span>15:00</span></li>
							<li><span>15:30</span></li>
							<li><span>16:00</span></li>
							<li><span>16:30</span></li>
							<li><span>17:00</span></li>
							<li><span>17:30</span></li>
							<li><span>18:00</span></li>
						</ul>
					</div>

					<div class="table-schedule-subject">
						<ul class="list-lecture-item">
							<li class="timeline-vertical">
								<div class="top-info today">
									<h4 class="day">Mon</h4>
								</div>
								<ul id="mon-class">
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Tue</h4>
								</div>
								<ul id="tue-class">
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Wed</h4>
								</div>

								<ul id="wed-class">
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Thu</h4>
								</div>

								<ul id="thu-class">
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Fri</h4>
								</div>

								<ul id="fri-class">
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</div>
		</section>
	</div>

	<div class="modal fade" id="modal-lecture-info" role="dialog"
		aria-hidden="true">
			<div class="modal-dialog" role="document">
	<div class="modal-content">
		<div class="modal-header">
			<button type="button" class="close" data-dismiss="modal" aria-label="Close">
				<span aria-hidden="true">×</span>
			</button>
		</div>
		<div class="modal-body">
		</div>
		<div class="modal-footer">
			<button type="button" class="btn btn-light" data-dismiss="modal">취소</button>
			<button type="button" class="btn btn-primary" id="enrol-btn" data-dismiss="modal">과목 등록하기</button>
		</div>
	</div>
</div>
	</div>

	<div class="modal fade" id="modal-lecture-task" role="dialog"
		aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">×</span>
					</button>
				</div>
				<div class="modal-body">

				</div>
				<div class="modal-footer">
					<div class="left">
						<button class="btn btn-light-primary" type="button"
							data-toggle="popover" data-trigger="click" data-placement="right"
							data-html="true">메모 등록</button>
					</div>
					<div class="right">
						<button type="button" class="btn btn-light" data-dismiss="modal">확인</button>
						<button type="button" class="btn btn-danger" id="remove-btn" data-dismiss="modal">과목 삭제하기</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="PopoverContent" style="display: none;">
		<h5 class="schedule-title">메모 등록하기</h5>
		<div class="form-group">
			<label class="col-form-label">제목 <input type="text"
				class="form-control" id="recipient-name" placeholder="제목 추가">
			</label>
		</div>
		<div class="form-group">
			<label for="message-text" class="col-form-label">설명</label>
			<textarea class="form-control" id="message-text" placeholder="설명 추가"></textarea>
		</div>
		<button type="button" class="btn btn-primary btn-save">등록</button>
	</div>

</body>


<script src="/js/app.js"></script>

</html>