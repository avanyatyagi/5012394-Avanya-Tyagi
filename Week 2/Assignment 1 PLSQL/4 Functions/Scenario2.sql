CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment(
    p_loan_amount NUMBER,
    p_interest_rate NUMBER,
    p_duration_years NUMBER
) RETURN NUMBER IS
    v_monthly_interest_rate NUMBER;
    v_number_of_payments NUMBER;
    v_monthly_installment NUMBER;
BEGIN
    
    v_monthly_interest_rate := p_interest_rate / 100 / 12;
    
    v_number_of_payments := p_duration_years * 12;
    
    
    IF v_monthly_interest_rate > 0 THEN
        v_monthly_installment := p_loan_amount * (v_monthly_interest_rate * POWER(1 + v_monthly_interest_rate, v_number_of_payments)) /
                                 (POWER(1 + v_monthly_interest_rate, v_number_of_payments) - 1);
    ELSE
        
        v_monthly_installment := p_loan_amount / v_number_of_payments;
    END IF;

    RETURN v_monthly_installment;
END;
/
