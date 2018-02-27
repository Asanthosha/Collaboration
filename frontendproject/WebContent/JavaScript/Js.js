/**
 * 
 */

var cell=angular.module("app",['ngRoute'])
app.Config(function($routeProvider){
	
	$routeProvider
	.when('/register',{
		templateUrl:'views/reg.html',
		controller:UserController'
	})
	.ortherwise({
		templaterUrl:'view/home.html',
	})
	
})