var app = angular.module("cricketApp",['ngRoute']);

app.config(function($routeProvider) {
	$routeProvider
	.when("/",{templateUrl: "partials/home.html"})
	.when("/tournament", {templateUrl: "partials/tournament.html", controller: "tournamentController"})
	.otherwise({redirectTo: '/'});
});

app.config(['$locationProvider', function($locationProvider) {
	  $locationProvider.hashPrefix('');
	}]);

app.controller('MainCtrl',['$scope','$http','$timeout', function ($scope, $http, $timeout) {
	console.log("LOADED");
}]);