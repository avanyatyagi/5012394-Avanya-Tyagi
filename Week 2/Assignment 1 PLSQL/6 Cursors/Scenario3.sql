DECLARE
    CURSOR c_loans IS
        SELECT LoanID, InterestRate
        FROM Loans;
        
    v_loan_id Loans.LoanID%TYPE;
    v_current_interest_rate Loans.InterestRate%TYPE;
    v_new_interest_rate CONSTANT NUMBER := 4.5; 
BEGIN
    FOR rec IN c_loans LOOP
        v_loan_id := rec.LoanID;
        v_current_interest_rate := rec.InterestRate;
        
        
        UPDATE Loans
        SET InterestRate = v_new_interest_rate
        WHERE LoanID = v_loan_id;
        
        DBMS_OUTPUT.PUT_LINE('Updated interest rate for loan ID ' || v_loan_id || ' from ' || v_current_interest_rate || ' to ' || v_new_interest_rate);
    END LOOP;
    
    
    COMMIT;
END;
/
