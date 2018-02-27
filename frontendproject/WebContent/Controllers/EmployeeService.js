/**
 * Em[ployeeService
 */
app.factory('EmployeeService',function($http) {
	
	var EmployeeService={}
	EmployeeService.getAllEmployee=function() {
		//make http request
		return $http.get("http://localhost:8080/middleware/getall employees")
		//response[data,status]
		
		
	}
	
	return EmployeeService;
})