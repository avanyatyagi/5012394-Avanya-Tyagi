CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
    v_interest_rate CONSTANT NUMBER := 0.01; 
BEGIN
   
    UPDATE Accounts
    SET Balance = Balance * (1 + v_interest_rate)
    WHERE AccountType = 'Savings';
    
    
    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Monthly interest applied to all savings accounts.');
END;
/
