angular.module('poepmodel', []).controller("PoepmodelCtrl", function($scope, $http) {

 $scope.load = function ()  {
   $http.get('poepmodel').
     success(function(data, status, headers, config) {
       $scope.todos = data;
     }).
     error(function(data, status, headers, config) {
       // log error
     });
 };

 $scope.save = function ()  {
   $http.post('poepmodel', angular.toJson($scope.poepmodel)).success(function () {

       console.log("hallo");
       $scope.load();
   });
 };
