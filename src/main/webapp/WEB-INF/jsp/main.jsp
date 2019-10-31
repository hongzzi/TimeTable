<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css"></link>
<link type="text/css" rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/material-design-icons/3.0.1/iconfont/material-icons.min.css"></link>
<link type="text/css" rel="stylesheet" href="/css/app.css"></link>
<body>
	<div class="container-lecture">
		<section class="header">
			<h3 class="headline">�ð�ǥ �����</h3>
		</section>
		<section class="section-nav">
			<form id="search-form" class="form-search">
				<input type="text" placeholder="���� �˻�" class="form-control">
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
								<ul>
									<li class="lecture-time two-hr hr-11" data-event="lecture-01">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�� ���α׷���</h6>
												<h6 class="lecture-location">���а� 204</h6>
											</div>
											<div class="lecture-noti" data-toggle="tooltip"
												data-placement="top" title=""
												data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
												<i class="material-icons ic-lecture-noti">assignment</i> <span
													class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
											</div>
									</a>
									</li>

									<li class="lecture-time two-hr hr-13" data-event="lecture-02">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title ">���α׷����� ����</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
											<div class="lecture-noti" data-toggle="tooltip"
												data-placement="top" title=""
												data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
												<i class="material-icons ic-lecture-noti">assignment</i> <span
													class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
											</div>

									</a>
									</li>

									<li class="lecture-time hr-16" data-event="lecture-03"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�� ����</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Tue</h4>
								</div>
								<ul>
									<li class="lecture-time two-hr hr-10" data-event="lecture-04">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�ڷ� ����</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a>
									</li>

									<li class="lecture-time hr-12" data-event="lecture-05"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�˰���</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>

									<li class="lecture-time hr-16" data-event="lecture-06"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">��ǻ�� ��Ʈ��ũ</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>
								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Wed</h4>
								</div>

								<ul>
									<li class="lecture-time two-hr hr-10" data-event="lecture-01">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�� ���α׷���</h6>
												<h6 class="lecture-location">���а� 204</h6>
											</div>

									</a>
									</li>

									<li class="lecture-time hr-12" data-event="lecture-07"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�����Ϸ�</h6>
												<h6 class="lecture-location">���а� 602</h6>
											</div>
									</a></li>

									<li class="lecture-time two-hr hr-13" data-event="lecture-02">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title ">���α׷����� ����</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
											<div class="lecture-noti" data-toggle="tooltip"
												data-placement="top" title=""
												data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
												<i class="material-icons ic-lecture-noti">assignment</i> <span
													class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
											</div>

									</a>
									</li>

								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Thu</h4>
								</div>

								<ul>
									<li class="lecture-time two-hr hr-10" data-event="lecture-04">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�ڷ� ����</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
											<div class="lecture-noti" data-toggle="tooltip"
												data-placement="top" title=""
												data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
												<i class="material-icons ic-lecture-noti">assignment</i> <span
													class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
											</div>

									</a>
									</li>

									<li class="lecture-time hr-12" data-event="lecture-05"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�˰���</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>

									<li class="lecture-time hr-15" data-event="lecture-08"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">�����ͺ��̽�</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>

								</ul>
							</li>

							<li class="timeline-vertical">
								<div class="top-info">
									<h4 class="day">Fri</h4>
								</div>

								<ul>
									<li class="lecture-time hr-10" data-event="lecture-09"><a
										href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">������ ���</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
									</a></li>

									<li class="lecture-time two-hr hr-12" data-event="lecture-10">
										<a href="#">
											<div class="lecture-info">
												<h6 class="lecture-title">� ü��</h6>
												<h6 class="lecture-location">����1�� 102</h6>
											</div>
											<div class="lecture-noti" data-toggle="tooltip"
												data-placement="top" title=""
												data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
												<i class="material-icons ic-lecture-noti">assignment</i> <span
													class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
											</div>
									</a>
									</li>
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
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">��</span>
					</button>
				</div>
				<div class="modal-body">
					<h3 class="lecture-title">�� ���α׷���</h3>
					<ul class="lecture-info">
						<li class="lecture-time"><i
							class="material-icons ic-lecture-info">access_alarm</i> <span>����
								�ð� : 09:00 - 10:50 | (��), (��)</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">code</i> <span>������
								�ڵ� : A0000001</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">school</i> <span>���
								���� : ������</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">business</i> <span>���ǽ�
								: ���а� 204</span></li>
					</ul>
					<div class="lecture-description">
						<p class="txt-description">�� ���ǿ����� JSP�� �̿��� �� ��� ���α׷��� ���� ��
							�������� ���� �н��մϴ�. Ư�� �ǽ� ������ �������� ���α׷��� ��ų ��� �� �ǹ� �ɷ��� ���� �� �ֵ��� �մϴ�.
						</p>
					</div>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-light" data-dismiss="modal">���</button>
					<button type="button" class="btn btn-primary">���� ����ϱ�</button>
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
						<span aria-hidden="true">��</span>
					</button>
				</div>
				<div class="modal-body">
					<h3 class="lecture-title">�� ���α׷���</h3>
					<ul class="lecture-info">
						<li class="lecture-time"><i
							class="material-icons ic-lecture-info">access_alarm</i> <span>����
								�ð� : 09:00 - 10:50 | (��), (��)</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">code</i> <span>������
								�ڵ� : A0000001</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">school</i> <span>���
								���� : ������</span></li>
						<li class="lecture-code"><i
							class="material-icons ic-lecture-info">business</i> <span>���ǽ�
								: ���а� 204</span></li>
					</ul>
					<div class="lecture-description">
						<p class="txt-description">�� ���ǿ����� JSP�� �̿��� �� ��� ���α׷��� ���� ��
							�������� ���� �н��մϴ�. Ư�� �ǽ� ������ �������� ���α׷��� ��ų ��� �� �ǹ� �ɷ��� ���� �� �ֵ��� �մϴ�.
						</p>
					</div>

					<div class="lecture-memo">
						<h5 class="memo-header">�޸�</h5>
						<ul>
							<li class="memo-list">
								<div class="memo-content" data-toggle="tooltip"
									data-placement="top" title=""
									data-original-title="���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ ���� ���� �ؽ�Ʈ">
									<i class="material-icons ic-lecture-noti">assignment</i> <span
										class="lecture-noti-title">���� ���� �ؽ�Ʈ</span>
								</div>
								<div class="memo-btn">
									<a href=""><i class="material-icons ic-lecture-noti">delete</i></a>
								</div>
							</li>
						</ul>
					</div>
				</div>
				<div class="modal-footer">
					<div class="left">
						<button class="btn btn-light-primary" type="button"
							data-toggle="popover" data-trigger="click" data-placement="right"
							data-html="true">�޸� ���</button>
					</div>
					<div class="right">
						<button type="button" class="btn btn-light" data-dismiss="modal">Ȯ��</button>
						<button type="button" class="btn btn-danger">���� �����ϱ�</button>
					</div>
				</div>
			</div>
		</div>
	</div>

	<div id="PopoverContent" style="display: none;">
		<h5 class="schedule-title">�޸� ����ϱ�</h5>
		<div class="form-group">
			<label class="col-form-label">���� <input type="text"
				class="form-control" id="recipient-name" placeholder="���� �߰�">
			</label>
		</div>
		<div class="form-group">
			<label for="message-text" class="col-form-label">����</label>
			<textarea class="form-control" id="message-text" placeholder="���� �߰�"></textarea>
		</div>
		<button type="button" class="btn btn-primary btn-save">���</button>
	</div>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<script src="/js/app.js"></script>

</body>


</html>