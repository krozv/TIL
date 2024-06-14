class SoccerPlayer(object):

    # __ 는 특수한 예약 함수나 변수, 함수명 변경(맨글링)으로 사용
    def __init__(self, name, position, back_number):
        self.name = name
        self.position = position
        self.back_number = back_number