DECLARE
    CURSOR c_transactions IS
        SELECT DISTINCT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE t.TransactionDate >= TRUNC(SYSDATE, 'MM') AND t.TransactionDate < ADD_MONTHS(TRUNC(SYSDATE, 'MM'), 1);
        
    v_customer_id Customers.CustomerID%TYPE;
    v_customer_name Customers.Name%TYPE;
    v_transaction_date Transactions.TransactionDate%TYPE;
    v_amount Transactions.Amount%TYPE;
    v_transaction_type Transactions.TransactionType%TYPE;
BEGIN
    FOR rec IN c_transactions LOOP
        v_customer_id := rec.CustomerID;
        v_customer_name := rec.Name;
        v_transaction_date := rec.TransactionDate;
        v_amount := rec.Amount;
        v_transaction_type := rec.TransactionType;
        
        
        DBMS_OUTPUT.PUT_LINE('Customer: ' || v_customer_name || ' (ID: ' || v_customer_id || ')');
        DBMS_OUTPUT.PUT_LINE('Date: ' || v_transaction_date || ', Amount: ' || v_amount || ', Type: ' || v_transaction_type);
    END LOOP;
END;
/
