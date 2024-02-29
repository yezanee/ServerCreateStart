package com.group.libraryapp.domain.user.loanhistory;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserLoanHistroyRepository extends JpaRepository<UserLoanHistory, Long> {

    // select * from user_loan_history where book_name =? and is_return = ?
    boolean existByBookNameAndIsReturn(String bookname, boolean isReturn);

    Optional<UserLoanHistory> findByUserIdAndBookName(long userId, String bookName);
}
