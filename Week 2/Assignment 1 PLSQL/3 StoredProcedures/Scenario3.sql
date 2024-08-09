CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_account IN NUMBER,
    p_to_account IN NUMBER,
    p_amount IN NUMBER
) IS
    v_from_balance NUMBER;
    v_to_balance NUMBER;
BEGIN
    
    SELECT Balance INTO v_from_balance
    FROM Accounts
    WHERE AccountID = p_from_account;
    
    
    IF v_from_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001, 'Insufficient funds in account ' || p_from_account);
    END IF;

    
    SELECT Balance INTO v_to_balance
    FROM Accounts
    WHERE AccountID = p_to_account;

    
    UPDATE Accounts
    SET Balance = Balance - p_amount
    WHERE AccountID = p_from_account;
    
    UPDATE Accounts
    SET Balance = Balance + p_amount
    WHERE AccountID = p_to_account;
    
    
    COMMIT;
    
    DBMS_OUTPUT.PUT_LINE('Successfully transferred ' || p_amount || ' from account ' || p_from_account || ' to account ' || p_to_account || '.');
END;
/
