var app = (()=>{
	return{
		init : (ctx)=>{
			playerService.login(ctx);
			playerService.join(ctx);
			playerService.move_join(ctx);
			playerService.backMove(ctx);
		}
		
	};
})();

var player = (()=>{
	var _playerId, _playerName, _teamId, _ePlayerName, _nickname, _joinYyyy,
	_position, _backNo, _nation, _birthDate, _solar, _height, _weight;
	var setPlayerId = (playerId)=>{this._playerId = playerId;}
	var setSolar = (solar)=>{this._solar = solar;}
	var getPlayerId = ()=>{return this._playerId;}
	var getSolar = ()=>{return this._solar;}
	return {
		setPlayerId : setPlayerId,
		setSolar : setSolar,
		getPlayerId : getPlayerId,
		getSolar : getSolar
	};
})();

var playerService = (()=>{
	return{
		login: (ctx)=>{
			$('#login_btn').click(()=>{
				if($('#username').val()===''||
						$('#solar').val()===''){
					alert('필수값이 없습니다')
				}else{
					alert('입력한 ID 값 : '+$('#username').val());
					$('#login_form').attr('action',ctx+'/player.do');
					$('#login_form').submit();
				}
			});
		},
		join: (ctx)=>{
			$('#join_btn').click(()=>{
				if($('#join_playerId').val()===''||
						$('#join_solar').val()===''){
					alert('필수값이 없습니다')
				}else{
					alert('입력한 ID 값 : '+$('#join_playerId').val());
					$('#join_from').attr('action',ctx+'/player.do');
					$('#join_from').submit();
				}
				alert('click 도메인명: '+ctx)
			});
		},
		move_join: (ctx)=>{
			$('#a_join').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=join');
			});
		},
		backMove: (ctx)=>{
			$('#back').click(()=>{
				location.assign(ctx+'/facade.do?action=move&page=login');
			});
		}
	};
})();