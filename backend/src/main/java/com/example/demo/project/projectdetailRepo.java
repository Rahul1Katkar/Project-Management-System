package com.example.demo.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface projectdetailRepo extends JpaRepository<projectdetail, Integer> {

	@Query(value = "SELECT \r\n"
			+ "(select count(*) from  zingalaala.projectdetail)as totalcnt,\r\n"
			+ "(select count(*) from zingalaala.projectdetail where status=\"close\") as closecnt,\r\n"
			+ "(select count(*) from zingalaala.projectdetail where status=\"clear\") as cancelcnt,\r\n"
			+ "(select count(*) from zingalaala.projectdetail where status=\"running\") as runningcnt;",nativeQuery = true)
	statusDetail dashBoardDetail();
}
