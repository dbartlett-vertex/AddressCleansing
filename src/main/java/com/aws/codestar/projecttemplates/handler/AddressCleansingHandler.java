package com.aws.codestar.projecttemplates.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import com.aws.codestar.projecttemplates.GatewayResponse;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * Handler for requests to Lambda function.
 */
public class AddressCleansingHandler implements RequestHandler<Object, Object> {

    public Object handleRequest(final Object input, final Context context) {
        Map<String, String> headers = new HashMap<>();
        String message;
        
        // Create JSON AddressCleansing return object
        JSONObject json = new JSONObject();
        json.put("Product", "VE");
        json.put("Username", "Pete");
        json.put("Filename", "address.csv");
        json.put("FileFormat", "csv");
        json.put("Delimiter", ",");
        json.put("TextFieldQualifier", "-");
        json.put("ContainsHeaderInformation", true);
        json.put("PreviouslyFormatted", false);
        json.put("CustomerAccountNumber", 12345);
        json.put("CustomerName", "Chaos");
        json.put("RunName", "ChaosAddressCleanse");
        json.put("Description", "Run an address cleanse for Chaos");
        json.put("OverwriteExistingFile", true);

        JSONArray array = new JSONArray();
        JSONObject mapping = new JSONObject();
        mapping.put("StreetLine1Idx", 123);
        mapping.put("StreetLine2Idx", 0);
        mapping.put("CityIdx", 4);
        mapping.put("StateIdx", 5);
        mapping.put("CountyIdx", 5);
        mapping.put("PostalCodeIdx", 5);
        mapping.put("Zip5Idx", 12345);
        mapping.put("Zip4Idx", 6789);
        mapping.put("CountryIdx", 1);
        mapping.put("UserField1Idx", 1);
        mapping.put("UserField2Idx", 1);
        mapping.put("UserField3Idx", 1);
        mapping.put("UserField4Idx", 1);
        mapping.put("UserField5Idx", 1);
        mapping.put("UserField6Idx", 1);
        mapping.put("UserField7Idx", 1);
        mapping.put("UserField8Idx", 1);
        mapping.put("UserField9Idx", 1);
        array.add(item);
        
        json.put("Mapping", array);
        
        message = json.toString();
        
        headers.put("Content-Type", "application/json");
        return new GatewayResponse(message, headers, 200);
    }
}
