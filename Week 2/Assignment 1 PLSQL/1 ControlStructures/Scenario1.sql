DECLARE
    v_age NUMBER;
    v_new_interest_rate NUMBER;
BEGIN
    FOR rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
       
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, rec.DOB) / 12);
        
        IF v_age > 60 THEN
            
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = rec.CustomerID;
        END IF;
    END LOOP;
    
    COMMIT;
END;
/
