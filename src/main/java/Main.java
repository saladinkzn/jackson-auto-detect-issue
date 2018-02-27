import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;

public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.disable(MapperFeature.AUTO_DETECT_SETTERS);
        objectMapper.disable(MapperFeature.AUTO_DETECT_FIELDS);
        objectMapper.disable(MapperFeature.AUTO_DETECT_GETTERS);
        objectMapper.disable(MapperFeature.AUTO_DETECT_CREATORS);
        objectMapper.disable(MapperFeature.AUTO_DETECT_IS_GETTERS);

        String s = objectMapper.writeValueAsString(new Entity());
        System.out.println(s);

        VisibilityChecker<?> defaultVisibilityChecker = objectMapper.getSerializationConfig()
                .getDefaultVisibilityChecker();

        System.out.println(defaultVisibilityChecker);
    }
}
