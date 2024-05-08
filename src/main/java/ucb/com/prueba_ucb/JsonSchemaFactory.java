// package ucb.com.prueba_ucb;

// import java.io.InputStream;

// import com.networknt.schema.SpecVersion.VersionFlag;
// import java.io.IOException;
// import java.io.InputStream
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration
// import com.fasterxml.jackson.databind.JsonNode;
// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.networknt.schema.JsonSchema;
// import com.networknt.schema.JsonSchemaFactory;
// import com.networknt.schema.SpecVersion.VersionFlag
// import io.swagger.v3.oas.models.media.JsonSchema;

// @Configuration
// public class JsonSchemaFactory {
//     private static final String SCHEMA_LOCATION = "/jsonSchema.json";
//     private final ObjectMapper mapper = new ObjectMapper()
//     @Bean
//     public JsonSchema getJsonSchema() throws IOException {
//     JsonSchemaFactory factory = JsonSchemaFactory.getInstance(VersionFlag.V7)
//         InputStream inputStream = getClass().getResourceAsStream(SCHEMA_LOCATION);
//         JsonNode schemaJson = mapper.readTree(inputStream)
//         JsonSchema jsonSchema = factory.getSchema(schemaJson);
//         jsonSchema.initializeValidators();
//         return jsonSchema;
//     }
//  }
