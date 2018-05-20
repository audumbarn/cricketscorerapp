app.controller('tournamentController', ['$scope','$http','$timeout', function ($scope, $http, $timeout){
	
	$scope.addTournament = function() {
		var tournament={};
		
		tournament.tournamentName = $scope.tournamentName;
		tournament.organisedBy = $scope.organisedBy;
		tournament.startDate = $scope.startDate;
		tournament.endDate = $scope.endDate;
		setting={};
		setting.freeHit=$scope.freeHit;
		setting.lbw=$scope.lbw;
		setting.maxOvers=$scope.maxOvers;
		setting.maxOversPerBowler=$scope.maxOversPerBowler;
		setting.noBallRuns=$scope.noBallRuns;
		setting.powerplayOvers=$scope.powerplayOvers;
		setting.wideRuns=$scope.wideRuns;
		
		tournament.tournamentSetting = setting;
		
		
		console.log("before post");
		$http.post( "/tournament",JSON.stringify(tournament)).then(function successCallback(response){
			console.log("posted | success");
			
		}, function errorCallback(response){
			console.log("posted | error | "+response.data);
		});
		console.log("after post");
		
	};
}]);