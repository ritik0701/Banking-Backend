<<<<<<< HEAD

=======
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd
package com.lti.demo.repository;

import java.util.Date;
import java.util.List;

<<<<<<< HEAD

=======
import com.lti.demo.pojo.Admin;
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd
import com.lti.demo.pojo.Transaction;

public interface TransactionRepository {
	void save(Transaction transaction);
	List<Transaction> getAllRecords(int accNumber);
	List<Transaction> getTransactionBetweenDates(Date fromDate,Date toDate,String accountnumber);
	Object getTransactionById(long transactionId);
<<<<<<< HEAD
}
=======
}
>>>>>>> 9ba854cf10755f54109d0b5213695e6e994292dd
