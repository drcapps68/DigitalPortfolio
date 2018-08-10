angular.module('experienceApp', []).controller('myCtrl', function($scope){
  $scope.companyName = '';
  $scope.jobTitle = '';
  $scope.contactName = '';
  $scope.contactTelephone = '';
  $scope.dates = '';

  // List of Experiences
  $scope.experiences = [
    {id:1, "companyName":"Iron Mountain", "jobTitle":"Safety Coordinator", "contactName":"Matt McGillis", "contactTelephone":"253", "dates":"May 2011 - Jul 2015"},
    {id:2, "companyName":"Green River College", "jobTitle":"IT Help Desk", "contactName":"Kim Olsen", "contactTelephone":"253-833-9111", "dates":"Mar 2016 - Jun 2016"}
  ];
  $scope.edit = true;
  $scope.error = false;
  $scope.incomplete = false;
  $scope.hideform = true;
  $scope.editExperience = function(id){
    $scope.hideform = false;
    if (id == "new"){
      $scope.edit = true;
      $scope.incomplete = true;
      $scope.companyName = '';
      $scope.jobTitle = '';
      $scope.contactName = '';
      $scope.contactTelephone = '';
      $scope.dates = '';
    } else {
      $scope.edit = false;
      $scope.companyName = $scope.experiences[id-1].companyName;
      $scope.jobTitle = $scope.experiences[id-1].jobTitle;
      $scope.contactName = $scope.experiences[id-1].contactName;
      $scope.contactTelephone = $scope.experiences[id-1].contactTelephone;
      $scope.dates = $scope.experiences[id-1].dates;
    }
  };

})
