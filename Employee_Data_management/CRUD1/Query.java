package CRUD1;

public class Query {
	public static String insertEmployessQuery() {
		return"Insert into Employee(eid,ename,email,Job_name,sal,Dept_id,Address)values(?,?,?,?,?,?,?)";
	}

}
