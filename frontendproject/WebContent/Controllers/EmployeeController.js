/**
 * EmployeeController
 * EmployeeService=EmployeeService return by factory
 */
app.Controller('EmployeeController',function($scope,EmployeeService){
	//call a function in EmployeeService
	EmployeeService.getAllEmployees().then function(response){
		$scope.employees=response.data
		console.log(response.status)
	},function(response){
		console.log(response.status)
	}
}
})
