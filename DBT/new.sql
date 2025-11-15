
	 select concat(concat(upper(substr(ename, 1, 1)), lower(substr(ename, 2, length(ename)))), '-', job) 
	 from emp;