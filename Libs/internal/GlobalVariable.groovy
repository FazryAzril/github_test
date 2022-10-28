package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object url
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p></p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object Wrong_username
     
    /**
     * <p></p>
     */
    public static Object wrong_password
     
    /**
     * <p></p>
     */
    public static Object facHongKong
     
    /**
     * <p></p>
     */
    public static Object facTokyo
     
    /**
     * <p></p>
     */
    public static Object facSeoul
     
    /**
     * <p></p>
     */
    public static Object progMedicare
     
    /**
     * <p></p>
     */
    public static Object progMedicaid
     
    /**
     * <p></p>
     */
    public static Object ProgNone
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters())
    
            url = selectedVariables['url']
            username = selectedVariables['username']
            password = selectedVariables['password']
            Wrong_username = selectedVariables['Wrong_username']
            wrong_password = selectedVariables['wrong_password']
            facHongKong = selectedVariables['facHongKong']
            facTokyo = selectedVariables['facTokyo']
            facSeoul = selectedVariables['facSeoul']
            progMedicare = selectedVariables['progMedicare']
            progMedicaid = selectedVariables['progMedicaid']
            ProgNone = selectedVariables['ProgNone']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
