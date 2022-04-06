package com.quintrix.jfs;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.quintrix.jfs.models.MessageRole;

public class JSONParser {

  public static void main(String[] args) {

    String jsonStr =
        "{\r\n" + "    \"message\": \"Hello\",\r\n" + "    \"role\": \"admin\"\r\n" + "}";

    Map<String, Object> params = new HashMap<>();
    params.put("message", "Hello \"World\"");
    try {
      MessageRole messageRole = new ObjectMapper().readValue(jsonStr, MessageRole.class);
      Map<String, Object> messageMap = new HashMap<>();

      messageMap = new ObjectMapper().readValue(jsonStr, Map.class);

      System.out.println("Java Map: " + messageMap);

      System.out.println(messageMap.get("message"));

      // System.out.println("Java Map: " + messageRole);

      // System.out.println(messageRole.getMessage());

      if (messageMap.get("message").equals("Hello")) {
        System.out.println("It is Hello");
      } else {
        System.out.println("It is NOT Hello");
      }
    } catch (JsonProcessingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }

}

