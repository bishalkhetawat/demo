angular.module('myApp', []).controller('namesCtrl', function($scope) {
    $scope.names = [
        {name:'Ravi',aboutme:' Change is the charm of life'},
        {name:'Sashank',aboutme:'Work is Worship'},
        {name:'Supraj',aboutme:'Fly like a butterfly Sting like a Bee'}
    ];
});